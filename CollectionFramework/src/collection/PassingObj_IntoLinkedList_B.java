package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class PassingObj_IntoLinkedList_B
{
	void meth1() {
	  LinkedList<PassingObj_IntoLinkedList_A> ll=new LinkedList<PassingObj_IntoLinkedList_A>();
	  
	  PassingObj_IntoLinkedList_A aobj=new PassingObj_IntoLinkedList_A("Sanju",101,"java");
	  ll.add(aobj);
	  ll.add(new PassingObj_IntoLinkedList_A("kishan",102,"JAVA"));
	  ll.add(new PassingObj_IntoLinkedList_A("Vishwajit",103,"Python"));
	  System.out.println(ll+" "); 
	  
	  System.out.println("\n");
	  System.out.println("Retriving the data using for-each loop");
	  for(Object o:ll) {
		  System.out.print(o+" ");
	  }
	  System.out.println("\n");
	  System.out.println("Retriving the data using Iterator");
	  Iterator<PassingObj_IntoLinkedList_A> i=ll.iterator();
	  while(i.hasNext()) {
		  System.out.println(i.next());
	  }
	  System.out.println("\n");
	  System.out.println("Retriving the data into ListIterator");
	  ListIterator<PassingObj_IntoLinkedList_A> li=ll.listIterator();
	  while(li.hasNext()) {
		  System.out.print(li.next()+" ");
	  }
	  System.out.println("\n");
	  while(li.hasPrevious()) {
		  System.out.println(li.previous());
	  }
	}
	

	public static void main(String[] args)
	{
		new PassingObj_IntoLinkedList_B().meth1();
	
	}
}
/*
 In LinkedList data will stored in the form of Nodes
 Each Node will be Having 3 Fields 
 Construction time for LinkedList is more.
 Manuplation time of data in Linked List is easy 
*/