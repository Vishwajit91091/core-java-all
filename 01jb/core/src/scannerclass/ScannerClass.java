package scannerclass;

import java.util.Scanner;

public class ScannerClass {

	Scanner sc=new Scanner(System.in);
	
	void meth1() {
		System.out.println("Please Enter 1st No: ");
		int a=sc.nextInt();
		System.out.println("a value is: "+a);
		System.out.println("Enter 2nd No: ");
		int b=sc.nextInt();
		System.out.println("b value is: "+b);
		int sum=a+b;
		System.out.println("sum No: "+sum);
		
	}
	void eligibility() {
		System.out.println("Enter Your name: ");
		String name=sc.nextLine();
		System.out.println("What is Your age: ");
		int age=sc.nextInt();
		if (age>=18) {
			System.out.println(name+" you Are eligible for vote");
		}else {
			System.out.println(name+" you are eligible for vote after "+(18-age)+" years");
		}
	}
	void vehicle(int tyres) {
		switch(tyres) {
		case 2:
			System.out.println("You have two vellor vehicle bike/scotty");
			break;
		case 4:
			System.out.println("you have car");
			break;
		case 6:
			System.out.println("you have 6 vellore bus/truck");
			break;
		case 10:
			System.out.println("you have a truck");
			break;
			default:
				System.out.println("please enter a valid input..!!");
		}
	}
	
	void empDetails() {
		System.out.println("please Enter your Details");
		System.out.println("Name");
		String name=sc.nextLine();
		System.out.println("Emp Id");
		int id=sc.nextInt();
		System.out.println("enp Dept");
		int dept=sc.nextInt();
		System.out.println("emp Address");
		sc.nextLine();
		String address=sc.nextLine();
		System.out.println("=================");
		System.out.println("Name: "+name);
		System.out.println("Emp Id: "+id);
		System.out.println("Emp Dept: "+dept);
		System.out.println("Emp Address: "+address);
	}
	
	
	public static void main(String[] args) {
		ScannerClass aobj=new ScannerClass();
		//aobj.meth1();
		//aobj.eligibility();
		//aobj.empDetails();
		
		System.out.println("plese enter your vehicle tyres");
       //int tyres=aobj.sc.nextInt();
      // aobj.vehicle(tyres);
       aobj.vehicle(aobj.sc.nextInt());
	}

}








