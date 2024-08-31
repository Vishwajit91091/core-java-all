package multithreading;

public class Synchronization_2 extends Thread 
{

	public void run()
	{
		String name=Thread.currentThread().getName();
		System.out.println(name+" has enterd run()");
		
		synchronized (this){
			for(int i=1;i<=5;i++) {
				System.out.println(name+" i value: "+i);
			}
			System.out.println(name+" complited execution");
		}
	}
	public static void main(String[] args) 
	{
		Synchronization_2 obj=new Synchronization_2();
		Thread t1=new Thread(obj);
		Thread t2=new Thread(obj);
		
		t1.setName("First-Thread");
		t2.setName("Second-THread");
		
		t1.setPriority(MAX_PRIORITY);
		t2.setPriority(1);
		
		t1.start();
		t2.start();
		
	}

}
