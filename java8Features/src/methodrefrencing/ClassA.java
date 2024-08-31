package methodrefrencing;

public class ClassA 
{
	void display()
	{
		System.out.println("Implementing method Referancing");
		InterfaceA aobj=new ClassB()::meth1;//Non static method Referencing
		//InterfaceA aobj=ClassB::meth2; //static method Referencing
		//InterfaceA aobj=ClassB::new; //Constructor Referencing
		aobj.show();
	}
	public static void main(String[] args) 
	{
		new ClassA().display();
		
	}

}
