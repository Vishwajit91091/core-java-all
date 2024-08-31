package multithreding;

public class SetPriority extends Thread
{
	public void run() {
		String name=Thread.currentThread().getName();
		int priority=Thread.currentThread().getPriority();
		for(int i=1;i<=5;i++) {
			System.out.println(name+"("+priority+")"+"has executed run()"+i);
		}
	}

	public static void main(String[] args) {
		SetPriority obj=new SetPriority();
		Thread t1=new Thread(obj);
		Thread t2=new Thread(obj);
		t1.setName("First Thread");
		t2.setName("Second Thread");
		t1.setPriority(1);
		t2.setPriority(MAX_PRIORITY);
		t1.start();
		t2.start();
		
	}

}
