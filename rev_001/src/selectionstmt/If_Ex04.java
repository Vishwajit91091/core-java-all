package selectionstmt;

public class If_Ex04 {
	
	void meth1(int salary, int years) {
		int bonus=(salary*5)/100;
		if(years>5)
		{
			System.out.println("your updated sal: "+(salary+bonus));
		}
		else
			System.out.println(salary+" your sal is not increased because your exprience is: "+years+" only");
	}

	public static void main(String[] args) {
      new If_Ex04().meth1(5000, 2);
	}

}
