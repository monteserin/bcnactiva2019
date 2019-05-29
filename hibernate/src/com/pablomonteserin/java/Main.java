package com.pablomonteserin.java;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {

public static void main(String[] args) {
	Session session = HibernateUtil.getSessionFactory().openSession();
	Transaction transaction = session.beginTransaction();
	Libro al = new Libro();
	al.setTitulo("Juan");
	al.setPrecio(10);
			
	session.save(al);
	
	transaction.commit();
	session.close();
}


}
