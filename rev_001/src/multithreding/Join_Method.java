package multithreding;

public class Join_Method extends Thread{

	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Join_Method method: "+i);
		}
	}
}
