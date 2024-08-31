package dsa;

public class Class_01 {

	void meth1(int units) {
		int n=units*100;
		if(n>=1000) {
			int dis=(n*10)/100;
			System.out.println("you save your money "+dis+" total bill "+(n-dis));
		}
		else
			System.out.println("if u sepnd more "+(1000-n)+"then get 10 % discount final bill: "+n);
	}
	public static void main(String[] args) {
		new Class_01().meth1(12);
	}

}
