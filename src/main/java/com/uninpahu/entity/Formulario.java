package com.uninpahu.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

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

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Formulario implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int formularioId;
	private String nombreCompleto;
	private String apellidos;
	private String nacionalidad;
	private String documentoIdentificacion;		
	private Date fechaNacimiento;
	private String sexo;
	private String tipoSangre;
	private String rh;
	private String direccionResidencia;
	private String telefono;
	private String estadoCivil;
	private String numeroPasaporte;
	private String celular;
	private String nombreAcudiente;
	private String telefonoAcudiente;
	private String parentesco;
	private String facultad;
	private String codigo;
	private String programaAcademico;
	private String semestreAcademico;
	private String jornada;
	private String promedioAcumulado;
	private String idiomas;
	private String institucionExterior;
	private String pais;
	private String cuidad;
	private Date fechaSalida;
	private Date fechaRegreso;
	private String duracionPrograma;
	private String fuenteFinanciacion;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "idEstado")
	@JsonBackReference
	private Estado estado;
	
	
	
	
	
}
