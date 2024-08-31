package string_han;

import java.util.Scanner;

public class Add_String 
{
	void meth1() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String/nmae");
		String name=sc.nextLine();
		
		System.out.println("Hello "+name+"..!!");
		System.out.println("Hello ".concat(name).concat("..!!"));
	}

	public static void main(String[] args) {
	  new Add_String().meth1();

	}

}
