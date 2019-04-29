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
			boolean haAcertado = modificaPalabraConGuiones(guiones, letras, letraIntroducida);
			imprimirConEspaciosEnBlanco(guiones);
			
x		}
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

	static boolean modificaPalabraConGuiones(char[] g, char[] letras, char l) {
		boolean hasAcertadoAlgunaLetra = false;
		for (int i = 0; i < letras.length; i++) {
			if (letras[i] == l) {
				g[i] = l;
				hasAcertadoAlgunaLetra = true;
			}
		}
		return hasAcertadoAlgunaLetra;
	}

	static void imprimirConEspaciosEnBlanco(char[] palabra) {
		for (int i = 0; i < palabra.length; i++) {
			System.out.print(palabra[i] + " ");
		}
		System.out.println();
	}
	
	static boolean getHaAcertado() {
		return true;
	}
}
