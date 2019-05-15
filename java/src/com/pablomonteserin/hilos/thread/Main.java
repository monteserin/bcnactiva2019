package com.pablomonteserin.hilos.thread;

public class Main {

	
	public static void main(String args[]){
		HiloSinSincronizar hilo1 = new HiloSinSincronizar();
		HiloSinSincronizar hilo2 = new HiloSinSincronizar();
		HiloSinSincronizar hilo3 = new HiloSinSincronizar();
			
		hilo1.start();
		hilo2.start();
		hilo3.start();
			
	}

}
