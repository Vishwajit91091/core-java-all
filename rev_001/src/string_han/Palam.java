package string_han;

public class Palam {
	
	void meth1(String name) {
		String rev="";
		for(int i=name.length()-1;i>=0;i--) {
			rev=rev+name.charAt(i);
		}
		System.out.println(name);
		System.out.println(rev);
		if(name.equals(rev)) {
			System.out.println("palamdrom");
		}
		else
			System.out.println("not");
	}

	public static void main(String[] args) {
		new Palam().meth1("madam");
		

	}

}
