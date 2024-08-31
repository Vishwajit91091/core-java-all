package thiskw;

public class ThisKW3 {
	//It is used to return the instance of the present class 

	ThisKW3 meth1(){
		System.out.println("meth1() called");
		//return new ThisKW3();
		//(or)
		return this;
	}
	ThisKW3 meth2(){
		System.out.println("meth2() called");
		
		return this;
	}
	void meth3() {
		System.out.println("meth3() called");
	}
	public static void main(String[] args) {
		new ThisKW3().meth1().meth2().meth3();// Method Chaining
	}

}
