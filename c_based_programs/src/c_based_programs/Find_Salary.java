package c_based_programs;

import java.util.Scanner;

public class Find_Salary {

	public static void main(String[] args) {
		double basic=10000;
		double da=(basic*10)/100;
		double bonus=0;
		double comm=0;
		double gross=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Sales");
		double sales = sc.nextDouble();
		if(sales>=100000.00) {
			bonus=5000;
			comm=(sales*10)/100;
		}
		else {
			bonus=2000;
			comm=(sales*3)/100;
		}
		gross=basic+da+bonus+comm;
       System.out.println(gross);
	}

}
