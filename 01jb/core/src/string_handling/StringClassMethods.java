package string_handling;

import java.util.Arrays;
import java.util.Scanner;

public class StringClassMethods {
	
	Scanner sc=new Scanner(System.in);
	
	void meth1() {
		
		String s1="Java";
		
		String s2=new String("Java");
		
		String s3="Java";
		
		String s4=new String("Java");
	
		System.out.println(s1.equals("Java"));
		System.out.println("Java".equals(s3));
		System.out.println("Java".equalsIgnoreCase(s3));
		
		//System.out.println("Please Enter String Value");
		//System.out.println("Java Is Awsome".equals(s4.concat(sc.nextLine())));
		System.out.println("java".equals(new String("Java")));
		System.out.println("==============================");
		
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		System.out.println(s3==s4);
		System.out.println(s1==s4);
		System.out.println(s1=="Java");
		System.out.println(s1==new String("Java"));
		System.out.println("Java"==s2);
		System.out.println(new String("Java")=="Java");
		System.out.println("Java"=="Java");
		System.out.println(new String("Java")==new String("Java"));
		
	}
	void meth2() {
		System.out.println("=======String Class Methods========");
		String s1="java";
		System.out.println("length(): "+s1.length());
		System.out.println("concat(): "+s1.concat(" is awsome"));
		System.out.println("s1: "+s1);
		
		System.out.println(s1.concat(" is awsome ").length());
		System.out.println("charAt(): "+s1.charAt(0));
		System.out.println("charAt(): "+s1.charAt(s1.length()-1));
		/*
		System.out.println("===============================");
		System.out.println("Please Enter Your Gender");
		char gender=sc.next().charAt(0);
		switch(gender) {
		
		case 'M':
			System.out.println("User Selected Male");
			break;
		case 'F':
			System.out.println("User Selected Female");
			break;
			default:
				System.out.println("Invalid Input..!!");
				break;
		}
		*/
		System.out.println("startsWith(): "+s1.startsWith("j"));
		System.out.println("startsWith(): "+"java is awsome".startsWith(s1));
		System.out.println("startsWith(): "+"java is awsome".startsWith(new String(new char['j'])));
		
		String s2="java is awsome";
		
		//System.out.println("startsWith(): "+s2.startsWith(new String char [] = {'j','a','v','a'}));
		System.out.println("toLowerCase(): "+s2.toLowerCase());
		System.out.println("toUpperCase(): "+s2.toUpperCase());
		System.out.println("s2: "+s2);
		
		System.out.println("=======subString()=======");
		System.out.println("subString(): "+s2.substring(8));
		System.out.println("subString(): "+s2.substring(11));
		
		System.out.println("subString(): "+s2.substring(5,7));
		System.out.println("subString(): "+s2.substring(11,13));
		System.out.println("subString(): "+s2.substring(3,9));
		
		System.out.println("replace(): "+s2.replace('a', 'A'));
		String s3=" Hello World ";
		System.out.println("s3 length(): "+s3.length());
		     // trim()
		System.out.println("s3 length(): "+s3.trim().length());
		System.out.println("indexOf(): "+s3.indexOf('0'));
		System.out.println("indexOf(): "+s3.lastIndexOf('0'));
		
		String s4="ABCDEF";
		byte arr[]=s4.getBytes();
		System.out.println(Arrays.toString(arr));
		for(byte b:arr) {
			System.out.println((char)b);
		}	
	}

	public static void main(String[] args) {

		StringClassMethods sm=new StringClassMethods();
		//sm.meth1();
		sm.meth2();
	}

}
/*
 equals()
 ========
 equals() is in String class it has been Overriden such that it is going to check the 
 contents present inside the Strings.
 
 = =
 ----------
 it is going to check the address locations of the Strings 
 if both Strings in the same location then == will return 'true'
 if they represent diffrent location then it is going to return 'false'
 
 */
