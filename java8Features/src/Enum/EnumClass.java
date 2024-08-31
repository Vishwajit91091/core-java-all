package Enum;

import java.util.Arrays;

public class EnumClass 
{
	void meth1() {
		System.out.println("Implementing Enum");
		Days d=Days.Wednesday;
		System.out.println("Today is: "+d+" \n");
		System.out.println("Implementing Enum Is Switch Case");
		switch(d) {
		case Sunday:
			System.out.println("Hii..!");
			System.out.println("today is leave");
			break;
		case Wednesday:
			System.out.println("Hiii...!");
			System.out.println("Today is the Last Class for core Java");
			break;
			default:
				System.out.println("Invalid Input");
		}
		System.out.println("\n");
		System.out.println("Passing enum data into an array");
		Days arr[]=Days.values();
		for(Days x:arr) {
			System.out.println(x+"  ");
		}
		System.out.println("\n");
		System.out.println("Constants Present in Days: "+Arrays.toString(Days.values()));
	}

	public static void main(String[] args) 
	{
	  new EnumClass().meth1();
	}

}
