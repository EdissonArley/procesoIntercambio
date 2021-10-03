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

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Transaccion implements Serializable{/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int transaccionId;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "idDocumento")
	@JsonBackReference
	private Documento documento;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "idUsuario")
	@JsonBackReference
	private Usuario usuario;

}
