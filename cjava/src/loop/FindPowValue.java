package loop;

import java.util.Scanner;

public class FindPowValue {

	void meth1(int power) {
		int a;
		int result=1;
		for(int i=1;i<=power;i++) {
			result *=power;
		}
		System.out.println("RESULT IS: "+result);
	   }
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter first value");
		int a=s.nextInt();
		System.out.println("Enter Power Value");
		int power=s.nextInt();
		new FindPowValue().meth1(power);
	}

}
