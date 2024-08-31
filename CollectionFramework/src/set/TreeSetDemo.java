package set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo 
{
	void meth1()
	{ 
		TreeSet<Object> ts=new TreeSet<Object>();
		ts.add(10); //insertion order not maintained
		//ts.add("Java");//Heterogeneous data is not allowed
		//ts.add(null);//null is not allowed
		ts.add(10);//duplicates r not allowed
		ts.add(50);//it's available from java 1.2v
		ts.add(60);//It's default capacity is 16[LoadFactor : 0.75]
		ts.add(45);//it's size increases by double
		ts.add(63);// it is not synchronized
		System.out.println(ts);
		
		System.out.println("\n");
		System.out.println("Retriving the data using Iterator");
		Iterator<Object> i=ts.iterator();
		while(i.hasNext()) 
		{
			System.out.print(i.next()+" ");
		}
		
	}

	public static void main(String[] args) {
		new TreeSetDemo().meth1();
	}

}
