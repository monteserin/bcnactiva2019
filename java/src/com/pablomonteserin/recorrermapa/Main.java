package com.pablomonteserin.recorrermapa;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		Persona p1 = new Persona("nombre1", "dni1");
		Persona p2 = new Persona("nombre2", "dni2");
		Persona p3 = new Persona("nombre3", "dni3");
			
		Map<String, Persona> map = new HashMap<String, Persona>();
		map.put(p1.getDni(), p1);
		map.put(p2.getDni(), p2);
		map.put(p3.getDni(), p3);
		
		Collection <Persona> personas = map.values();
		
		Iterator <Persona>it = personas.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next().getNombre());
		}

	}

}
