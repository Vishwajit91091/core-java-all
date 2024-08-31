package bank;

import java.util.Scanner;

public class AtmOperations {
     
	Scanner sc=new Scanner(System.in);
	void atm() {
		a:while(true) {
			System.out.println("=======ATM Operations======");
			System.out.println("1)Create Account");
			System.out.println("2)Deposit Amount");
			System.out.println("3)Withdraw");
			System.out.println("4)exit");
			int operations = sc.nextInt();
			switch(operations) {
			case 1:{
				new AtmOperations().creatAccount();
				break;
			}
			case 2:{
				new AtmOperations().deposit();
				break;
			}
			case 3:{
		    	new AtmOperations().withdraw();
		    	break;
			}
			case 4:{
				break a;
			}
		  }
		}
	}
	void creatAccount() 
	{
		System.out.println("Enter New Customer Name: ");
		String name=sc.nextLine();
		System.out.println("Enter Customer Account No: ");
		int ano=sc.nextInt();
		System.out.println("Enter Customer Branch: ");
		String branch=sc.next();
		System.out.println("Enter Customer Id: ");
		int cid=sc.nextInt();
		System.out.println("Enter Customer Pin: ");
		int pin=sc.nextInt();
		System.out.println("=========================");
		System.out.println("Your Account is succefully Created ");
		System.out.println("Your Name is: "+name);
		System.out.println("your Account no: "+ano);
		System.out.println("your branch is: "+branch);
		System.out.println("your id is: "+cid);
		System.out.println("your pin: "+pin);
		System.out.println("=========================");
	}
	void deposit() {
		System.out.println("Enter how much amount u want to deposit: ");
		int amount = 0;
		if(amount>=0) {
		int amount1=sc.nextInt();
		System.out.println("your Account *****3645 be Creadited : " +amount1);
	   }
		else {
			System.out.println("please enter positive value..!");
		}
	}
	void withdraw() {
		System.out.println("Enter how much Amount u want to withdraw: ");
		int amount=sc.nextInt();
		System.out.println("Your Account *****3645 debitedeted : "+amount);
	}
	public static void main(String[] args) {
		AtmOperations obj=new AtmOperations();
		//obj.creatAccount();
		//obj.deposit();
		//obj.withdraw();
		obj.atm();
	}
	
}
