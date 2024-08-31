package dsa;

public class Class_6 {
	
	void meth1(String name) {
		String rev="";
		for(int i=name.length()-1;i>=0;i--) {
			 rev=rev+name.charAt(i);
		}
		System.out.println(rev);
		System.out.println(name);
		if(rev.equals(name)) {
			System.out.println("palamdrom");
		}
		else
			System.out.println("not a palamdram");
		
	}

	public static void main(String[] args) {
		new Class_6().meth1("madam");
		
	}

}
