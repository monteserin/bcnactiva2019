package com.pablomonteserin;

public class LasOEstanProhibidasException extends Exception {

	public LasOEstanProhibidasException() {
		// TODO Auto-generated constructor stub
	}

	public LasOEstanProhibidasException(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public LasOEstanProhibidasException(Throwable arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public LasOEstanProhibidasException(String arg0, Throwable arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	public LasOEstanProhibidasException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void printStackTrace() {
		// TODO Auto-generated method stub
		super.printStackTrace();
		System.out.println("Has puesto una o. No mereces vivir.");
	}

}
