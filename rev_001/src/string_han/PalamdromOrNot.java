package string_han;

public class PalamdromOrNot
{
	void meth1(String name) {
		String rev=" ";
		for(int i=name.length()-1;i>=0;i--) {
			rev=rev+name.charAt(i);
		}
		System.out.println("Before String: "+name);
		System.out.println("After reversing: "+rev);
		
		if(name.equals(rev)) {
			System.out.println("String is palamdrom");
		}
		else
			System.out.println("not palamdrom");
	}

	public static void main(String[] args) {
		new PalamdromOrNot().meth1("madam");

	}

}