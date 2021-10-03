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
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Usuario implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int usuarioId;
	private String nombreUsuario;
	private String apellidoUsuario;
	private String documento;
	private String contrasena;
	private String correo;
	private String direccion;
	private String telefono;
	private String fechaNacimiento;
	private String generoUsuario;

	@OneToMany (cascade = CascadeType.ALL)
	@JsonIgnore
	@JoinColumn(name = "idUsuario", referencedColumnName = "usuarioId")
	@JsonManagedReference
	private List<RolUsuarios> rolUsuarios;
	
	@OneToMany (cascade = CascadeType.ALL)
	@JsonIgnore
	@JoinColumn(name = "idUsuario", referencedColumnName = "usuarioId")
	@JsonManagedReference
	private List<Estudiante> estudiante;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "idCiudad")
	@JsonBackReference
	private Ciudad ciudad;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "idTipoDocumento")
	@JsonBackReference
	private TipoDocumento tipoDocumento;
	
	@JsonManagedReference
	@OneToMany (cascade = CascadeType.ALL)
	@JsonIgnore
	@JoinColumn(name = "idUsuario", referencedColumnName = "usuarioId")
	private List<Transaccion> transaccion;
	
}
