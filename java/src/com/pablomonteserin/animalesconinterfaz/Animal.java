package com.pablomonteserin.animalesconinterfaz;

public class Animal implements IAnimal{
	static String sonidoMasLargo="";
	String sonido;
	
	Animal(String sonido){
		this.sonido = sonido;
		compararSonido();

	}
	
	 public void compararSonido() {
		if(sonido.length() > sonidoMasLargo.length()) {
			sonidoMasLargo =sonido;
		}
	}

	
}
