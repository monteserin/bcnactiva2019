package com.pablomonteserin.comparacionpersonas;

public class SinDatosException extends Exception {

	public SinDatosException() {
		// TODO Auto-generated constructor stub
	}

	public SinDatosException(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public SinDatosException(Throwable arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public SinDatosException(String arg0, Throwable arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	public SinDatosException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void printStackTrace() {
		// TODO Auto-generated method stub
		super.printStackTrace();
		System.out.println("No hay datos! maldicion!!!!");
	}
}
