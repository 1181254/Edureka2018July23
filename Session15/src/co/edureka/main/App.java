package co.edureka.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import co.edureka.model.Child;
import co.edureka.model.Employee;
import co.edureka.model.Father;

public class App {

	public static void main(String[] args) {
		
		// Traditionally 
		Employee emp1 = new Employee(101,"John",50000,"john@example.com","Redwood Shores");
		System.out.println("===emp1 details===");
		System.out.println(emp1); // emp1.toString();
		
		// Spring Way:
		// Inversion of Control > We dont create objects and let Spring's IOC Container to create it for us
		
		// 1. BeanFactory
		//Resource resource = new ClassPathResource("employeebean.xml"); // Parse XML file
		//BeanFactory factory = new XmlBeanFactory(resource); // Create and Manage Objects for us
		
		/*
		// Obtaining references to Objects constructed by the BeanFactory 
		Employee emp2 = (Employee)factory.getBean("e1");
		Employee emp3 = factory.getBean("e2",Employee.class);
		
		System.out.println("===emp2 details===");
		System.out.println(emp2);
		
		System.out.println("===emp3 details===");
		System.out.println(emp3);*/
		
		
		// 2. ApplicationContext
		ApplicationContext context = new ClassPathXmlApplicationContext("employeebean.xml");
		
		// Obtaining references to Objects constructed by the BeanFactory 
		/*Employee emp2 = (Employee)context.getBean("e1");
		Employee emp3 = context.getBean("e2",Employee.class);
		
		System.out.println("===emp2 details===");
		System.out.println(emp2);
		
		System.out.println("===emp3 details===");
		System.out.println(emp3);*/
		
		//Employee emp2 = (Employee)context.getBean("e1");
		//System.out.println(emp2);
		
		// Requesting to getBean for same id
		//Employee emp3 = (Employee)context.getBean("e1");
		//System.out.println(emp3);
		
		//Father f = context.getBean("fRef",Father.class);
		//System.out.println(f);
		
		Child c = context.getBean("cRef",Child.class);
		System.out.println(c);
		
		// Closing the Context
		ClassPathXmlApplicationContext cxt = (ClassPathXmlApplicationContext)context;
		cxt.close();
	}

}
