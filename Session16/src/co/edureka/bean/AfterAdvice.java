package co.edureka.bean;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class AfterAdvice implements AfterReturningAdvice{

	@Override
	public void afterReturning(Object obj1, Method method, Object[] objArr, Object obj2) throws Throwable {
		
		System.out.println("==after execution started==");
		
		System.out.println("Method is: "+method.getName()+" Inputs: "+method.getParameterCount());
		
		System.out.println("Inputs:");
		for(Object o : objArr){
			System.out.println(o);
		}
		
		System.out.println("Reference to the Bean Object1: "+obj1);
		System.out.println("Reference to the Bean Object2: "+obj2);
		
		System.out.println("==after execution finished==");
		System.out.println(">>>>>>>>>>>>>><<<<<<<<<<<<<<<");
	}

}
