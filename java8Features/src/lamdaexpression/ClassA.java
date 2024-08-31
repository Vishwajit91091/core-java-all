package lamdaexpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;
import java.util.Scanner;

public class ClassA
{
	void display()
	{
		System.out.println("Implementing Lamda Expression");
	InterfaceA aobj=()-> 
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter 5 Integer value");
		for(int i=1;i<=5;i++)
		{
			al.add(sc.nextInt());
		}
		System.out.println("al : "+al);
		
		Collections.sort(al);
		ListIterator<Integer> li=al.listIterator();
		while(li.hasNext())
		{
			System.out.print(li.next()+"  ");
		}
		System.out.println("\n");
		while(li.hasPrevious())
		{
			System.out.print(li.previous()+" ");
		}	
	 };
	 aobj.meth1();
	}
	public static void main(String[] args)
    {
	
		new ClassA().display();
	}

}
