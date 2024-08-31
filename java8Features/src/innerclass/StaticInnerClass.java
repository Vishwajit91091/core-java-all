package innerclass;

public class StaticInnerClass 
{

	int x=10;
	static int y=20;
	
	void meth1()
	{
		System.out.println("Outer class method");
	}
	StaticInnerClass(){
		System.out.println("outer class constructor");
	}
	static {
		System.out.println("outer class static block");
	}
	
	static class InnerClass
	{
		void show() {
			System.out.println("x value: "+new StaticInnerClass().x);
			System.out.println("y value: "+y);
		}
		InnerClass(){
			System.out.println("Inner class constructor");
		}
		static {
			System.out.println("static inner class block");
		}
		public static void main(String[] args) 
		{
			System.out.println("Inner class main() call");
			new InnerClass().show();
		}	
		
	}
	public static void main(String[] args) 
	{
		System.out.println("outer class main() call");
		
		StaticInnerClass.InnerClass obj=new StaticInnerClass.InnerClass();
		obj.show();

	}

}
