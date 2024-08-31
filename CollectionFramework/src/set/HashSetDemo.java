package set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class HashSetDemo
{
	void meth1() {
		HashSet<Object> set=new HashSet<Object>();
		//[Insertion Order is not maintened (java 1.2v)]
		set.add(10);
		set.add("Java"); //Hetrozenious data r Allowed
		set.add(null); //null is allowed 
		set.add(10); //duplicates r not allowed
		set.add(1); //It's default capisity is 16[LoadFactor : 0.75]
		set.add(50);//it's size increses by Double 
		set.add(100);//it is not synchronized
		set.add(56);
		
		System.out.println(set);
		System.out.println("\n");
		System.out.println("Retriving the data by using Iterator interface");
		
		Iterator<Object> i=set.iterator();
		while(i.hasNext()) {
			System.out.print(i.next()+" ");
		}
		System.out.println("\n");
		System.out.println("Retriving the data by using ArrayList");
		ArrayList<Object> al=new ArrayList<Object>(set);
		System.out.print("HashSet: "+set+"\n");
		System.out.println("ArrayList: "+al+"\n");
		ListIterator<Object> li=al.listIterator();
		while(li.hasNext()) {
			System.out.print(li.next()+" ");
		}
		System.out.println("\n");
		while(li.hasPrevious()) {
			System.out.print(li.previous()+" ");
		}
		
	}

	public static void main(String[] args) 
	{
		new HashSetDemo().meth1();

	}

}
