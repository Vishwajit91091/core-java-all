package basics;

public class Demo11 {

	int meth1() {
		 return 10;			
	}
	void meth2(int x) {
		System.out.println("meth 2 called");
		System.out.println("x value"+x);
		System.out.println(x+x);
	}
	
	
	public static void main(String[] args) {
		System.out.println("******************");
		System.out.println(90+new Demo11().meth1());
		System.out.println("******************");
		System.out.println(new Demo11().meth1());
		System.out.println("******************");
		Demo11 d=new Demo11();
		d.meth2(490+d.meth1());
	}

	

}
