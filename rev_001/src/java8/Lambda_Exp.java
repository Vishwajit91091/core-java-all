package java8;

public class Lambda_Exp 
{
	void meth() {
		//InterfaceA x=()->System.out.println("Hellow World..!!");
		InterfaceA x=()->{
			System.out.println("Hello..!");
			System.out.println("Hii..!!");
		};
		x.meth1();
		InterfaceB y=(int m,int n)->{
			System.out.println("Hiiii..!!");
			System.out.println("Hello..!!");
		};
		InterfaceB y1=(int a,int b)->System.out.println("Addition: "+(a+b));
			
		y1.meth2(20, 30);
		y.meth2(10, 20);
		
	}
	public static void main(String[] args)
	{
		Lambda_Exp a=new Lambda_Exp();
		a.meth();

	}

}
