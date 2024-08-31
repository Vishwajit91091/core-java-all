package polymorphism;

public class ClassA
{
	public void meth1() {
		System.out.println("ClassA  meth()");
	}
	private void meth1(int a) {
		System.out.println("ClassA  meth()");
	}
	final void meth1(String s,int a) {
		System.out.println("ClassA  meth()");
	}
	void meth1(StringBuffer sb) {
		System.out.println("ClassA  meth()");
	}
	private final void meth1(String s) {
		System.out.println("ClassA  meth()");
	}
	

}
