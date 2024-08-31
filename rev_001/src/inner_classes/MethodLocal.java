package inner_classes;

public class MethodLocal {

	void meth1() {
		final String s="Java";
		class InnerClass{
			void show() {
				System.out.println(s.concat(" is awsome"));
			}
			InnerClass(){
				System.out.println("Inner Class Constructor");
			}
		}	
			InnerClass iobj=new InnerClass();
			iobj.show();
	
	}
	public static void main(String[] args) {
     
		new MethodLocal().meth1();
	}
}
