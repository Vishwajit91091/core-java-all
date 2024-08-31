package collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class PassingObj_IntoVector_B 
{
	void meth1() 
	{
		Vector<PassingObj_IntoVector_A> v=new <PassingObj_IntoVector_A>Vector();
		
		PassingObj_IntoVector_A  aobj=new PassingObj_IntoVector_A ("KISHAN",101,"Java");
		v.add(aobj);
		v.add(new PassingObj_IntoVector_A("Sanju",102,"java"));
		v.add(new PassingObj_IntoVector_A("Vishwajit",103,"Python"));
		
		System.out.print(v+" ");
		System.out.println("\n");
		System.out.println("Retriving the data using Iterator Interface");
		
		Iterator<PassingObj_IntoVector_A> i=v.iterator();
		while(i.hasNext()) {
			System.out.print(i.next()+" ");
		}
		System.out.println("\n");
		System.out.println("Retriving the data using Enumeration");
		Enumeration<PassingObj_IntoVector_A> e=v.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}

	public static void main(String[] args) 
	{
		new PassingObj_IntoVector_B().meth1();

	}

}
