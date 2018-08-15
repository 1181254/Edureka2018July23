package co.edureka.model;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class PostProcessor implements BeanPostProcessor{

	@Override
	public Object postProcessAfterInitialization(Object obj, String beanName) throws BeansException {
		System.out.println("==postProcessAfterInitialization== "+beanName);
		
		// Manipulating the data
		Employee emp = (Employee)obj;
		emp.setName("Jennie Watson");
		
		return obj;
	}

	@Override
	public Object postProcessBeforeInitialization(Object obj, String beanName) throws BeansException {
		System.out.println("==postProcessBeforeInitialization== "+beanName);
		return obj;
	}

}
