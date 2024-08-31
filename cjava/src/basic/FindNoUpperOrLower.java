package basic;

public class FindNoUpperOrLower {
	void meth1(char c) {
		if(c>=65 && c<=96) {
		System.out.println("the given Character is Upper Case");	
		}
		else if(c>=97 && c<=123) {
			System.out.println("the given character is Lower Case");
		}
	}

	public static void main(String[] args) {
		new FindNoUpperOrLower().meth1('f');
		
	}

}
