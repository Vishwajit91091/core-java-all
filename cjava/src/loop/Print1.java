package loop;

public class Print1 {

	void meth1(int n) {
		for(int r=1;r<=n;r++) {
			for(int c=1;c<=r;c++) {
				System.out.print(c+"  ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		new Print1().meth1(5);

	}

}
