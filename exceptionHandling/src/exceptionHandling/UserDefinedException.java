package exceptionHandling;

import java.util.Scanner;

public class UserDefinedException
{

	static double current_balance=100;
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter amount to withdrawal ");
		int n=sc.nextInt();
		try
		{
			if(current_balance<n) {
				throw new MinimumAccountBalance("in sufficent funds..! your current balance is "+current_balance);
			}
			else {
				System.out.println("please take the money: "+n);
			}
		}
			catch(MinimumAccountBalance e) {
				e.printStackTrace();
			}
			sc.close();
		}
		
	}


