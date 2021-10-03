package com.uninpahu.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Estudiante implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int estudianteId;
	private String tipoSangre;
	private String rh;
	private String nombreAcudiente;
	private String numeroPasaporte;
	private String parentescoAcudiente;
	private String numeroAcudiente;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "idConveniosInternacionales")
	@JsonBackReference
	private ConveniosInternacionales conveniosInternacionales;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "idUsuario")
	@JsonBackReference
	private Usuario usuario;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "idProgramaAcademico")
	@JsonBackReference
	private ProgramaAcademico programaAcademico;
}
