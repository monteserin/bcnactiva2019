package invitado.com;


import javax.persistence.EntityManagerFactory;

import org.hibernate.Session;

public class HibernateSingleton {
	private static Session session;
	private HibernateSingleton() {
		session = HibernateUtil.getSessionFactory().openSession();
	}
	
	public static Session getInstance() {
		if(session==null) {
			new HibernateSingleton();
		}
		return session;
	}
	
//	EntityManager em = emf.createEntityManager();
	
}
