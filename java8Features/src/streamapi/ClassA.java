package streamapi;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;

public class ClassA 
{
	void meth1()
	{
		ArrayList<Object> al=new ArrayList<Object>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 5 employee age");
		for(int i=1;i<=5;i++)
		{
			al.add(sc.nextInt());
		}
		System.out.println("Enter 5 employee Name");
		for(int i=1;i<=5;i++)
		{
			al.add(sc.nextLine());
		}
		System.out.println("Enter 5 employee salary");
		for(int i=1;i<=5;i++)
		{
			al.add(sc.nextInt());
		}
		System.out.println(al);
	   Stream<Object> s1=al.stream();
	  // s1.filter(null)
	}

	public static void main(String[] args) 
	{
		new ClassA().meth1();

	}

}
