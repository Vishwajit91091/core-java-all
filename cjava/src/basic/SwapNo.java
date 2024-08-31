package basic;

public class SwapNo
{
	void meth1(){
		int a=10;
		int b=20;
		int c;
		System.out.println("before swap "+a +" "+b);
		c=a; a=b; b=c;
		System.out.println("after swap "+a +" "+b);
	}
	
	public static void main(String[] args) {
		new SwapNo().meth1();
	}

}
