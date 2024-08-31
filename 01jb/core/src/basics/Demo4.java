package basics;

public class Demo4 {
	void meth1() {
		int a=10;
		int b=20;
		Demo4 d=new Demo4();
		int c=a+b;
		System.out.println(a+b);
		d.meth3();
		System.out.println(c+c);
	}
	void meth2() {
		System.out.println("meth1 alled");
		Demo4 d=new Demo4();
		System.out.println(50);
		d.meth1();
	}

	private void meth3() {
		System.out.println(100/2);
	}
	public static void main(String[] args) {
		System.out.println("stsrt");
		System.out.println("java Is Awsome");
		Demo4 d=new Demo4();
		d.meth2();
		System.out.println("end");
	}
    
}
