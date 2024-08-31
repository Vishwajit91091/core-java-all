package exceptionHandling;

import java.io.FileReader;
import java.util.Scanner;

public class KeyPoints
{
	void meth1()
	{
	Scanner sc=new Scanner(System.in);
	String s=null;
	System.out.println(10);
	
	try
	{
		System.out.println("try block executed");
		System.out.println("please Enter a no");
		System.out.println(20/sc.nextInt());//A E
		System.out.println("s.length() "+s.length());//NPE
	}
	//System.out.println("hiii");//C E
	/*
	catch(ArithmeticException e)
	{
		System.out.println("1st catch block executed");
		e.printStackTrace();
	}
	catch(NullPointerException nl) {
		System.out.println("2nd catch block executed");
		nl.printStackTrace();
	}
	*/
	catch(ArithmeticException |NullPointerException e) 
	{
		System.out.println("catch block executed");
		e.printStackTrace();
	}
	finally {
		System.out.println("finally block executed");
	}
	System.out.println("===>"+30);
	}
	void meth2() throws Exception
	{
		try(FileReader fr=new FileReader("D:\\01html\\files\\html_tutorial.docx")){
			System.out.println(10);
		}
		 
	}
	public static void main(String[] args) throws Exception 
	{
		KeyPoints key=new KeyPoints();
		//key.meth1();
		key.meth2();
		
	}

}
