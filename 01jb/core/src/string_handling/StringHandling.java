package string_handling;

public class StringHandling {

	void meth1() {
	String s1="java";    
	
	String s2=new String("java");  
	
	char arr[]={'j','a','v','a'};
	String s3=new String(arr);
	
	String s4=new String(arr,2,2);
	
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s3);
	System.out.println(s4);
	
	}
	void meth2() {
		String s1="java";
		
		System.out.println("Before concatination s1: "+s1);
		System.out.println(s1.concat(" is awsome.."));
		//s1=s1.concat(" is awsome...");
		
		System.out.println("After concatation s1: "+s1);
	}
	public static void main(String[] args) {
		
		StringHandling sh=new StringHandling();
		sh.meth1();
		System.out.println("==========================");
		sh.meth2();
	}

}
