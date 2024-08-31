package basic;

import java.util.Scanner;

public class FindTrangle {
	
	void trangle(int a,int b,int c) {
	  
	   int d=a+b+c;
	   System.out.println(d);
		if(d==180) {
		System.out.println("it is a valid trangle");
		}
		else {
			System.out.println("it is not a valid Trangle");
		}
		
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 1st No: ");
		int a=s.nextInt();
		System.out.println("Enter 2nd No: ");
		int b=s.nextInt();
		System.out.println("Enter 3rd No: ");
		int c=s.nextInt();
		new FindTrangle().trangle(a, b, c);

	}

}
