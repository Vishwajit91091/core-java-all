package multithreading;

public class JoinMethod2 
{
	public static void main(String[] args) throws InterruptedException
	{
		JoinMethod1 aobj=new JoinMethod1();
		aobj.start();
        aobj.join();
        /*
         Thread t1=new Thread(aobj);
         t1.start();
         */
        
	

	for(int i=1;i<=5;i++) {
		System.out.println("Join Method2 ");
	}
  }
}