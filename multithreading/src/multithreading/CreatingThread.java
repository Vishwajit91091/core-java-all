package multithreading;

public class CreatingThread extends Thread
{

	public void run() 
	{
		for(int i=1;i<=5;i++) {
			System.out.println("run method executed "+i);
		}	
	}
	public static void main(String[] args) 
	{

		CreatingThread ct=new CreatingThread();
		Thread t1=new Thread(ct);
		t1.start();//a new thread will be created which is responsible for running the run()
		               //present in current class (CreatingThread Class)
		t1.run();//no new thread will be created CreatingThread class will be executed just like a normel method
		
		Thread t2=new Thread();
		t2.start();//a new thread will be created which is responsible for running the run()
                       //present in the thread class
		t2.run();//no new thread will be created Thread class will be executed just like a normel method
		
	}

}
