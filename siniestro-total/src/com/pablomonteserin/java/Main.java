package com.pablomonteserin.java;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {

	public static void main(String[] args) {
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction transaction = session.beginTransaction();
			List<Siniestro> siniestros1 = new ArrayList<Siniestro>();

			Vehiculo vehiculo1 = new Vehiculo("111111",3,4,"Opel");
			//Vehiculo vehiculo2 = new Vehiculo("222222",3,4,"55555");
			SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
			siniestros1.add(new Siniestro(s.parse("10-10-2010"), 1000, vehiculo1));
			//siniestros1.add(new Siniestro(s.parse("10-10-2012"), 1000, vehiculo2));
			vehiculo1.setSiniestros(siniestros1);
			session.save(vehiculo1);
			transaction.commit();
			session.close();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
