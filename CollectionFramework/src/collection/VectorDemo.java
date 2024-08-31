package collection;

import java.util.Iterator;
import java.util.Vector;

import javax.lang.model.element.Element;

public class VectorDemo
{
	void meth1()
	{
		System.out.println("Implementing Vector");
		Vector<Object> v=new <Object>Vector();
		v.add(10);   //insercertion Order Is maintened
		v.add("Java");//It allows Hectrogenious Data
		v.add(null);   //It allows NUll Value
		v.add(10);   //It allows Duplicate data
		v.add(56);   //It present In java 0.1v (legcy calss) 
		v.add(100);  //It's default capisity is 0
		v.add(96);   //It's increse capacity double
		v.add(36);  //it is synchronyzed
		
		System.out.println("size(): "+v.size());
		System.out.println(v.get(0));
		System.out.println(v.get(v.size()-1)+" ");
		System.out.println("\n");
		
		System.out.println("Retriving the data using for loop");
		for(int i=0;i<=v.size()-1;i++) {
			System.out.print(v.get(i)+" ");
		}
		System.out.println("\n");
		System.out.println("Retriving the data in reverse order using for loop");
		for(int i=v.size()-1;i>=0;i--) {
			System.out.print(v.get(i)+" ");
		}
		System.out.println("\n");
		System.out.println("Retriving the data using for-each loop");
		for(Object o:v) {
			System.out.print(o+" ");
		}
		System.out.println("\n");
		System.out.println("Retriving the data using iterator");
		 Iterator<Object> i=v.iterator();
		 while(i.hasNext()) {
			 System.out.print(i.next()+" ");
		 }
		 System.out.println("\n");
		 System.out.println("Retriving the data using Ennumiration");
		 v.elements();
	}

	public static void main(String[] args) 
	{
	   new VectorDemo().meth1();
	
	}

}
