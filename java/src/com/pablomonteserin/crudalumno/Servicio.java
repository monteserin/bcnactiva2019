package com.pablomonteserin.crudalumno;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Servicio {
	List<Alumno> alumnos = new ArrayList<Alumno>();

	public void crearAlumno(Alumno alumno) {
		alumnos.add(alumno);
	}

	public void actualizaAlumno(Alumno alumnoViejo, Alumno alumnoNuevo) {
		Iterator<Alumno> it = alumnos.iterator();
		while (it.hasNext()) {
			Alumno a = it.next();
			if (a.getNombre().equals(alumnoViejo.getNombre())) {
				a.setNombre(alumnoNuevo.getNombre());
				a.setEdad(alumnoNuevo.getEdad());
			}
		}
	}

	public void borraAlumno(Alumno alumno) {
		Iterator<Alumno> it = alumnos.iterator();
		//int i =0;
		while (it.hasNext()) {
		//	i++;
			Alumno a = it.next();
			if (a.getNombre().equals(alumno.getNombre())) {
				//alumnos.remove(i);
				alumnos.remove(a);
			}
		}
	}

	public List<Alumno> getAlumnos() {
		return alumnos;
	}
}
