package co.edureka.main;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import co.edureka.model.Certificate;
import co.edureka.model.Manager;

public class OneToManyApp {

	public static void main(String[] args) {
		
		Certificate c1 = new Certificate(null, "OCJP");
		Certificate c2 = new Certificate(null, "CCNA");
		Certificate c3 = new Certificate(null, "AWS");
		Certificate c4 = new Certificate(null, "OCWD");
		Certificate c5 = new Certificate(null, "CCNP");
		
		ArrayList<Certificate> list1 = new ArrayList<Certificate>();
		ArrayList<Certificate> list2 = new ArrayList<Certificate>();
		
		list1.add(c1);
		list1.add(c2);
		list1.add(c3);
		
		list2.add(c4);
		list2.add(c5);
		
		Manager mgr1 = new Manager();
		mgr1.setName("John");
		mgr1.setEmail("john@example.com");
		mgr1.setExperience(10);
		mgr1.setCertificates(list1); // 1 to many
		
		Manager mgr2 = new Manager();
		mgr2.setName("Jennie");
		mgr2.setEmail("jennie@example.com");
		mgr2.setExperience(8);
		mgr2.setCertificates(list2); // 1 to many
		
		
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

			//session.save(mgr2);
			
			Manager mRef = (Manager)session.get(Manager.class, 2);
			System.out.println(mRef);
			
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
