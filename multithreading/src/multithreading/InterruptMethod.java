package multithreading;

public class InterruptMethod extends Thread
{
	public void run() {
		System.out.println("I am Ready for Interview");
		for(int i=1;i<=5;i++) {
			System.out.println("This is my "+i+" Interview");
			
		}
		System.out.println("I got Placed An i can relax");
		
		try{
			Thread.sleep(10000);
		}
		catch(Exception e) {
			System.out.println("My sleep got to distrupt");
		}
		System.out.println("Time to go to Office");
	}

	public static void main(String[] args) {
		InterruptMethod obj=new InterruptMethod();
		Thread t=new Thread(obj);
		t.start();
		t.interrupt();
		
	}

}
