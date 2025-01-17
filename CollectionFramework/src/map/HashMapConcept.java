package map;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapConcept {

	public static void main(String[] args) {
		//it contains only unique elements
		//stores the values key-values pairs
		//it may have one null key multiple nulls values
		//it doesn't maintain order
		//it will not store the value based on indexes
		//hash map is not synchronized
		//Concurrent modifition exception -->fail fast condition
		
		HashMap<Integer,String> hs=new HashMap<Integer,String>();
        hs.put(1,"java");
        hs.put(2,"spring");
        hs.put(3,"js");
        hs.put(4,"angular");
        System.out.println(hs);
        //get
        System.out.println(hs.get(3));
        System.out.println(hs.get(5));//return null not given any exception because it not have index
        
        for(Entry m:hs.entrySet()) {
        	System.out.println(m.getKey()+" "+m.getValue());
        }
        //remove 
        hs.remove(3);
        System.out.println(hs);
        System.out.println("===========================");
        HashMap<Integer,Employee> emp=new HashMap<>();
        Employee e1=new Employee("tom",28,"hyd");
        Employee e2=new Employee("monu",29,"abad");
        Employee e3=new Employee("sonu",38,"gaya");

	   emp.put(1,e1);
	   emp.put(2,e2);
	   emp.put(3,e3);
	  for(Entry<Integer,Employee> m:emp.entrySet()) {
		  int key=m.getKey();
		  Employee e=m.getValue();
		  System.out.println(key+" info ");
		  System.out.println(e.name+" "+e.age+" "+e.city);
	  }
	}

}
