package selectionstmt;

import java.util.Scanner;

public class If_Ex4 {
	
	void meth1(int sal,int service) {
		int years=5;
		if(service>=years) {
			int bonus=(sal*10)/100;
			System.out.println("your updated sal is: "+(sal+bonus));
		}
		else {
			System.out.println(sal+ " your sal is not updated because your experiance is: "+service+" only");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Emp salary");
		int sal = sc.nextInt();
		System.out.println("Enter Emp exp");
		int exp = sc.nextInt();
		
		new If_Ex4().meth1(sal, exp); 
	}

}
