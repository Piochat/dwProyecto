package com.koke.app.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "creditos")
public class Credito {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_cliente")
	private int id;

	@Column(name = "monto")
	private float monto;

	@Column(name = "no_pagos")
	private int numPagos;

	@Column(name = "rango_pagos")
	private int rangoPagos;

	@Column(name = "estado")
	private String estado;

	@Column(name = "fecha")
	private Date fecha;

	@Column(name = "multa")
	private float multa;

	@Column(name = "cliente_id")
	private int clienteId;

	@Column(name = "interes_id")
	private int interesId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getMonto() {
		return monto;
	}

	public void setMonto(float monto) {
		this.monto = monto;
	}

	public int getNumPagos() {
		return numPagos;
	}

	public void setNumPagos(int numPagos) {
		this.numPagos = numPagos;
	}

	public int getRangoPagos() {
		return rangoPagos;
	}

	public void setRangoPagos(int rangoPagos) {
		this.rangoPagos = rangoPagos;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public float getMulta() {
		return multa;
	}

	public void setMulta(float multa) {
		this.multa = multa;
	}

	public int getClienteId() {
		return clienteId;
	}

	public void setClienteId(int clienteId) {
		this.clienteId = clienteId;
	}

	public int getInteresId() {
		return interesId;
	}

	public void setInteresId(int interesId) {
		this.interesId = interesId;
	}

}
