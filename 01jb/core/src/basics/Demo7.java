package basics;

public class Demo7 {

	public static void main(String[] args) {
		Demo7 d = new Demo7();
		d.meth1(10, 20);
		d.meth2(20, 10);
		d.meth3(10, 20);
		d.meth4(20, 10);
	}

	void meth1(int i, int j) {
		System.out.println("Meth1() called");
		System.out.println("value of :"+i);
		System.out.println("value of :"+j);
		System.out.println("Addition :"+(i+j));

	}

	void meth2(int i, int j) {
		System.out.println("Meth2() called");
		System.out.println("value of :"+i);
		System.out.println("value of :"+j);
		System.out.println("substraction :"+(i-j));

	}

	void meth3(int i, int j) {
		System.out.println("Meth3() called");
		System.out.println("value of :"+i);
		System.out.println("value of :"+j);
		System.out.println("multiplaction :"+(i+j));

	}

	void meth4(int i, int j) {
		System.out.println("Meth4() called");
		System.out.println("value of :"+i);
		System.out.println("value of :"+j);
		System.out.println("Division :"+(i%j));

	}

}
