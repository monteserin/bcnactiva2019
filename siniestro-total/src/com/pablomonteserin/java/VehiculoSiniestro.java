package com.pablomonteserin.java;

public class VehiculoSiniestro {

	private Vehiculo vehiculo;
	private Siniestro siniestro;
	
	
	public VehiculoSiniestro(Vehiculo vehiculo, Siniestro siniestro) {
		super();
		this.vehiculo = vehiculo;
		this.siniestro = siniestro;
	}
	public Vehiculo getVehiculo() {
		return vehiculo;
	}
	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
	public Siniestro getSiniestro() {
		return siniestro;
	}
	public void setSiniestro(Siniestro siniestro) {
		this.siniestro = siniestro;
	}
	
	

}
