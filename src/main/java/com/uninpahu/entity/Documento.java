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

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Documento implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int documentoId;
	private String cartaMotivacion;
	private String hojaDeVida;
	private String cartaAutorizacion;
	private String cartaCertificado;
	private String cartaInforme;
	private String cartaHomologacion;
	private String cartaAutorizacionDirector;
	private String cartaAceptacionEmpresa;
	private String cartaAceptacionIdiomas;
	private String cartaAceptacionPonencia;
	private String cartaAutorizacionDecano;
	private String cartaInvitacion;
	@JsonManagedReference
	@OneToMany (cascade = CascadeType.ALL)
	@JoinColumn(name = "idDocumento", referencedColumnName = "documentoId")
	private List<Transaccion> transaccion;
}
