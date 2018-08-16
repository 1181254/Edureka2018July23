package co.edureka.bean;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class BeforeAdvice implements MethodBeforeAdvice{

	@Override
	public void before(Method method, Object[] objArr, Object obj) throws Throwable {
		
		System.out.println("==before execution started==");
		
		System.out.println("Method is: "+method.getName()+" Inputs: "+method.getParameterCount());
		
		System.out.println("Inputs:");
		for(Object o : objArr){
			System.out.println(o);
		}
		
		Employee emp = (Employee) obj;
		
		if(emp.desig.equals("NA")){
			System.out.println("==Seat must be allocated and designation should be assigned==");
		}
		
		System.out.println("Reference to the Bean Object: "+obj);
		
		System.out.println("==before execution finished==");
		System.out.println(">>>>>>>>>>>>>><<<<<<<<<<<<<<<");
	}

}
