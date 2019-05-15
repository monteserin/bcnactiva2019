package com.pablomonteserin.excepcion.hilofalso;

import com.pablomonteserin.hilos.thread.HiloSincronizado;

public class Main {

	
	public static void main(String args[]){
//		Hilo hilo1 = new Hilo();
//		Hilo hilo2 = new Hilo();
//		Hilo hilo3 = new Hilo();
		
		HiloSincronizado hilo1 = new HiloSincronizado();
		HiloSincronizado hilo2 = new HiloSincronizado();
		HiloSincronizado hilo3 = new HiloSincronizado();
			
		hilo1.run();
		hilo2.run();
		hilo3.run();
			
	}

}
