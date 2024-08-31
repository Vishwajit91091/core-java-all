package string_handling;

import java.util.Scanner;

public class PalamdromScanner {
	
	public void meth1(String word) {
		String rev="";
		for(int i=word.length()-1;i>=0;i--) {
			rev=rev+word.charAt(i);
		}
		System.out.println("given String: "+word);
		System.out.println("after rev: "+rev);
		
		if(word.equalsIgnoreCase(rev)) {
			System.out.println("it is palamdrom");
		}
		else
			System.out.println("it is not palamdrom");
	}

	public static void main(String[] args) {
		PalamdromScanner ps=new PalamdromScanner();
		Scanner sc=new Scanner(System.in);

		System.out.println("enter a String value");
		ps.meth1(sc.nextLine());
		
	}

}
