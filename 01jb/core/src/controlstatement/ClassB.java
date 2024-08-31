package controlstatement;

public class ClassB {

	void meth1(int length,int breath) {
		if(length==breath) {
		System.out.println("it is a square");	
		}
		else
		{
			System.out.println("it is a rectangle");
		}	
	}
	public static void main(String[] args) {
		new ClassB().meth1(100, 200);
	}
}
