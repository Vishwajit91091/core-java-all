package basics;

public class Demo01 {
	void meth1() {
		System.out.println("hi");
		System.out.println(10);
	}
	void meth2() {
		System.out.println("hello");
		System.out.println(20);
	}
	public static void main(String[] args) {
		System.out.println("Start");
		System.out.println("Java Is Awsome");
		Demo01 d=new Demo01();
		d.meth1();
		System.out.println("end");
		d.meth2();
	}

}
