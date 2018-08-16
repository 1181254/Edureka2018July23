package co.edureka.main;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.hibernate.dialect.MySQLDialect;

import co.edureka.model.Employee;

public class App {

	public static void main(String[] args) {
				
		/*Employee emp1 = new Employee();
		emp1.setId(null);
		emp1.setName("Mike");
		emp1.setEmail("mike@example.com");
		emp1.setSalary(40000);
		emp1.setDesignation("HR");

		Employee emp2 = new Employee(null, "Fionna", "fionna@example.com", 67000, "R&D");
		
		System.out.println("=====emp1======");
		System.out.println(emp1);
		
		System.out.println("=====emp2======");
		System.out.println(emp2);*/
		
		// Data in above objects is temporary. We must save it permanently in DB.
		// We shall user Hibernate which internally will use JDBC
		
		Configuration config = null;
		SessionFactory factory = null;
		Session session = null;
		Transaction transaction = null;
		
		try {
			
			config = new Configuration();
			config.configure(); // Parsing hibernate.cfg.xml file
			
			factory = config.buildSessionFactory();
			
			session = factory.openSession();
			//session1 = factory.openSession();
			
			transaction = session.beginTransaction();
			
			// Insert Operation
			//session.save(emp1);
			//session.save(emp2);
			
			// Retrieve Operation
			//Employee emp = (Employee)session.get(Employee.class, 3);
			//System.out.println(emp);
			
			// Update Operation
			/*emp.setDesignation("Admin");
			emp.setSalary(55750);
			emp.setEmail("mike.f@example.com");
			emp.setName("Mike Flynn");
			
			session.update(emp);*/
			
			// Delete Operation
			//Employee emp = new Employee();
			//emp.setId(3);
			//session.delete(emp);
			
			// Retrieve All
			// 1. HQL (Hibernate Query Language) | Just Like SQL
			/*String hql = "From Employee";
			List<Employee> employees = session.createQuery(hql).list();
			for(Employee emp : employees){
				System.out.println(emp);
			}*/
			
			// SQL Support is also available
			//String sql = "//...";
			//session.createSQLQuery(sql);
			
			// 2. Criteria API
			/*Criteria criteria = session.createCriteria(Employee.class);
			criteria.add(Restrictions.gt("salary", 50000)); // where salary greater than 50000
			List<Employee> employees = criteria.list();
			for(Employee emp : employees){
				System.out.println(emp);
			}*/
			
			
			// Cache Example:
			Employee emp1 = (Employee)session.get(Employee.class, 1);
			Employee emp2 = (Employee)session.get(Employee.class, 2);
			
			System.out.println(emp1);
			System.out.println(emp2);
			
			System.out.println("=======Re Fetching the same data=====");
			
			Employee emp3 = (Employee)session.get(Employee.class, 1);
			Employee emp4 = (Employee)session.get(Employee.class, 2);
			
			System.out.println(emp3);
			System.out.println(emp4);
			
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
