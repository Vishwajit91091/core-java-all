package basic;

import java.util.Scanner;

public class FindGreadTake3Input {
	
	void calclutes(int a,int b,int c) {
		int gread=a+b+c;
		if(gread>=90 && gread<=100) {
			System.out.println("A");
		}
		else if(gread>=80 && gread<=89) {
			System.out.println("B");
		}
		else if(gread>=70 && gread<=79) {
			System.out.println("C");
		}
		else if(gread>=50 && gread<=69) {
			System.out.println("D");
		}
		else if(gread>=30 && gread<=49) {
			System.out.println("E");
		}
		else {
			System.out.println("Fail");
		}
		
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 1st Subject Marks");
		int a=s.nextInt();
		System.out.println("Enter 2nd Subject Marks");
		int b=s.nextInt();
		System.out.println("Enter 3rd Subject Marks");
		int c=s.nextInt();
		new FindGreadTake3Input().calclutes(a, b, c);

	}

}
