package selectionstmt;

public class bonous {
	
	void meth1(int year,float salary)
	{
		if(year>=5) {
			float c=(salary*5)/100;
			System.out.println((salary+c)+" increase salary "+c);
		}
		else
			System.out.println(salary+" less than 5 year "+(5-year)+" then 5% increase");
	}

	public static void main(String[] args) {
		new bonous().meth1(4, 10000);
		
	}

}
