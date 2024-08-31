package multithreading;

public class YeildMethod_2 {

	public static void main(String[] args) throws InterruptedException
	{
		YieldMethod_1 obj=new YieldMethod_1();
		obj.start();
		obj.yield();
		
		for(int i=1;i<=5;i++) {
			System.out.println("YieldMethod_2 executed "+i);
		}
	}

}
