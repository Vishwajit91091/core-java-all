package basic;

public class PrintTable {

	void meth1(int a) {
		int i=10;
		for(i=1;i<=10;i++) {
		int b=a*i;
		System.out.println(b);
		}
	}
	public static void main(String[] args) {
		new PrintTable().meth1(5);
	}

}
