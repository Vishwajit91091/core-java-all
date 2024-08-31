package multithreading;

public class InterThreadCommunication_1 {

	int amount=10000;
	synchronized void with_draw(int amount)throws InterruptedException
	{
		if(this.amount<amount) {
			System.out.println("Insufficient balance");
			wait();// wait(5000)
			System.out.println("Amount Cradited");
			this.amount-=amount;
			System.out.println("with draw succeffuly \nbalance is: "+this.amount);
		}
		else {
			this.amount-=amount;
			System.out.println("withdraw succfull \n balance is: "+this.amount);
		}
	}
	synchronized void deposit(int amount) {
		this.amount+=amount;
		System.out.println("Deposit succefully \n balance is: "+this.amount);
		notify();
		notifyAll();
	}
	
}
