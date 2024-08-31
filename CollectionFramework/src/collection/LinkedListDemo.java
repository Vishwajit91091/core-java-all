package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo
{
	void meth()
	{
		System.out.println("Implementing LinkedList");
	    LinkedList<Object> ll=new LinkedList<Object>();
	   ll.add(10);  //Insertion Order Is Maintened 
	   ll.add("Java"); //It's Support Hectrogenious Data 
	   ll.add(null); //It's allowed null values
	   ll.add(10);   //It's allows duplicate data
	   ll.add(1);    //It is Present on java 1.2v
	   ll.add(100);  //It's default size is 0
	   ll.add(52);   //Is's increases the value
	   ll.add(60);  //It is not Synchronized
	   
	   System.out.println(ll+" ");
	   System.out.println("size(): "+ll.size());
	   System.out.println("get(): "+ll.get(0));
	   System.out.println("get(): "+ll.get(ll.size()-1));
	   
	   System.out.println("\n");
	   System.out.println("Retriving the data using for loop");
	   for(int i=0;i<=ll.size()-1;i++) {
		   System.out.print(ll.get(i)+" ");
	   }
	   System.out.println("\n");
	   System.out.println("Retriving the data in reverse Order using for loop");
	   for(int i=ll.size()-1;i>=0;i--) {
		   System.out.print(ll.get(i)+" ");
	   }
	   System.out.println("\n");
	   System.out.println("Retriving the data using for-each loop");
	   for(Object o:ll) {
		   System.out.print(o+" ");
	   }
	   System.out.println("\n");
	   System.out.println("Retriving the data using Iterator Interface");
	   Iterator<Object> i=ll.iterator();
	   while(i.hasNext()) {
		   System.out.print(i.next()+" ");
	   }
	   
	}
	public static void main(String[] args) {
		new LinkedListDemo().meth();
	}
}
