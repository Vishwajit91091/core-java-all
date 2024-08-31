package basic;

public class FindLeapYear {
	
	void meth1(int year) {
		int x=year%4;
		if(x<=366) {
		System.out.println("this year is leap year");	
		}
		else {
			System.out.println("this year is not a leap year");
		}
	}

	public static void main(String[] args) {
		new FindLeapYear().meth1(2022);
	}

}
