package utilidades;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	private static Session session;

	// LO HACEMOS PRIVADO PARA QUE NO SE PUEDAN CREAR INSTANCIAS (PATRON SINGLETON)
	private HibernateUtil() {

	}

	public static void conectar() {
		if (session == null) {
			Configuration configuration = new Configuration().configure();
			SessionFactory sessionFactory = configuration
					.buildSessionFactory(new StandardServiceRegistryBuilder().configure().build());
			session = sessionFactory.openSession();
		}
	}

	public static Session getSession() {
		return session;
	}

	public static void apagar() {
		session.close();
	}
}