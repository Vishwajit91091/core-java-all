package loop;

import java.util.Scanner;

public class PrintingStar1 {
	
	
	
	void meth1(int n) {
		
		for(int r=1;r<=n;r++) {
			
			for(int c=1;c<=n;c++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 1st no: ");
		int n=s.nextInt();
		
		
		new PrintingStar1().meth1(n);
	}

}
