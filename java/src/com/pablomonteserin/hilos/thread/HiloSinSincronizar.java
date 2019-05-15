package com.pablomonteserin.hilos.thread;

class HiloSinSincronizar extends Thread {
	static double variable1 = 100;

	public void run() {
		try {
			variable1 -= 10;
			Thread.sleep(500);

			System.out.println("Variable1:" + variable1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
