package basic;

public class PrintA_ToZ {

	void meth1() {
		char i=1;
		int n=90;
		for(i=65; i<=n; i++) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
	
		new PrintA_ToZ().meth1();
	}

}
