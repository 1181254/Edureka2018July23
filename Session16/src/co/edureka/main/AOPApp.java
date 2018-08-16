package co.edureka.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.edureka.bean.Employee;

import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.context.ApplicationContext;

public class AOPApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("aop.xml");
		
		//ProxyFactoryBean has to be configured in XML File
		
		Employee emp = context.getBean("empProxy",Employee.class);
		emp.allocateSeat(3, "Java"); // executing a business method
	}

}
