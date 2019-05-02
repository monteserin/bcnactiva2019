package com.pablomonteserin.clienteempleado;

public class Main {

	public static void main(String[] args) {
		new Cliente();
		new Cliente();
		new Empleado();
		new Empleado();
		
		System.out.println(Persona.numInstancias);

	}

}
