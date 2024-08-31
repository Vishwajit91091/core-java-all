package abstraction;

public abstract class ClassA {

	abstract void meth1();
	abstract void msg(String s);
	
	void meth2() {
		System.out.println("Class A meth2()Called");
	}
	static void meth3() {
		System.out.println("Class A meth3() Called");
	}
	ClassA(){
		System.out.println("ClassA Default constructor Call");
	}
	public static void main(String[] args) {
		System.out.println("ClassA main()");
		//ClassA aobj=new ClassA();// abstract Class Can't be instantiate
		ClassA.meth3();
	}

}
