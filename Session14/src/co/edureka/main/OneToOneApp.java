package co.edureka.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import co.edureka.model.Address;
import co.edureka.model.Person;

public class OneToOneApp {

	public static void main(String[] args) {
	
		Address aRef = new Address();
		aRef.setAdrsLine("Country Homes");
		aRef.setCity("Bengaluru");
		aRef.setState("Karnataka");
		aRef.setZipCode(520001);
		
		
		Person pRef = new Person();
		pRef.setName("John Watson");
		pRef.setEmail("john@example.com");
		pRef.setAge(30);
		
		// Has-A Relation | 1 to 1
		pRef.setAddress(aRef);
		aRef.setPerson(pRef);
		
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

			session.save(pRef); // Saving person will also save address
			
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
