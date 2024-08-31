package selectionstmt;

public class If_else_Ex {
	void meth1(int  a) {
		System.out.println("--------meth1()-----------");
		if(a<=50) {
			System.out.println("hii..!");
		}
		System.out.println("meth1 execution completed");
	}
	void meth2(int a) {
		System.out.println("--------meth2()-----------");
		if(a==10)
			System.out.println("Hi...!");
		System.out.println("Java is awsome");
		System.out.println("meth2() execution completed");
	}
	void meth3(int a) {
		System.out.println("--------meth2()-----------");
		if(!(a<=new If_else_Ex().meth4()*2)) {
			System.out.println("if block executed");
			System.out.println("Hii..!");
		}
		else {
			System.out.println("else block is executed");
			System.out.println("Hello...");
		}
		System.out.println("meth3() execution completed");
	}
	int meth4() {
		System.out.println("meth4() called");
		return 50;
	}
	void meth5(int a) {
		System.out.println("--------meth5()---------");
		if(a<=10) 
			//int x=100; //C:E
		    System.out.println("hii..");
		   //System.out.println("Hello World..!");
		else
			System.out.println("Hello...");
		System.out.println("meth5() execution completed");
	}
	void meth6(int a) {
		System.out.println("-------meth6()---------");
		if(true) {
			System.out.println("if block executed");
		}
		else {
			System.out.println("else block executed");//Dead Coad
		}
		System.out.println("meth6() execution completed");
	}
	void meth7(int num) {
		System.out.println("--------meth7()-------");
		if(num>0) {
			System.out.println(num+" is positive no");
		}
		else if(num<0) {
			System.out.println(num+" is negative no ");
		}
		else
			System.out.println("no is equal to 0 ");
	}

	void meth8(int a,int b,int c) {
		System.out.println("---------meth8()-------");
		if(a<=10) {
			if(b<=50) 
				System.out.println("hii..");
			else
				System.out.println("hello..");
		}
		else {
			if(c<=50)
				System.out.println("Java");
			else
				System.out.println("Oracle");
		}
		System.out.println("meth8() execution completed");
	}
	public static void main(String[] args) {
		If_else_Ex obj=new If_else_Ex();
		//obj.meth1(20);
		//obj.meth2(10);
		//obj.meth3(100);
		//obj.meth5(10);
		//obj.meth6(10);
		//obj.meth7(0);
		obj.meth8(50, 10, (15*2));
	}

}
