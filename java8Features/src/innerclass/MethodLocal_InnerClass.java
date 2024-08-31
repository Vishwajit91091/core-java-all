package innerclass;

public class MethodLocal_InnerClass
{
	void meth1() 
	{
		String s="Java";
		class InnerClass
		{
			void show() {
				System.out.println(s.concat(" is awsome"));
			}
			InnerClass(){
				System.out.println("Inner class constructor");
			}
			
		}
		InnerClass iobj=new InnerClass();
		iobj.show();
	}

	public static void main(String[] args) {
		new MethodLocal_InnerClass().meth1();
	}

}
