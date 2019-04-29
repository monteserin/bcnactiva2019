package com.pablomonteserin;

import java.util.Scanner;

public class Ahorcado {

	public static void main(String args[]) {
		char[] letras = getPalabraSecreta();
		char[] guiones = getPalabraConGuiones(letras);
		imprimirConEspaciosEnBlanco(guiones);
		Scanner lector = new Scanner(System.in);

		while (true) {
			System.out.println("Introduce una letra");
			char letraIntroducida = lector.next().charAt(0);
			modificaPalabraConGuiones(guiones, letras, letraIntroducida);
			imprimirConEspaciosEnBlanco(guiones);
			boolean haGanado = getHaGanado();
			System.out.println(haGanado);
		}
	}

	static char[] getPalabraSecreta() {
		String[] palabras = { "amor", "odio", "indiferencia" };
		int indice = (int) (Math.random() * palabras.length);
		String palabraSecreta = palabras[indice];
		char[] letrasSecretas = palabraSecreta.toCharArray();
		return letrasSecretas;
	}

	static char[] getPalabraConGuiones(char[] psecreta) {
		char[] palabraConGuiones = new char[psecreta.length];
		for (int i = 0; i < palabraConGuiones.length; i++) {
			palabraConGuiones[i] = '_';
		}
		return palabraConGuiones;
	}

	static void modificaPalabraConGuiones(char[] g, char[] letras, char l) {
		for (int i = 0; i < letras.length; i++) {
			if (letras[i] == l) {
				g[i] = l;
			}
		}
	}

	static void imprimirConEspaciosEnBlanco(char[] palabra) {
		for (int i = 0; i < palabra.length; i++) {
			System.out.print(palabra[i] + " ");
		}
		System.out.println();
	}
	
	static boolean getHaGanado() {
		return true;
	}
}
