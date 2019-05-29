package com.pablomonteserin.java;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Siniestro {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private Date fecha;
	private int perdida;
	
	@ManyToOne
	private Vehiculo vehiculo;

	public Siniestro() {
	}

	public Siniestro(Date fecha, int perdida, Vehiculo vehiculo) {
		super();
		this.fecha = fecha;
		this.perdida = perdida;
		this.vehiculo = vehiculo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public int getPerdida() {
		return perdida;
	}

	public void setPerdida(int perdida) {
		this.perdida = perdida;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

}
