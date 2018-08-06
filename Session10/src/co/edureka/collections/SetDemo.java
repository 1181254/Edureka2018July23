package co.edureka.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		
		// 1. Data is stored using hashing and not as in indexed approach
		// 2. Data is unordered when we print or iterate in HashSet due to Hashing !!
		//HashSet<String> set = new HashSet<String>();
		TreeSet<String> set = new TreeSet<String>();
		set.add("John");    // No Index Here
		set.add("Jennie");
		set.add("Jim");
		set.add("John");    // Trying to add duplicate data
		set.add("Jack");
		set.add("Joe");
		set.add("Sia");
		set.add("Fionna");
		set.add("Sia"); 	// Trying to add duplicate data

		System.out.println("===Set===");
		System.out.println(set);
		
		// we cannot get element as in the list
		// here we need to iterate..
		System.out.println("===Iterator===");
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()){
			String name = itr.next();
			System.out.println(name);
		}
		
		if(set.contains("Jennie")){
			System.out.println("Jennie is in the Set");
		}
		
		set.remove("Jennie");
		
		System.out.println("set size is: "+set.size());
		
	}

}
