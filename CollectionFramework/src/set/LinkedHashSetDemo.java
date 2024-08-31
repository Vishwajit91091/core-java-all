package set;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;

public class LinkedHashSetDemo 
{
	void meth1() {
	   LinkedHashSet<Object> lhs=new LinkedHashSet<Object>();//[insertion order is maintened (java 1.4v)]
	   lhs.add(10);  //insertion Order Is maintened
	   lhs.add("Java");//Hectrogenious data r allowed
	   lhs.add(null);//null is allowed
	   lhs.add(10); //duplicate data r not allowed
	   lhs.add(50);//It's default capisity is 16[LoadFactor : 0.75]
	   lhs.add(36); //java 1.4v
	   lhs.add(85);//it's size increses by Double
	   lhs.add(100);//it is not synchronized
	   System.out.println(lhs);
	   
	   System.out.println("\n");
	   System.out.println("Retriving the data using Iterator Interface");
	   Iterator<Object> i=lhs.iterator();
	   while(i.hasNext()) {
		   System.out.print(i.next()+" ");
	   }
	   System.out.println("\n");
		System.out.println("Retriving the data by using ArrayList");
		ArrayList<Object> al=new ArrayList<Object>(lhs);
		System.out.print("HashSet: "+lhs+"\n");
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
		new LinkedHashSetDemo().meth1();

	}

}
