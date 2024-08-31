package multithreading;

public class JoinMethod1 extends Thread
{

	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Join Method1");
		}
	}
}
