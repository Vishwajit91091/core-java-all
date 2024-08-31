package string_handling;

public class StringPalamdrom {
	
	void meth1(String word) {
		
		String rev="";
		for(int i=word.length()-1;i>=0;i--) {
			rev=rev+word.charAt(i);
		}
		System.out.println("Given String: "+word);
		System.out.println("After revrsing: "+rev);
	
	if(word.equalsIgnoreCase(rev)) 
		System.out.println("It is Palamdrom");
		
		else
			System.out.println("It is not Palamdrom");
	}
	
	public static void main(String[] args) {
		
		new StringPalamdrom().meth1("Madam");

	}

}
