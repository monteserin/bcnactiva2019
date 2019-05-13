package com.pablomonteserin.oca;

public class Jugador {
	private String nombre;
	private int casilla;
	private int turnosRestantes;

	public Jugador(String nombre, int casilla, int turnosRestantes) {
		super();
		this.nombre = nombre;
		this.casilla = casilla;
		this.turnosRestantes = turnosRestantes;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCasilla() {
		return casilla;
	}

	public void setCasilla(int casilla) {
		this.casilla = casilla;
	}

	public int getTurnosRestantes() {
		return turnosRestantes;
	}

	public void setTurnosRestantes(int turnosRestantes) {
		this.turnosRestantes = turnosRestantes;
	}
}
