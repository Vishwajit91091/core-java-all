package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo 
{
	void meth1() {
		System.out.println("Implenting ArrayList");
		ArrayList<Integer> al=new <Integer>ArrayList();
		
		al.add(10);    //Insertion order is maintened 
		//al.add("Java");//Hetrogenious data is allowed
		//al.add(null);  //null is allowed
		al.add(10);   //Dublicates r allowed
		al.add(1);    //It is avalable from java 1.2v
		al.add(56);   //it's default capicity is 10
		al.add(22);   // It size increases by half
		al.add(100);  //It is not Synchronized
		
		System.out.println(al+"\n");
		System.out.println("size(): "+al.size());
		System.out.println("get(): "+al.get(0));
		System.out.println("get(): "+al.get(al.size()-1)+"\n");
		
		System.out.println("Retriving the data by using for loop");
		for(int i=0;i<=al.size()-1;i++) {
			System.out.print(al.get(i)+"  ");
		}
		System.out.println("\n");
		System.out.println("Retriving the data in reverse byusing for loop");
		for(int i=al.size()-1;i>=0;i--) {
			System.out.print(al.get(i)+"  ");
		}
		System.out.println("\n");
		System.out.println("Retriving the data using for-each loop");
		for(int i:al)       //(Object o:al)   (Integer i:al)
		{
			System.out.print(i+"  ");
		}
		
		System.out.println("\n");
		System.out.println("Retriving the data by using Iterator interface");
		Iterator<Integer> i=al.iterator();
		while(i.hasNext()) {
			System.out.print(i.next()+"  ");
		}
		
		System.out.println("==========Methods========");
		System.out.println("isEmpty(): "+al.isEmpty());
		//it returns true (or) false if data is their then if data is not their then return true  
		/*
		System.out.println("Before: "+al);
		al.clear(); //it remove all the elements present in the ArrayList
		System.out.println("After: "+al);
		System.out.println("isEmpty: "+al.isEmpty());
		*/
		System.out.println("contains(): "+al.contains(56));//[10,10,1,56,22,100]
		//it will check the given data is present in ArrayList or not 
		//if present then return true if not present then return false
		System.out.println("contains(): "+al.contains(200));
		
		System.out.println("\n");
		System.out.println("remove(): "+al.remove((Object)100));//parameter takes the index position 
	    System.out.println(al);
	    System.out.println("removeA(): "+al.remove(1));
	    System.out.println(al);
	
	}

	public static void main(String[] args)
	{
		new ArrayListDemo().meth1();
	}
}
