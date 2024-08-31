package method_refrencing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class ClassB 
{
	void meth1() {
	
		ArrayList<Integer> al=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 5 Integer value");
		for(int i=1;i<=5;i++) {
			al.add(sc.nextInt());
		}
		System.out.println("al:"+al);
		Collections.sort(al);
		
	   Iterator<Integer> i=al.iterator();
	   while(i.hasNext()) {
		   System.out.print(i.next()+" ");
	   }
	   System.out.println("\n");
	   
	   ListIterator<Integer> li=al.listIterator();
	   while(li.hasNext()) {
		   System.out.print(li.next()+" ");
	   }
	   System.out.println("\n");
	 while(li.hasPrevious()) {
		 System.out.println(li.previous()+" ");
	 }
	   sc.close();
	}
	
	static void meth2() {
		System.out.println("This is static method refrencing");
	}
	
	ClassB(){
		System.out.println("This is Constructor refrencing");
	}
	public static void main(String[] args) {
		new ClassB().meth1();
	}

}
