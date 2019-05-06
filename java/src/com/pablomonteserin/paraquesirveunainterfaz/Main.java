package com.pablomonteserin.paraquesirveunainterfaz;

public class Main {
	public static void main(String[] args) {
		ITraducir tp = new ImplementacionITraducir();
		String txtTraducido = tp.traduceAlSpanish("Pablo");
		System.out.println(txtTraducido);
	}
}
