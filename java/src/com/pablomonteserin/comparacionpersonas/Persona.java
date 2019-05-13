package com.pablomonteserin.comparacionpersonas;

import java.util.Date;

public class Persona {
	private String nombre;
	private String dni;
	private Date fechaNacimiento;

	public Persona() {

	}
	
	

	public Persona(String nombre, String dni, Date fechaNacimiento) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.fechaNacimiento = fechaNacimiento;
	}



	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	

}
