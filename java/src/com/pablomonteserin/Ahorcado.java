package com.pablomonteserin;

public class Ahorcado {

	public static void main (String args[]) {
		char [] letras = getPalabraSecreta();
		char [] guiones = getPalabraConGuiones(letras);
		imprimirConEspaciosEnBlanco(guiones);
	}
	
	static char[] getPalabraSecreta() {
		String [] palabras = {"amor", "odio", "indiferencia"};
		int indice = (int) (Math.random()*palabras.length);
		String palabraSecreta= palabras[indice];
		char [] letrasSecretas = palabraSecreta.toCharArray();
		return letrasSecretas;
	}
	
	static char[] getPalabraConGuiones(char[]psecreta) {
		char [] palabraConGuiones = new char[psecreta.length];
		for(int i = 0; i< palabraConGuiones.length; i++) {
			palabraConGuiones[i] = '_';
		}
		return palabraConGuiones;
	}
	
	static void imprimirConEspaciosEnBlanco(char [] palabra) {
		for(int i = 0; i<palabra.length; i++) {
			System.out.print(palabra[i] + " ");
		}
	}
}
