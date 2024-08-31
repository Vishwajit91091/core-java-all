package basics;

public class Addition {
	void meth1(int a, int b,int c){
		int x=a+b+c;
		System.out.println("Addition "+x);
		System.out.println("Addition "+(a+b+c));
	}
	void meth2(int a,int b) {
		int x=a-b;
		System.out.println("substraction "+x);
		System.out.println("substraction "+(a-b));
	}
	Addition(){
		int a=10;
		int b=5;
		int c=a/b;
		System.out.println("Dividation "+c);
		System.out.println("Dividation "+(10/5));	
	}
	
	Addition(int x){
		int y=x*x;
		System.out.println("Multiplaction "+y);
		System.out.println("multiplaction "+(x*x));
	}
public static void main(String[] args) {
	new Addition(10).meth1(10, 20, 30);
	new Addition().meth2(100, 99);
}
}
