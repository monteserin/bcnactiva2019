package com.pablomonteserin.java;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;


public class Main2 {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		
		System.out.println("******** Listar las matrículas de todos los vehículos.");
		Query<String> hqlQuery = session.createQuery("SELECT v.matricula FROM Vehiculo v");
		List<String> matriculas = hqlQuery.list();
		
		
		
		Iterator<String> it = matriculas.iterator();
		while(it.hasNext()) {
			String matricula = it.next();
			System.out.println(matricula);
		}

		
		System.out.println("******** Listar la matrícula y la marca de todos los vehículos ordenados por número de ruedas.");
		Query<Vehiculo> hqlQuery2 = session.createQuery("SELECT v FROM Vehiculo v ORDER BY v.ruedas");
		List<Vehiculo> vehiculos = hqlQuery2.list();
		Iterator<Vehiculo> it2 = vehiculos.iterator();
		while(it2.hasNext()) {
			Vehiculo vehiculo = it2.next();
			System.out.println(vehiculo.getMatricula() + " - "+ vehiculo.getMarca());
		}
		
		
		System.out.println("******** Listar la matrícula de todos los vehículos que tengan más de dos asientos y más de dos ruedas.");
		Query<Vehiculo> hqlQuery3 = session.createQuery("SELECT v FROM Vehiculo v WHERE v.asientos > 2 AND v.ruedas >2");
		List<Vehiculo> vehiculos3 = hqlQuery3.list();
		Iterator<Vehiculo> it3 = vehiculos3.iterator();
		while(it3.hasNext()) {
			Vehiculo vehiculo = it3.next();
			System.out.println(vehiculo.getMatricula() );
		}
		
		
		System.out.println("******** Listar la matrícula de todos los vehículos que tengan más de dos asientos o más de dos ruedas.");
		Query<Vehiculo> hqlQuery4 = session.createQuery("SELECT v FROM Vehiculo v WHERE v.asientos > 2 OR v.ruedas >2");
		List<Vehiculo> vehiculos4 = hqlQuery4.list();
		Iterator<Vehiculo> it4 = vehiculos4.iterator();
		while(it4.hasNext()) {
			Vehiculo vehiculo = it4.next();
			System.out.println(vehiculo.getMatricula() );
		}
		
		
		
		
		System.out.println("******** Listar la matrícula de todos los vehículos que tengan una matrícula de menos de seis caracteres (where length(v.matricula)<?)");
		Query<Vehiculo> hqlQuery5 = session.createQuery("SELECT v FROM Vehiculo v WHERE length(v.matricula)<(:condicion)");
		hqlQuery5.setParameter("condicion", 6);

		List<Vehiculo> vehiculos5 = hqlQuery5.list();
		Iterator<Vehiculo> it5 = vehiculos5.iterator();
		while(it5.hasNext()) {
			Vehiculo vehiculo = it5.next();
			System.out.println(vehiculo.getMatricula() );
		}
		
		
		
		System.out.println("******** Listar la matrícula de todos los vehículos que hayan tenido un siniestro con perdida mayor de 1000 euros.");
		Query<Vehiculo> hqlQuery6 = session.createQuery("SELECT v FROM Vehiculo v JOIN v.siniestros s WHERE s.perdida >1000");

		List<Vehiculo> vehiculos6 = hqlQuery6.list();
		Iterator<Vehiculo> it6 = vehiculos6.iterator();
		while(it6.hasNext()) {
			Vehiculo vehiculo = it6.next();
			System.out.println(vehiculo.getMatricula() );
		}
		
		
		
		System.out.println("******** Listar la matrícula de todos los vehículos que hayan tenido un siniestro con perdida mayor de 1000 euros. Mostrar a cuanto ascendió la pérdida. ");
		Query<VehiculoSiniestro> hqlQuery7 = session.createQuery("SELECT new com.pablomonteserin.java.VehiculoSiniestro(v,s) FROM Vehiculo v JOIN v.siniestros s WHERE s.perdida >1000");

		List<VehiculoSiniestro> vehiculos7 = hqlQuery7.list();
		Iterator<VehiculoSiniestro> it7 = vehiculos7.iterator();
		while(it7.hasNext()) {
			VehiculoSiniestro vs = it7.next();
			System.out.println(vs.getVehiculo().getMatricula() + " - " + vs.getSiniestro().getPerdida() );
		}
		
		
		
		
		session.close();
	}
}
