package basic;

import java.util.Scanner;

public class FindSmallesetUseScanner {
	
	int smallest(int a, int b, int c) {
		if(a<b && a<c) {
			return a;
		}
		 else if(b<a && b<c) {
			return b;
		}
		else
			return c;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 1st No: ");
		int a=s.nextInt();
		System.out.println("Enter 2nd No: ");
        int b=s.nextInt();
        System.out.println("Enter 3rd No: ");
        int c=s.nextInt();
        int z=new FindSmallesetUseScanner().smallest(a, b, c);
        System.out.println(z+" is Smallest Value ");
	}

}
