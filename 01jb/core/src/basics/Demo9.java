package basics;

public class Demo9 {

	int meth1() {
		System.out.println("meth1() called");
		return 100;
	}
	int meth2(int a,int b) {
	
		System.out.println("meth2() called");
		return a+b;
	}
	public static void main(String[] args) {
		Demo9 d=new Demo9();
		int x=d.meth1();
		System.out.println("x value:"+x);
		System.out.println(x-99);
		int y=d.meth2(5, 4);
		System.out.println("value y :"+y);
	}
}
