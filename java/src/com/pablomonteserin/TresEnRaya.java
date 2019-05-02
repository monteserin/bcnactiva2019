package com.pablomonteserin;

import java.util.Scanner;

public class TresEnRaya {

	public static void main(String[] args) {
		char [] tablero = {' ',' ',' ',' ',' ',' ',' ',' ',' '};
		showTablero(tablero);
		Scanner lector = new Scanner(System.in);
		char jugador = 'X';
		boolean haGanado =false;
		while(!haGanado) {
			System.out.println("¿A dónde quieres mover?");
			String posicion = lector.nextLine();
			int pos = Integer.parseInt(posicion);
			tablero[pos] = jugador;
			showTablero(tablero);
			jugador = jugador=='X'?'O':'X';
			
			if(haGanadoAlguien(tablero)) {
				System.out.println("Muy bien!");
				haGanado=true;
			}		
		}
	}
	
	static void showTablero(char [] tablero) {
		System.out.println(tablero[0] + "|" + tablero[1]+ "|"+tablero[2]);
		System.out.println(tablero[3] + "|" + tablero[4]+ "|"+tablero[5]);
		System.out.println(tablero[6] + "|" + tablero[7]+ "|"+tablero[8]);
	}
	
	static boolean haGanadoAlguien(char [] tablero) {
		if(tablero[0] == tablero[1] && tablero[0]==tablero[2]&& tablero[0]!=' ') {
			return true;
		}else if(tablero[3] == tablero[4] && tablero[3]==tablero[5]&& tablero[3]!=' ') {
			return true;
		}else if(tablero[6] == tablero[7] && tablero[6]==tablero[8]&& tablero[6]!=' ') {
			return true;
		}else          if(tablero[0] == tablero[3] && tablero[0]==tablero[6]&& tablero[0]!=' ') {
			return true;
		}else if(tablero[1] == tablero[4] && tablero[1]==tablero[7]&& tablero[1]!=' ') {
			return true;
		}else if(tablero[2] == tablero[5] && tablero[2]==tablero[8]&& tablero[2]!=' ') {
			return true;
		}    else if(tablero[0] == tablero[4] && tablero[0]==tablero[8]&& tablero[0]!=' ') {
			return true;
		}else if(tablero[2] == tablero[4] && tablero[2]==tablero[6]&& tablero[2]!=' ') {
			return true;
		}
		return false;
	}
}
