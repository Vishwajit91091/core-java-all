package methodrefrencing;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class ClassB
{
	void meth1()
	{
	ArrayList<Integer> al=new ArrayList<Integer>();
	Scanner sc=new Scanner(System.in);
    System.out.println("Please Enter 5 Integer Value");
	for(int i=1;i<=5;i++)
	{
		al.add(sc.nextInt());
	}
	System.out.println("al : "+al);
	Collections.sort(al);
	
	ListIterator<Integer> li=al.listIterator();
	while(li.hasNext()) {
		System.out.print(li.next()+" ");
	}
	System.out.println("\n");
	while(li.hasPrevious()) {
		System.out.print(li.previous()+" ");
	}
	sc.close();
	
	}
	static void meth2()
	{
		System.out.println("this is static method refrencing");	
	}
	ClassB(){
		System.out.println("this is constructor referencing");
	}

	public static void main(String[] args) 
	{

		new ClassB().meth1();
	}

}
