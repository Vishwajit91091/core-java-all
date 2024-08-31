package basic;

import java.util.Scanner;

public class FindLargestNoUseScanner {

	int largest(int a, int b, int c) {
		if (a > b && a > c) {
			return a;
		}
		else if(b>a && b>c) {
			return b;
		}
		else
		return c;

	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("enter 1st no");
		int a = s.nextInt();
		System.out.println("enter 2nd no");
		int b = s.nextInt();
		System.out.println("enter 3rd no");
		int c = s.nextInt();
		int z = new FindLargestNoUseScanner().largest(a, b, c);
		System.out.println(z+" is largest");

	}

}
