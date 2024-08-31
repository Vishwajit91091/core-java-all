package multithreding;

public class ClassA implements Runnable//extends Thread
{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("run() executed: "+i);
		}
	}

	public static void main(String[] args) {
		ClassA aobj=new ClassA();
		Thread t1=new Thread(aobj);
		//t1.start();
		System.out.println("=============");
	    t1.run();
	    Thread t2=new Thread();
	    //t2.start();
	    //t2.run();
	}

}
