package co.edureka.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		//HashMap map1 = new HashMap(); // Hetrogeneous : Use Object class
		map.put(101, "John"); // API: Entry -> (101, "John") i.e. key value pair
		map.put(333, "Jim");
		map.put(231, "Jennie");
		map.put(145, "Joe");
		map.put(567, "Jack");
		
		System.out.println("=====map=====");
		System.out.println(map);
		
		String name = map.get(231);
		System.out.println("name is: "+name);
	
		// using the same key shall update the value
		map.put(231, "Fionna"); // Map cannot have duplicate keys.
	
		map.put(null,"Leo"); // allows null key
		map.put(111, null);  // allows null values
		map.put(678, "Jack"); // allows duplicate values but not keys
		
		System.out.println("=====map=====");
		System.out.println(map);
		
		//map.remove(231);
		//map.clear();
		
		if(map.containsKey(333)){
			System.out.println("333 is in the map as a key");
		}
		
		if(map.containsValue("Jack")){
			System.out.println("Jack is in the map as a value");
		}
		
		Set<Integer> set = map.keySet(); // Reading all the keys in map
		System.out.println("===set===");
		System.out.println(set);
		
		System.out.println("===1. Iterating===");
		Iterator<Integer> itr = set.iterator();
		while(itr.hasNext()){
			Integer key = itr.next();
			String value = map.get(key);
			System.out.println("key is: "+key+" value is: "+value);
		}
		
		System.out.println("===2. Iterating===");
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		Iterator<Entry<Integer, String>> itr1 = entrySet.iterator();
		while(itr1.hasNext()){
			Entry<Integer, String> entry = itr1.next();
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		
		// Thread-Safe i.e. Synchronized
		Hashtable<Integer, String> table = new Hashtable<Integer, String>();
		table.put(101, "John"); // API: Entry -> (101, "John") i.e. key value pair
		table.put(333, "Jim");
		table.put(231, "Jennie");
		table.put(145, "Joe");
		table.put(567, "Jack");
		
		//table.put(null, "Sia"); // not allowd -> Run Time Error
		//table.put(111, null);     // not allowd -> Run Time Error
		
		System.out.println("===table====");
		System.out.println(table);
		
		// Cmbinations can be done
		//ArrayList<HashMap<Integer, String>> list1;
		//HashMap<Integer, ArrayList<String>> map1;
		//HashMap<Integer, HashMap<Integer,String>> map2;
		
		HashMap<Integer, Employee> map3 = new HashMap<>();
		Employee e = new Employee();
		e.eid = 101;
		e.name = "John Watson";
		map3.put(111, e);
	}

}
