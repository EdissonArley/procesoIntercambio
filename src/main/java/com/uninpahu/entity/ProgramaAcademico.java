package com.uninpahu.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ProgramaAcademico implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int programaAcademicoId;
	private String nombrePrograma;
	private String duracion;
	private String snies;
	private String resolucion;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "idFacultad")
	@JsonBackReference
	private Facultad facultad;
	@JsonManagedReference
	@OneToMany (cascade = CascadeType.ALL)
	@JsonIgnore
	@JoinColumn(name = "idProgramaAcademico", referencedColumnName = "programaAcademicoId")
	private List<Estudiante> estudiante;
}
