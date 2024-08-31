package multithreading;

public class SleepMethod {

	public static void main(String[] args) throws InterruptedException
	{
		Thread.sleep(5000);
		System.out.println('J');
		Thread.sleep(5000);
		System.out.println('A');
		Thread.sleep(5000);
		System.out.println('V');
		Thread.sleep(5000,500);
		System.out.println('A');
	}

}
