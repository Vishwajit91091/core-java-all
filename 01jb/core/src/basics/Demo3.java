package basics;

public class Demo3 {

	void meth1() {
		System.out.println("hi");
		System.out.println(1+99);
	}
	void meth2() {
		System.out.println("hello");
		int a=100;
		System.out.println(a);
		System.out.println("a");
		System.out.println(a-99);
	}
	public static void main(String[] args) {
		System.out.println("start");
		Demo3 d=new Demo3();
		d.meth1();
		d.meth2();
		System.out.println("end");
	}
}
