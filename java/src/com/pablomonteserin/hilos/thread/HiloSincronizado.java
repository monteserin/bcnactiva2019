package com.pablomonteserin.hilos.thread;

public class HiloSincronizado extends Thread{

		static String mutex = new String();
		static double variable = 100;
		public void run() {
			//El parámetro del siguiente método es un objeto (un Object, un String, un Integer...) no nulo sobre el cual se va a sincronizar.EL objeto mutex sería una especie de guardia de tráfico que decide quien pasa y quien no
			synchronized(mutex){ 
				try {
					variable-=10;			//90 80 70
					Thread.sleep(500);
					
					System.out.println("Variable1:" + variable);
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

