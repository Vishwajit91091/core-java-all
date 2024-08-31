package basic;

public class PrintEvenOrOdd {

	void meth1(int a,int b) {
		int c=a%b;
		if(c==0) {
		System.out.println(c+" the given no is even");	
		}
		else {
			System.out.println(c+" the given no is odd");
		}
	}
	public static void main(String[] args) {
		new PrintEvenOrOdd().meth1(20, 5);
	}
}
