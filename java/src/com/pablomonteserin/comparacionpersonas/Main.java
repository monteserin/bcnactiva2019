package com.pablomonteserin.comparacionpersonas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		String f1 = "24-02-1999";
		String f2 = "10-10-2010";
		String f3 = "11-11-2017";
		Servicio servicio = new Servicio();
		SimpleDateFormat sf = new SimpleDateFormat("dd-MM-yyyy");
		try {
			Date d1 = sf.parse(f1);
			Date d2 = sf.parse(f2);
			Date d3 = sf.parse(f3);
			
			
			Persona p1 = new Persona("Juan", "111111111D",d1);
			Persona p2 = new Persona("Amapola", "222222222D",d2);
			Persona p3 = new Persona("Laura","33423333333D",d3);
			Persona p4 = new Persona("ddd","33334233333D",d3);
			Persona p5 = new Persona("ff","3333dfgdf3333D",d3);
			Persona p6 = new Persona("gg","3333db4233333D",d3);
			Persona p7 = new Persona("Aaaaaaa","3fsgdf3333333D",d3);
			Persona p8 = new Persona("rrrr","333dfgdf33333D",d3);
			
			HashMap<String, Persona> hm = new HashMap<String, Persona>();
//			hm.put(p1.getDni(), p1);
//			hm.put(p2.getDni(), p2);
//			hm.put(p3.getDni(), p3);
//			hm.put(p4.getDni(), p4);
//			hm.put(p5.getDni(), p5);
//			hm.put(p6.getDni(), p6);
//			hm.put(p7.getDni(), p7);
//			hm.put(p8.getDni(), p8);


			Persona viejuna = servicio.getPersonaMayor(hm);
			Persona alfabeticamenteAntes = servicio.getPrimerNombre(hm);
			System.out.println(viejuna.getNombre());
			System.out.println(alfabeticamenteAntes.getNombre());
		} catch (ParseException | SinDatosException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}

}
