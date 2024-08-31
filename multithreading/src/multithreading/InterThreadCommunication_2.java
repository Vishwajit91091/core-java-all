package multithreading;

public class InterThreadCommunication_2 {

	public static void main(String[] args) {
		InterThreadCommunication_1 obj=new InterThreadCommunication_1();
		new Thread() // Annonymous Inner Class stsrt here
		{
			public void run() {
				try {
					obj.with_draw(15000);
				}
				catch(Exception e) {
					e.printStackTrace();
				}
			}
			
		}
		.start();
		
		new Thread() {
			public void run() {
			obj.deposit(10000);
			}// Annonymous Inner Class end Here
		}
     .start();
	}

}
