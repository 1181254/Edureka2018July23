package co.edureka.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import co.edureka.model.Employee;

public class AnnotationApp {

	public static void main(String[] args) {
		
		
		Employee emp1 = new Employee();
		emp1.setId(null);
		emp1.setName("Mike");
		emp1.setEmail("mike@example.com");
		emp1.setSalary(40000);
		emp1.setDesignation("HR");

		Employee emp2 = new Employee(null, "Fionna", "fionna@example.com", 67000, "R&D");
		
		System.out.println("=====emp1======");
		System.out.println(emp1);
		
		System.out.println("=====emp2======");
		System.out.println(emp2);
		
		AnnotationConfiguration config = null;
		SessionFactory factory = null;
		Session session = null;
		Transaction transaction = null;
		
		try {
			
			config = new AnnotationConfiguration();
			config.configure(); // Read from Annotations in Employee Class
			
			factory = config.buildSessionFactory();
			
			session = factory.openSession();
			
			//session.save(emp1);
			//session.save(emp2);
			
			for(int i=1;i<=100;i++){
				Employee emp = new Employee(null, "Employee "+i, "employee"+i+"@example.com", (10000+i), "Sales");
				session.save(emp);
			}
			
			transaction = session.beginTransaction();
			
			transaction.commit();
			System.out.println("==Transaction Finsihed==");
		}catch (Exception e) {
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
