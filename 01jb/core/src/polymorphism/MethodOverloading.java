package polymorphism;

public class MethodOverloading {

	public static final void meth1() {
		System.out.println(10);
	}
	int meth1(int a) {
		System.out.println(20);
		return a;
	}
	private  final static void meth1(int a,String s) {
		System.out.println(30);
	}
	String meth1(String s ,int a) {
		System.out.println(40);
		return s;
	}
	final protected void meth1(String a) {
		System.out.println(50);
	}
	static StringBuffer meth1(StringBuffer sb) {
		System.out.println(60);
		return sb;
	}
	private void meth1(byte b) {
		System.out.println(70);
	}
	public static void main(String[] args) {
		System.out.println("Implementing Method Overloading");
		MethodOverloading obj=new MethodOverloading();
		obj.meth1();
		obj.meth1(100);
		obj.meth1(100,"java");
		obj.meth1("java",100);
		obj.meth1("java");
		obj.meth1(new StringBuffer("java"));
		obj.meth1((byte)100);
		obj.main();
		obj.main(100);
		
	}
	public static void main() {
		System.out.println("1st Main()");
	}
	public static void main(int a) {
		System.out.println("2nd main() "+a);
	}
	MethodOverloading(){
		this("java is Awsome");
		System.out.println("Default Constructor");
		System.out.println("========================");
	}
	MethodOverloading(String s){
		System.out.println(s);
	}

}
