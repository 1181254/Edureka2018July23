package co.edureka.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import co.edureka.model.LEDTV;
import co.edureka.model.Product;
import co.edureka.model.TV;

public class InheritanceApp {

	public static void main(String[] args) {
		
		Product pRef = new Product();
		pRef.setName("Alpha Bounce");
		pRef.setPrice("Rs. 10000");
		
		TV tRef = new TV();
		tRef.setName("Bravia");
		tRef.setPrice("Rs. 55700");
		tRef.setScreenSize(50);
		
		LEDTV lRef = new LEDTV();
		lRef.setName("Samsung LED");
		lRef.setPrice("Rs. 70000");
		lRef.setScreenSize(60);
		lRef.setType("Curved LED");
		
		Configuration config = null;
		SessionFactory factory = null;
		Session session = null;
		Transaction transaction = null;
		
		try {
			
			config = new Configuration();
			config.configure(); // Parsing hibernate.cfg.xml file
			
			factory = config.buildSessionFactory();
			
			session = factory.openSession();
			
			transaction = session.beginTransaction();

			session.save(pRef);
			session.save(tRef);
			session.save(lRef);
			
			transaction.commit();
			
			System.out.println("==Transaction Finished==");
			
		} catch (Exception e) {
			e.printStackTrace();
			if(transaction!=null){
				transaction.rollback();
			}
		}finally{
			if(session!=null){
				session.close();
			}
		}

	}

}
