package inner_classes;

public class Nested_Inner_Class
{
	private void meth1() {
		System.out.println("Outer Class Method");
	}
	Nested_Inner_Class(){
		System.out.println("Outer Class Constructor");
	}
	static{
		System.out.println("Outer Class Static Block");
	}
	
	class  Inner{
		void show() {
			System.out.println("Inner Class Meth1()");
		}
		Inner(){
			System.out.println("inner class constructor");
		}
		//static {
			//C:E
		//	System.out.println("Inner Class static block");
		//}
	}
	

	public static void main(String[] args) {
		Nested_Inner_Class ns=new Nested_Inner_Class();
		ns.meth1();
		System.out.println();
		Inner i=new Nested_Inner_Class().new Inner();
		i.show();

	}

}
