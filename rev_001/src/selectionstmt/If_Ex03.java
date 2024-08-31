package selectionstmt;

public class If_Ex03 {
	
	void meth1(int m) {
		if(m>=0 && m<=100) {
		if(m<=25)
			System.out.println("Fail");
		else if(m>=26 && m<=44)
			System.out.println("D Gread");
		else if(m>=45 && m<=59)
			System.out.println("C Gread");
		else if(m>=60 && m<=79)
			System.out.println("B gread");
		else if(m>=80 && m<=100)
			System.out.println("A Gread");
		}
		else 
			System.out.println("please enter marks bitween 1 to 100 only ");
	}

	public static void main(String[] args) {
		new If_Ex03().meth1(200);
	}

}
