package basics;

public class Demo12 {
	void meth1() {
		System.out.println(10);
		System.out.println(64);
		System.out.println("end");
	}
	int meth2(int a,int b,int c) {
		System.out.println(a);
		Demo12 d=new Demo12();
		String s=d.meth5(100,"Java Is Awsome");
		System.out.println(5);
		return a-b;
	}
	String meth3(String s,int b,int d) {
		System.out.println(b+d);
		return s;	
	}
	int meth4(int c,int k) {
		System.out.println(k);
		Demo12 d=new Demo12();
		int result=d.meth2(50, 50, 50);
		System.out.println(result);
		return k+10;
	}
	String meth5(int a, String L) {
		System.out.println(a+a);
		Demo12 d=new Demo12();
		String s=d.meth3("Hi", 15, 10);
		System.out.println(s);
		return L;
	}
	public static void main(String[] args) {
		Demo12 d=new Demo12();
		System.out.println("Start");
		int result=d.meth4(20, 10);
		System.out.println(result);
		d.meth1();
	}

}
