package abstraction;

public class ClassB extends ClassA {

	@Override
	void meth1() {
		System.out.println("Abstract meth1() Overriden");
	}
	void msg(String s) {
	System.out.println(s);	
	}
	public static void main(String[] args) {
		System.out.println("ClassB Main()");
		ClassA bobj=new ClassB();
		bobj.meth1();
		bobj.meth2();
		bobj.msg("Java Is Awsome");
	}

}
