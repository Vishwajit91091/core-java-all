package string_han;

public class String_Palamdrom
{
	void meth1(String name) {
		String rev=" ";
		for(int i=name.length()-1;i>=0;i--) {
			rev=rev+name.charAt(i);
		}
		System.out.println("Given String: "+name);
		System.out.println("after reversing: "+rev);
	}

	public static void main(String[] args) {
		new String_Palamdrom().meth1("madam");

	}

}
