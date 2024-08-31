package thiskw;

public class ThisKW4 {
	/*
	    this()  it is a constructor call
	    it is used to call present class constructor 
	    we need to use this() only inside a constructor that to as a FIRST statement 
    */
	
	void meth1() {
		//this();//C:E
		System.out.println("Meth1() called");
	}
	ThisKW4(){
		System.out.println("Default Constructor");
	}
	ThisKW4(String s){
		this();
		this.meth1();
		System.out.println("Parametrize Constructor");
	}
	
	public static void main(String[] args) {
		
		new ThisKW4("Java");
		

	}

}
