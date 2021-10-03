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

import lombok.Data;


@Entity
@Data
public class Rol implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int rolId;
	private String nombreRol;
	private String descripcion;
	@OneToMany (cascade = CascadeType.ALL)
	@JsonIgnore
	@JoinColumn(name = "idRol", referencedColumnName = "rolId")
	@JsonManagedReference
	private List<RolUsuarios> rolUsuarios;
}
