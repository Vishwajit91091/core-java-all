package map;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTableConcept {

	public static void main(String[] args) {
		//it is similar to HashMap but it is synchronized
		//store the value in basics on key value
		//key --->Object Value-->Hashcode
		
		Hashtable h1=new Hashtable();
		h1.put(1,"ram");
		h1.put(2,"sita");
		h1.put(3,"shyam");
		
		//creat a clone/ shallo copy
		Hashtable h2=new Hashtable();
		h2=(Hashtable)h1.clone();

		System.out.println("the value of h1: "+h1);
		System.out.println("the value of h2: "+h2);
		
		h1.clear();
		System.out.println("the value of h1: "+h1);
		System.out.println("the value of h2: "+h2);
		
		//contains value
		Hashtable ht=new Hashtable();
		ht.put("A","java");
		ht.put("B","Python");
		ht.put("C","React");
		
		if(ht.containsValue("java"))
			System.out.println("value is found");
		
		//print All the value using enumeration ---elements()
		
		Enumeration e=ht.elements();
		System.out.println("Print value from ht====");
		
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
		//get all the values from hashtable using Entry set
		
		System.out.println("Print values from ht using entrySet");
		Set s=ht.entrySet();
		System.out.println(s);
		
		//check the both hashtables are equals or not
		System.out.println(ht.equals(h1));
		
		//get the value from a key
		System.out.println(ht.get("A"));
		
		//get the hashcode from hashtable object
		System.out.println(ht.hashCode());
		
		
		
		
	}

}
