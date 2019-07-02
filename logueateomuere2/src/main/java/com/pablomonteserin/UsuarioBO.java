package com.pablomonteserin;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class UsuarioBO {

	public UsuarioBO() {
		// TODO Auto-generated constructor stub
	}

	
	public Usuario consultaUsuario(Usuario u) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("TEST_PERSISTENCE_JPA");
        EntityManager em = emf.createEntityManager();
        
        TypedQuery<Usuario> query = em.createQuery("SELECT u from Usuario u WHERE u.nombre=:name AND u.password=:password", Usuario.class);
        query.setParameter("name", u.getNombre());
        query.setParameter("password", u.getPassword());
       Usuario u2 = query.getSingleResult();
       return u2;
	}
}
