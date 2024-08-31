package basic;

public class PrintOnlyOddNo {
 
	void meth1() {
		int i=1;
		while(i<=50) {
			System.out.println(i);
			i +=2;
		}
	}
	public static void main(String[] args) {
		new PrintOnlyOddNo().meth1();
	}

}
