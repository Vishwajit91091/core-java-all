package multithreading;

public class YieldMethod_1 extends Thread
{

	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("YieldMethod_1 executed "+i);
		}
	}
}
