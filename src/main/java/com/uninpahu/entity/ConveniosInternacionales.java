package com.uninpahu.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ConveniosInternacionales implements Serializable {/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private int conveniosInternacionalesId;
	private String universidadConvenio;
	private String paisConvenio;
	private String descripcion;
	@JsonManagedReference
	@OneToMany (cascade = CascadeType.ALL)
	@JsonIgnore
	@JoinColumn(name = "idConveniosInternacionales", referencedColumnName = "conveniosInternacionalesId")
	private List<Estudiante> estudiante;
}
