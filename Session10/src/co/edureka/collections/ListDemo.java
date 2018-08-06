package co.edureka.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class ListDemo {

	public static void main(String[] args) {
		
		// 1. Create a Collection : ArrayList
		
		//List list1 = new ArrayList(); 		// Polymorphic 
		ArrayList list1 = new ArrayList();		// Direct Object		| Hetrogeneous in nature
		ArrayList<String> list2 = new ArrayList<String>(); 		//		| Homogeneous in nature
		ArrayList<Employee> list3 = new ArrayList<Employee>();  //		| Homogeneous in nature

		Employee e1 = new Employee();
		e1.eid = 101;
		e1.name = "George";
		
		Employee e2 = new Employee();
		e2.eid = 201;
		e2.name = "Sia";
		
		//2. Add data in Collection
		//list1.add(0,10);		// 0    -> list1.add(new Integer(10));
		list1.add(10);			// 0    -> list1.add(new Integer(10));
		list1.add(2.2);			// 1	-> list1.add(new Double(2.2));
		list1.add("John"); 		// 2
		list1.add("Jennie"); 	// 3 
		list1.add(e1);			// 4
		
		list2.add("John");		// 0
		list2.add("Jennie");
		list2.add("Jim");
		list2.add("Jack");
		list2.add("John");		
		list2.add("Joe");		// n-1
		//list2.add(10);        // err
		
		list3.add(e1);			// 0
		list3.add(e2);			// 1
		
		// 3. Size of List
		System.out.println("list1 size is: "+list1.size());
		System.out.println("list2 size is: "+list2.size());
		System.out.println("list3 size is: "+list3.size());
		
		// 4. Print the list
		System.out.println("==========list1==========");
		System.out.println(list1);
		System.out.println("==========list2==========");
		System.out.println(list2);
		System.out.println("==========list3==========");
		System.out.println(list3);
		
		// 5. get the element at index
		System.out.println("==========get element==========");
		Object obj = list1.get(3);  // Object is parent of all the classes in Java. It can point to any object !!
		String name = list2.get(0); // Homogeneous
		Employee emp = list3.get(1);
		
		System.out.println(obj+" and type is: "+obj.getClass());
		System.out.println(name);
		emp.showEmployee();
		
		// 6. update element in list
		list2.set(2, "Jennie Watson");
		System.out.println(list2);
		
		// 7. remove element in list
		list2.remove(2);
		System.out.println(list2);
		
		// 8. remove all elements
		// list2.clear();
		
		// 9. indexof
		int idx = list2.indexOf("John");
		System.out.println("idx is: "+idx);
		idx = list2.lastIndexOf("John");
		System.out.println("idx is: "+idx);
		
		// 10. contains
		if(list2.contains("John")){
			System.out.println("John is in the list");
		}
		
		// 11. Merge a list
		ArrayList<String> list4 = new ArrayList<String>();
		list4.add("Mike");
		list4.add("Leo");
		list4.add("Fionna");
		list4.add("George");
		
		System.out.println("list2 size is: "+list2.size());
		
		list2.addAll(list4); // add all the elements in list4 into list2
		System.out.println("======after add all=======");
		System.out.println(list2);
		System.out.println(list4);
		
		System.out.println("list2 size is: "+list2.size());
	
		list2.remove(3);
		
		System.out.println("list2 size is: "+list2.size());
		
		//list1.addAll(list3); -> work
		//list2.addAll(list3); -> error
		
		// 12. Read All Operation on list i.e. Iterate in the list
		// 1. for loop
		System.out.println("======for loop=======");
		for(int i=0;i<list2.size();i++){
			String n = list2.get(i);
			System.out.println(n);
		}
		// 2. enhanced for loop
		System.out.println("======enhanced for loop=======");
		for(String elm : list2){
			System.out.println(elm);
		}
		
		System.out.println("---------");
		
		for(Object o : list1){		// Since list1 is hetroegeneous, we shall use Object !!
			System.out.println(o);
		}
		
		System.out.println("---------");
		
		for(Employee e : list3){
			e.showEmployee();
		}
		
		//3. API: Iterator
		System.out.println("======Iterator=======");
		Iterator<String> itr = list2.iterator();
		while(itr.hasNext()){
			String n = itr.next();
			System.out.println(n);
			
			if(n.equals("Joe")){
				itr.remove();
			}
		}
		
		//4. API : ListIterator
		System.out.println("======ListIterator=======");
		ListIterator<String> listItr = list2.listIterator();
		while(listItr.hasNext()){
			String n = listItr.next();
			System.out.println(n);
		}
		System.out.println("----------");
		while(listItr.hasPrevious()){
			String n = listItr.previous();
			System.out.println(n);
		}
		
		//5. API: Enumeration
		System.out.println("======Enumeration=======");
		Enumeration<String> enm = Collections.enumeration(list2);
		while(enm.hasMoreElements()){
			String n = enm.nextElement();
			System.out.println(n);
		}
		
		// Same as ArrayList only difference is that Vector is Synchronized i.e. Thread-Safe
		Vector<String> vector = new Vector<String>();
		vector.add("John");
		vector.add("Jennie");
		vector.add("Jim");
		vector.add("Jack");
		vector.add("Joe");
		
		System.out.println("===vector===");
		System.out.println(vector);
		
	}

}
