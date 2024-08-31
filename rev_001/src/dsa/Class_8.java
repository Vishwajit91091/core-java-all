package dsa;

import java.util.Scanner;

public class Class_8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a degit");
		int d,n=sc.nextInt(),sum=0;
		while(n!=0) {
			d=n%10;
			if(d%2==0) 
			  sum=sum+d;
			n=n/10;
		}
		System.out.println(sum);
	}

}
