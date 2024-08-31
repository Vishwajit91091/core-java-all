package string_handling;

/*
   Given a String of Even Length return the first half
   so the String "woohoo" yields "woo"
   First half("HelloThree")  "Hello"
   First half("abcdef")  "abc"
 */
public class ClassB {

	public String firstHalf(String str) {
		return str.substring(0,str.length()/2);
	}
	
	public static void main(String[] args) {
		
		ClassB bobj=new ClassB();
		String result=bobj.firstHalf("Nareshit");
		System.out.println(result);
	}
}
