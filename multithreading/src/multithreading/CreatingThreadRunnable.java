package multithreading;

public class CreatingThreadRunnable implements Runnable
{
	public void run()
	{
	 for(int i=1;i<=5;i++) {
		 System.out.println("run() executed "+i);
	 }
	}

	public static void main(String[] args) 
	{
		CreatingThreadRunnable ci=new CreatingThreadRunnable();
		Thread t1=new Thread(ci);
		t1.start();
		t1.run();
		Thread t2=new Thread();
		t2.start();
		t2.run();

	}

}
