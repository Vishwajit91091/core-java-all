package loop;

public class Print3 {
	
	void meth1(int n) {
		for(int r=1;r<=n;r--) {
			for(int c=1;c<=r;c++) {
				System.out.print(r+"  ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		new Print2().meth1(5);
	}

}
