package c_based_programs;

import java.util.Scanner;

public class Give_Discount 
{

	void meth1() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your id");
		int id=sc.nextInt();
		System.out.println("Enter your name");
		String name=sc.next();
		System.out.println("Enter your quantity");
		int qta=sc.nextInt();
		System.out.println("Enter qta price");
		int price=sc.nextInt();
		
		int amount=qta*price;
		int discount=(amount*30)/100;
		int net=amount-discount;
		
		System.out.println(" amount "+amount+" discount "+discount+" net "+net);
		
	}
	public static void main(String[] args) {
		new Give_Discount().meth1();

	}

}
