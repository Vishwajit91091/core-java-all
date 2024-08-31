package selectionstmt_N;

public class Program02 {
	
	void meth1(int length,int breath) {
		if(length==breath) {
			System.out.println("squre");
		}
		else 
			System.out.println("rectangle");
	}

	public static void main(String[] args) {
		new Program02().meth1(10, 20);

	}

}
