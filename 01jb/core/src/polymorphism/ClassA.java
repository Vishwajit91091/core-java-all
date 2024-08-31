package polymorphism;

public class ClassA {

	void meth1() //overridden method
	{
		System.out.println("ClassA meth1()");
	}
	void meth2(int a) {
		System.out.println("ClassA meth2()");
	}
	protected void meth3(int a,String s) {
		System.out.println("ClassA meth3()"+s);
	}
	String meth4(String s) {
		System.out.println("ClassA meth4()"+s);
		return s;
	}
	static void meth5() {
		System.out.println("ClassA static method call");
	}
	void meth1(char c) {
		System.out.println("ClassA meth1"+c);
	}
	ClassA meth6() {
	System.out.println("ClassA meth6() called");
	return new ClassA();
	}
	
}
/*
  1)if we want to achive Overriding 100% we need to achive Inheritance.
  2)if we can not inherit a method we can not provide overriding for that method.
      
      Ex:private method can not be overridden [because they can't be inherited]
      
  3) private >default >protected >public.
  4)child class method should not be restrictive than the parent class method.
  5)we can not override a static method,it may seen like Overriding but actualy it method hiding.
  6)Java Constructor can't be inherite so we can't override.
  7)After Jdk 1.5 return type may not be same in co-verient return type
       (co-verient return type concept is applicable only Class Interface not premitive datatype).   
*/






