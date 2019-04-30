package com.pablomonteserin;

public class TresEnRaya {

	public static void main(String[] args) {
		char [] tablero = {' ',' ',' ',' ',' ',' ',' ',' ',' '};
		showTablero(tablero);
	}
	
	static void showTablero(char [] tablero) {
		System.out.println(tablero[0] + "|" + tablero[1]+ "|"+tablero[2]);
		System.out.println(tablero[3] + "|" + tablero[4]+ "|"+tablero[5]);
		System.out.println(tablero[6] + "|" + tablero[7]+ "|"+tablero[8]);

	}
}
