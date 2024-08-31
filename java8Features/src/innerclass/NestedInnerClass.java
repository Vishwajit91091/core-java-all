package innerclass;

public class NestedInnerClass 
{
	private void meth1() {
		System.out.println("Outer classmethod");
	}
	NestedInnerClass(){
		System.out.println("outer class constructor");
	}
	static {
		System.out.println("outer class static method");
	}
	 class InnerClass
	{
		void show() {
			System.out.println("Inner class method");
			meth1();
		}
		InnerClass(){
			System.out.println("InnerClass constructor");
		}
		static {
			System.out.println("static InnerClass ");
		}
		public static void main(String[] args) 
		{
			System.out.println("inner class main() call");
		}	
		
	}

	public static void main(String[] args) 
	{
		new NestedInnerClass().meth1();
		NestedInnerClass.InnerClass iobj= new NestedInnerClass().new InnerClass();
		iobj.show();
	}

}
