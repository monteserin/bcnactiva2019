package com.pablomonteserin.animales2;

public abstract class Animal {
	static String sonidoMasLargo="";
	String sonido;
	
	Animal(){
		establecerSonido();
		compararSonido();

	}
	
	private void compararSonido() {
		if(sonido.length() > sonidoMasLargo.length()) {
			sonidoMasLargo =sonido;
		}
	}
	 
	 abstract void establecerSonido();
}
