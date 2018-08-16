package co.edureka.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.edureka.model.Cab;

public class UberApp {

	public static void main(String[] args) {
		
		// Spring Way to Have Objects.
		// IOC
		
		ApplicationContext context = new ClassPathXmlApplicationContext("di.xml");
		Cab c = context.getBean("cRef",Cab.class);
		System.out.println(c);
		
		System.out.println(c.getPassengerNames());

	}

}
