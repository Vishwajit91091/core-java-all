package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ConvertHashMap_intoArrayList {

	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<>();
		hm.put(1,"Java");
		hm.put(2,"Python");
		hm.put(3,"c");
		hm.put(4,"react");
		
		hm.forEach((k,v)->System.out.println("key = "+k+" value = "+v));
		Iterator it=hm.entrySet().iterator();

		while(it.hasNext()) {
			Map.Entry m=(Map.Entry)it.next();
			System.out.println(m.getKey()+" "+m.getValue());
		}
		System.out.println("=====================");
		//Convert HashMap Key into ArrayList
		List<Integer> l1=new ArrayList<>(hm.keySet());
		for(Integer i:l1) {
			System.out.println(i);
		}
		System.out.println("=====================");
		//Convert HashMap value into ArrayList
		List<String> l2=new ArrayList<>(hm.values());
		for(String i1:l2) {
			System.out.println(i1);
		}
		
	}

}
