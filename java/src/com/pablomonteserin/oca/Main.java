package com.pablomonteserin.oca;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("¿Cuántas personas van a jugar?");
		Scanner scanner = new Scanner(System.in);
		int j = scanner.nextInt();
		ArrayList<Jugador> jugadores = new ArrayList<Jugador>();// Base de datos

		for (int i = 0; i < j; i++) {
			int numeroJugador = i + 1;
			System.out.println("¿Cómo se llama el jugador " + numeroJugador + "?");
			String nombre = scanner.next();
			Jugador jugador = new Jugador(nombre, 0, 0);
			jugadores.add(jugador);
		}
		int[] ocas = { 5, 9, 14, 18, 23, 27, 32, 36, 41, 45, 50, 54, 59 };

		for (int i = 0; i < j; i++) {
			Jugador hm = jugadores.get(i);
			if(hm.getTurnosRestantes()>0) {
			int posicion = hm.getCasilla();
			int dado = (int) Math.floor(Math.random() * 6 + 1);
			int nuevaPosicion = posicion + dado;

			Hashtable<Integer, Integer> ht = new Hashtable<Integer, Integer>();
			ht.put(5, 9);
			ht.put(9, 14);
			ht.put(14, 18);
			ht.put(18, 23);
			ht.put(23, 27);
			ht.put(27, 32);
			ht.put(32, 36);
			ht.put(36, 41);
			ht.put(41, 45);
			ht.put(45, 50);
			ht.put(50, 54);
			ht.put(54, 59);
			ht.put(59, 63);

			if(nuevaPosicion == 19) {
				hm.setTurnosRestantes(2);
			}
			if(nuevaPosicion == 3) {
				hm.setTurnosRestantes(1);
			}
			if (ht.containsKey(nuevaPosicion)) {
				nuevaPosicion = ht.get(nuevaPosicion);
				i--;
			}

			hm.setCasilla(nuevaPosicion);

			if (nuevaPosicion >= 63) {
				System.out.println(hm.getNombre());
				break;
			}
			if (i == j - 1) {
				i = -1;
			}
			}else {
				hm.setTurnosRestantes(hm.getTurnosRestantes()-1);
			}
		}

	}

}