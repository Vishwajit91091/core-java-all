package basic;

public class Print1ToN {
	
	void meth1(int n) {
		int i=1;
		for(i=1;i<=n; i++) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		new Print1ToN().meth1(10);
	}

}
