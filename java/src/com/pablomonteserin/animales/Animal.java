package com.pablomonteserin.animales;

public class Animal {
	static String sonidoMasLargo="";
	String sonido;
	
	Animal(String sonido){
		this.sonido = sonido;
		compararSonido();

	}
	
	private void compararSonido() {
		if(sonido.length() > sonidoMasLargo.length()) {
			sonidoMasLargo =sonido;
		}
	}
}
