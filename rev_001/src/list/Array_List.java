package list;

import java.util.ArrayList;
import java.util.Iterator;

public class Array_List 
{
	void meth1() {
		ArrayList<Object> al=new ArrayList<Object>();
		al.add(10);     //maintained insertion order
		al.add("java"); //accept duplicate value
		al.add(null);   //accepts null
		al.add(10);     //accept hectrogenious data
		al.add(87);     //present in java 1.2v 
		al.add(25);     //default capisity 10
		al.add(65);    //increses by half(default capisity*(3/2)+1)
		al.add(12);    //it is not synchronized
		al.add(1);
		System.out.println("al: "+al);
		System.out.println("size: "+al.size());//9
		System.out.println("Is empty: "+al.isEmpty());
		System.out.println("cointains: "+al.contains("java"));
		System.out.println("remove: "+al.remove(5));
		System.out.println("remove: "+al.remove((Object)12));
		System.out.println(al);
		al.add(5,100);
		System.out.println(al);
		System.out.println("get:===>"+al.get(1));//java
		
		System.out.println("=======Retriving the data by using for loop======");
		for(int i=0;i<al.size();i++) {
			
			System.out.print(al.get(i)+" ");
		}
		System.out.println();
		System.out.println("=======Retriving the data by using for-each loop======");
		for(Object o:al) {
			System.out.print(o+" "); 
		}
		System.out.println();
		System.out.println("=======Retriving the data by using iterator method======");
		Iterator<Object> i=al.iterator();
		while(i.hasNext()) {
			System.out.print(i.next()+" ");
		}
	}

	public static void main(String[] args) {
		Array_List aobj=new Array_List();
		aobj.meth1();
	}

}
