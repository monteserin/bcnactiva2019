package com.pablomonteserin.crudalumno;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner lector = new Scanner(System.in);
		Servicio servicio = new Servicio();
		while (true) {
			System.out.println("1 - Add alumno");
			System.out.println("2 - Borrar alumno");
			System.out.println("3 - Modificar Alumno");
			System.out.println("4 - Listar alumnos");

			int opcion = lector.nextInt();

			if (opcion == 1) {
				System.out.println("Introduce el nombre");
				String nombre = lector.next();
				System.out.println("Introduce la edad");
				int edad = lector.nextInt();
				
				Alumno a = new Alumno();
				a.setEdad(edad);
				a.setNombre(nombre);
				servicio.crearAlumno(a);
				
			} else if (opcion == 2) {
				System.out.println("Introduce el nombre");
				String nombre = lector.next();
				Alumno alumno = new Alumno();
				alumno.setNombre(nombre);
				servicio.borraAlumno(alumno);
			} else if (opcion == 3) {
				
				System.out.println("Introduce el nombre original");
				String nombre1 = lector.next();
				Alumno a1 = new Alumno();
				a1.setNombre(nombre1);
				
				
				System.out.println("Introduce el nuevo nombre");
				String nombre2 = lector.next();
				
				System.out.println("Introduce la nueva edad");
				int edad2 = lector.nextInt();
				Alumno a2 = new Alumno();
				a2.setNombre(nombre2);
				a2.setEdad(edad2);
				
				servicio.actualizaAlumno(a1, a2);

			} else if (opcion == 4) {
				List<Alumno> alumnos = servicio.getAlumnos();
				Iterator <Alumno>it = alumnos.iterator();
				while(it.hasNext()) {
					Alumno a = it.next();
					System.out.println(a.getNombre());
				}
			}

		}
	}
}
