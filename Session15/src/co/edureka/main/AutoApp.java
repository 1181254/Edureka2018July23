package co.edureka.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.edureka.model.CB;

public class AutoApp {

	public static void main(String[] args) {
		
		// Spring Way to Have Objects.
		// IOC
				
		ApplicationContext context = new ClassPathXmlApplicationContext("autowire.xml");
		
		CB cb = context.getBean("cb",CB.class);
		cb.getCa().sayHello();

	}

}
