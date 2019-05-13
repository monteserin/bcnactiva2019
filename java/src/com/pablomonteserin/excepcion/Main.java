package com.pablomonteserin.excepcion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String []args) {
		Main main = new Main();
		try {
			main.generarProblemas();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	 void generarProblemas() throws Exception{

		throw new Exception();

	}
}
