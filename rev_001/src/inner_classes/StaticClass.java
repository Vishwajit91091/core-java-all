package inner_classes;

public class StaticClass 
{
	int x=10;
	static int y=20;
	void meth1() {
		System.out.println("static Outer class method");
	}
	StaticClass(){
		System.out.println("static outer class constructor");
		
	}
	static {
		System.out.println("outer class static block");
	}
	static class InnerClass
	{
		void show() {
			System.out.println("x value: "+new StaticClass().x);
			System.out.println("y value: "+y);
			
		}
		InnerClass(){
			System.out.println("Inner Class Constructor");
		}
		static {
			System.out.println("Inner Class static Block");
		}

	public static void main(String[] args) {
		System.out.println("Inner Class Main() called");
		new InnerClass().show();
	}
	
  }	
	public static void main(String[] args) {
		System.out.println("Outer Class main() Called");
		StaticClass.InnerClass iobj=new StaticClass.InnerClass();
		iobj.show();
		//iobj.me
		
	}
	

}
