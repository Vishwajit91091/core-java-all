package c_based_programs;

import java.util.Scanner;

public class PersonMarrege_Ebelity {

	void meth() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter gender");
		String gen=sc.next();
		System.out.println("Enter Age");
		int age=sc.nextInt();
		System.out.println(" age "+ age);
		if(gen.equals("m") || gen.equals("M")) {
			System.out.println(" gen "+ gen);
			if(age>=21) {
				System.out.println("Eligable");
			}
			else
				System.out.println("Not Eligable");
		}
		else if(gen.equals("Female")||gen.equals("female")) {
			if(age>=18) {
				System.out.println("Eligble");
			}
			else
				System.out.println("Not Eligble");
		}
	}
	public static void main(String[] args) {
	new PersonMarrege_Ebelity().meth();
		
	}
}
