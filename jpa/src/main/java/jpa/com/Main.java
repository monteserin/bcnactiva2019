package jpa.com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Main {
    public static void main(String[] args){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("TEST_PERSISTENCE_JPA");
        EntityManager em = emf.createEntityManager();
      
        Customer customer=new Customer("Pablo", "Monteserín");        
        
        try {
            em.getTransaction().begin();
            em.persist(customer);
            em.getTransaction().commit();
            
          
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            em.close();
        }
    }
}