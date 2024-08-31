package loop;

import java.util.Scanner;

public class TakePosNoAndPrintTable {
	
	void print(int a) {
		if(a>0) {
			for(int i=1;i<=10;i++) {
			System.out.println(a+" * "+i+" = "+(a*i));
			}
		}
		else {
				System.out.println("Please Enter A Positive No");
			}
		
		
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        System.out.println("Inter a no:");
        int a=s.nextInt();
        new TakePosNoAndPrintTable().print(a);
	}

}
