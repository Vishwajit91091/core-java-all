package loop;

public class Print {

	void meth1(int n) {
		
		for(int r=1;r<=n;r++) {
			for(int c=1;c<=n;c++) {
				System.out.print(r+" ");
			}
			
			System.out.println();
		}
	}
	public static void main(String[] args) {
		new Print().meth1(5);
	}

}
