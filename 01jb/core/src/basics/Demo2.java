package basics;

public class Demo2 {
	void meth1() {
		System.out.println("meth()1 called");
		Demo2 d1=new Demo2();
		d1.meth2();
		System.out.println(10);
	}

	 void meth2() {
		System.out.println("meth2() clled");
		System.out.println(20);
	}

	public static void main(String[] args) {
	System.out.println("main method called");	
    Demo2 d=new Demo2();
    d.meth3();
    System.out.println("end");
	}

	private void meth3() {
		System.out.println("meth3() Called");
		Demo2 d=new Demo2();
		d.meth1();
		System.out.println(30);
		
	}

}
