package com.pablomonteserin.comparacionpersonas;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class Servicio {

	Persona getPersonaMayor(HashMap<String, Persona> mapa) throws SinDatosException {
		
		if(mapa.isEmpty()) {
			throw new SinDatosException();
		}
		Collection <Persona>personas = mapa.values();

		Iterator<Persona> it = personas.iterator();
		Persona pADevolver = null;

		int i=0;
		while(it.hasNext()) {
			Persona p = it.next();
			if(i==0)pADevolver= p;
			else if(pADevolver.getFechaNacimiento().getTime()>p.getFechaNacimiento().getTime()) {
				pADevolver = p;
			}
			i++;
		}
		return pADevolver;
	}
	
	
	Persona getPrimerNombre(HashMap<String, Persona> mapa) {
		Collection <Persona>personas = mapa.values();

		Iterator<Persona> it = personas.iterator();
		Persona pADevolver = null;

		int i=0;
		while(it.hasNext()) {
			Persona p = it.next();
			if(i==0)pADevolver= p;
			else if(pADevolver.getNombre().compareTo(p.getNombre())>0) {
				pADevolver = p;
			}
			i++;
		}
		return pADevolver;
	}

}
