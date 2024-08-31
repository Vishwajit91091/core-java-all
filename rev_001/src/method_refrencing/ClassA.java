package method_refrencing;

public class ClassA 
{
	void display() {
		System.out.println("Implementing method Refrencing");
		//InterfaceA aobj=new ClassB()::meth1;
		//InterfaceA aobj=ClassB::meth2;
		InterfaceA aobj=ClassB::new;
		aobj.show();
	}

	public static void main(String[] args) {
		new ClassA().display();

	}

}
