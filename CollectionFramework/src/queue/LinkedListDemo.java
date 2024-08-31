package queue;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo 
{
	void meth1() 
	{
	LinkedList<Object> ll=new LinkedList<Object>();
	ll.add(10); //insertion order is maintained
	ll.add("java");//Heterogeneous data r allowed
	ll.add(null); //null is  is allowed
	ll.add(10);// duplicate is allowed
	ll.add(1); //it is java
	ll.add(50); //it's default capacity
	ll.add(66); // increases 
	ll.add(85); //it is synchronized
	
	System.out.println(ll);
	
	Iterator<Object> i=ll.iterator();
	while(i.hasNext()) {
		System.out.print(i.next()+" ");
	}
	
	}

	public static void main(String[] args) 
	{
	   new LinkedListDemo().meth1();	

	}

}
