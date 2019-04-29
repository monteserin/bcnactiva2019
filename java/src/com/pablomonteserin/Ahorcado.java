package com.pablomonteserin;

public class Ahorcado {

	public static void main (String args[]) {
		char [] letras = obtenerPalabraSecreta();
		System.out.println(letras);	
	}
	
	static char[] obtenerPalabraSecreta() {
		String [] palabras = {"amor", "odio", "indiferencia"};
		int indice = (int) (Math.random()*palabras.length);
		String palabraSecreta= palabras[indice];
		char [] letrasSecretas = palabraSecreta.toCharArray();
		return letrasSecretas;
	}
}
