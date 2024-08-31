package multithreding;

public class Sleep_Method2 extends Thread
{
	public void run() {
		System.out.println("I am Ready for Attending Interview");
		for(int i=1;i<=5;i++) {
			System.out.println("This is my: "+i+" interview");
		}
		System.out.println("I got Placed And i Can Relax");
		try {
			Thread.sleep(5000);
		}
		catch(Exception e) {
			System.out.println("My sleep got disturped");
		}
		System.out.println("Time to go for Office");
	}

	public static void main(String[] args) {
		Sleep_Method2 obj=new Sleep_Method2();
		Thread t1=new Thread(obj);
		t1.start();
		t1.interrupt();

	}

}
