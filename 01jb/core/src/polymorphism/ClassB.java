package polymorphism;

public class ClassB extends ClassA
{
	void meth1() //overriding method
	{
		System.out.println(10);
	}
	void meth2(int x) {
		System.out.println(20);
	}
	@Override   //Annotations->provides Additional Informaion to the compiler
	protected void meth3(int x,String data) {
		System.out.println(30);
	}
	@Override
	String meth4(String s) {
		System.out.println(40);
		return "Java Is Awsome";
	}
	static void meth5() {
		System.out.println(50);
	}
	void meth1(char x) {
		System.out.println(60);
	}
	ClassB meth6() {
		System.out.println(70);
		return new ClassB();
	}

	public static void main(String[] args) {
		ClassA aobj=new ClassA();
		aobj.meth1();
		System.out.println("===================");
		ClassA aobj2=new ClassB();
		aobj2.meth1();
		aobj2.meth2(100);
		aobj2.meth3(100, "java");
		aobj2.meth4("java");
		aobj2.meth1('A');
        aobj2.meth5();
        aobj2.meth6();
	}

}
