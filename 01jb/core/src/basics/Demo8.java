package basics;

public class Demo8 {
	void meth1(int a,int b) {
	
		Demo8 d=new Demo8();
		System.out.println(a-1);
		System.out.println(b);
		d.meth4(10, 2, 2);
	}
	void meth2(int x) {
		Demo8 d=new Demo8();
		System.out.println(x);
		d.meth1(10,10);
		System.out.println(x+9);
		
	}
	void meth3(int x,int y) {
		System.out.println(x*y);
		Demo8 d=new Demo8();
		System.out.println(y);
		d.meth2(1);
		
	}
	void meth4(int a,int b,int c) {
		System.out.println(a+b);
		System.out.println(a/c);
		System.out.println(a-b);
		System.out.println(a*b);
		
	}
	public static void main(String[] args) {
		Demo8 d=new Demo8();
		System.out.println("Start");
		d.meth3(5, 2);
		System.out.println("End");
		
	}

}
