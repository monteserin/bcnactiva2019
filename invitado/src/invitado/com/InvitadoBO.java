package invitado.com;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class InvitadoBO {

	public void alta(Invitado invitado) {
		Session session = HibernateSingleton.getInstance();
		Transaction transaction = session.beginTransaction();
	
				
		session.save(invitado);
		transaction.commit();
		session.close();
	}

}
