package com.koke.app.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pagos")
public class Pago {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_pago")
	private int id;

	@Column(name = "fecha_pago")
	private Date fechaPago;

	@Column(name = "monto")
	private float monto;

	@Column(name = "monto_total")
	private float montoTotal;

	@Column(name = "no_pago")
	private int numPago;

	@Column(name = "credito_id")
	private int creditoId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getFechaPago() {
		return fechaPago;
	}

	public void setFechaPago(Date fechaPago) {
		this.fechaPago = fechaPago;
	}

	public float getMonto() {
		return monto;
	}

	public void setMonto(float monto) {
		this.monto = monto;
	}

	public float getMontoTotal() {
		return montoTotal;
	}

	public void setMontoTotal(float montoTotal) {
		this.montoTotal = montoTotal;
	}

	public int getNumPago() {
		return numPago;
	}

	public void setNumPago(int numPago) {
		this.numPago = numPago;
	}

	public int getCreditoId() {
		return creditoId;
	}

	public void setCreditoId(int creditoId) {
		this.creditoId = creditoId;
	}

}
