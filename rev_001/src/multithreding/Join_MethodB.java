package multithreding;

public class Join_MethodB {

	public static void main(String[] args) throws InterruptedException
	{
		Join_Method obj=new Join_Method();
		obj.start();
		obj.join();
		Thread t1=new Thread(obj);
		t1.start();
		for(int i=1;i<=5;i++) {
			System.out.println("Join_MethodB...method: "+i);
		}

	}

}
