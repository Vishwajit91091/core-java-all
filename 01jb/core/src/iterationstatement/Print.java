package iterationstatement;

import java.util.Scanner;

public class Print {
	
	void meth1() {
		int i=1;
		int j=1;
		Scanner s=new Scanner(System.in);
		while(i<=12) {
			System.out.println("Enter Salary:");
			int sal=s.nextInt();
			
			if(sal<=500) {
				while(j<=6) {
					System.out.println("I am If-While");
					j++;
				}
			}
			else {
				do{
					System.out.println("Else doWhile");
					j++;
				}
				while(j<=8);
			}
		}
	}

	public static void main(String[] args) {
		new Print().meth1();

	}

}
