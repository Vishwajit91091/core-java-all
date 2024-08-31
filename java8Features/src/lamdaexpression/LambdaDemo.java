package lamdaexpression;

public class LambdaDemo 
{
	void display()
	{
		InterfaceA x=()->System.out.println(" Hello World..! ");
		InterfaceA y=()->{
			System.out.println("hii..!");
			System.out.println("Hellow..!");
		};
		x.meth1();
		y.meth1();
		InterfaceB z=(int a,int b)->System.out.println("Additions: "+(a+b));
		z.meth2(50, 60);
		
		InterfaceC obj=(int p,int q)->
		{
			if(p<=q) {
				System.out.println("p: "+p);
				return p+100;
			}
			else {
				System.out.println("q: "+q);
				return q+500;
			}
		};
		obj.meth3(30, 20);
	}

	public static void main(String[] args)
	{
	  new LambdaDemo().display();	

	}

}
