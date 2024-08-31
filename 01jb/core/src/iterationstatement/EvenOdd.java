package iterationstatement;

import java.util.Scanner;

public class EvenOdd {
	public String checkNum(int num) {
		if(num%2==0) {
			return "This is even Number.";
		}
		else
		{
		return "This is Odd number.";
	}
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter One Number:");
		int number=s.nextInt();
		System.out.println(new EvenOdd().checkNum(number));

	}

}
