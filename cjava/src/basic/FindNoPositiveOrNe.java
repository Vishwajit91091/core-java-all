package basic;

public class FindNoPositiveOrNe {

	void meth1(int a) {
		if(a>0) {
			System.out.println("the given no is positive");
		}
		else if(a<0) {
			System.out.println("the given no is negative ");
		}
		else {
			System.out.println("the given no is equals to zero");
		}
	}
	public static void main(String[] args) {
		new FindNoPositiveOrNe().meth1(0);
	}
}
