package thiskw;

public class ThisKw2 {
	//It is used to call present class methods
	
	int a=50;
	
	void meth1() {
		System.out.println("meth1() called");
		this.meth2();
	}

	 void meth2() {
		System.out.println("meth2() called");
		meth3();
	}
	 void meth3() {
		 System.out.println("meth3() called");
		 this.meth4();
	 }

	 static void meth4() {
		 System.out.println("meth4() called"+new ThisKw2().a);
		// System.out.println("meth4() called"+new this.a); 
		 /*
		   we need to access an instance variable inside a static method with the help of it's 
		   respective class object because we can't use 'this' keyword in static area/context. 
		  */
	 }
	 
	public static void main(String[] args) {
		new ThisKw2().meth1();
        //this.meth1();//C:E because we cant't call 'this' keyword inside a static area
	}

}
