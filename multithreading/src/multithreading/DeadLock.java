package multithreading;

public class DeadLock {

	public static void main(String[] args) {

		final String A = "java";
		final String B = "python";
		Thread t1 = new Thread() {
			public void run() {
				synchronized (A) {
					System.out.println("Thread 1 Locked on A");
					try {
						Thread.sleep(100);
					} catch (Exception e) {
						e.printStackTrace();
					}
					synchronized (B) {
						System.out.println("Thread 1 locked on B");
					}
					System.out.println("No Dead Lock");
				}
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				synchronized (B) {
					System.out.println("Thread 2 locked on B");
					try {
						Thread.sleep(100);
					} catch (Exception e) {
						e.printStackTrace();
					}
					synchronized (A) {
						System.out.println("Thread 2 locked on A");
					}
				}
				System.out.println("no dead lock");
			}
		};
		t1.start();
		t2.start();
	}

}
