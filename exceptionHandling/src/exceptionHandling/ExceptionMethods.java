package exceptionHandling;

import java.util.Scanner;

public class ExceptionMethods 
{
	Scanner sc=new Scanner(System.in);
	void meth1()
	{
		System.out.println(10);
		try
		{
			System.out.println("try block executed");
			System.out.println("please enter a no: ");
			System.out.println(20/sc.nextInt());
			System.out.println("hhhiii");
		}
		catch(ArithmeticException e)
		{
		   System.out.println("catch block executed");
		   System.out.println(e.getMessage());//Reasion of the exception
		   //System.out.println(e.toString()); //name and reasion of the exception
		  // e.printStackTrace();  //it display complete info about the exception
		} 
		finally 
		{
			System.out.println("finally block executed ");
			System.out.println("==>"+30);
		}
		System.out.println("helo");
	}

	public static void main(String[] args) 
	{
		new ExceptionMethods().meth1();
	}

}
