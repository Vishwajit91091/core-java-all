package multithreading;
/*
   ->join acts on two diff threads
   ->join is a method name
   
   ->Synchronization controls multiples thread in a single resource
   ->it is a keyword two threads act on the same resource
   
   ->we can achive synchronization in two ways 
   1)by using  synchronized block  most recumanded
   2)by using synchronized method 
 */
public class Synchronization extends Thread
{
	public void run()
	{
		criticalResource();
	}
	

	synchronized void criticalResource() {

		 String name=Thread.currentThread().getName();
		 System.out.println(name+" has entered criticalResource()");
		 for(int i=1;i<=5;i++)
		 {
			 System.out.println(name+" i value: "+i);
		 }
	}


	public static void main(String[] args) 
	{
		Synchronization obj=new Synchronization();
		Thread t1=new Thread(obj);
		Thread t2=new Thread(obj);
		
		t1.setName("First-Thread");
		t2.setName("Second-Thread");
		
		t1.setPriority(MIN_PRIORITY);
        t2.setPriority(MAX_PRIORITY);
        
        t1.start();
        t2.start();
		
	}

}
