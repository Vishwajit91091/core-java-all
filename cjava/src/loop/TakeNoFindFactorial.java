package loop;

import java.util.Scanner;

public class TakeNoFindFactorial {

	void meth1(int a) {
		int fact=1; 
		for(int i=1;i<=a;i++) {
		fact=(fact*i);
		
		}
		System.out.println(fact);
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
			System.out.println("Enter a No: ");
			int a=s.nextInt();
			new TakeNoFindFactorial().meth1(a);;
		
	}

}
