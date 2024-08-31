package basics;

public class Demo5 {
	void meth1() {
		Demo5 d=new Demo5();
		d.meth5();
		int a=10;
		System.out.println(10);
		System.out.println(54+a);
		
	}

	private void meth2() {
		int a=20;
		System.out.println(78-a);
		
	}

	private void meth3() {
		int a=30;
		Demo5 d=new Demo5();
		System.out.println(89+1);
		d.meth1();
		System.out.println(10);
		
	}

	private void meth4() {
		int a=10;
		System.out.println(89);
		System.out.println(85);
		System.out.println(44);
	}

	private void meth5() {
		
		System.out.println(77);
		Demo5 d=new Demo5();
		d.meth2();
		System.out.println(99);		
	}
	public static void main(String[] args) {
		System.out.println("start");
		Demo5 d=new Demo5();
		d.meth3();
		System.out.println("end");
	}

}
