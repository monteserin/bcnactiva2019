package com.pablomonteserin.enumeraciones;

import java.util.HashMap;

public class Enumeraciones {

	final static String BAJO = "aaaaaaaaa";

	enum instrumentos {
		GUITARRA(3), TROMPETA(4), BATERIA(5);
		private int valor;

		instrumentos(int valor) {
			this.valor = valor;
		}
	};

	public static void main(String[] args) {
		instrumentos in = instrumentos.GUITARRA;
		System.out.println(in.valor);
	}
}
