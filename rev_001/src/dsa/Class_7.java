package dsa;

public class Class_7 {
	static int s;
	void meth1(int n) {
		while(n!=0) {
		int d=n%10;
		if(n%2!=0) {
		s=s+d;
		}
		n=n/10;
		}
		System.out.println(s);
	}
	public static void main(String[] args) {
		new Class_7().meth1(12345);
	}
}
