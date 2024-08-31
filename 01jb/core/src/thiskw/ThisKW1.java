package thiskw;

public class ThisKW1 {
	//It is used to resolve the ambguty between instance variable and local variable
	int a=10;
	static int b=20;
	
	void meth1() {
	int a=111;
	int b=222;
	System.out.println("meth1() called");
	System.out.println("Instance Variable: "+this.a);
	System.out.println("Static Variable: "+ThisKW1.b);
	System.out.println("Static Variable: "+this.b);	
	}

	public static void main(String[] args) {
	
		new ThisKW1().meth1();

	}

}
