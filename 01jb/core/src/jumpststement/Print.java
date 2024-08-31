package jumpststement;

public class Print {

	void meth1() {
		System.out.println("Implementing Jump Statement");
		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				//break; // used only inside switch,loop,blocks
			    //continue;//used only inside loop & blocks
				 return; //can used any where according to the programming requirment
			}
			System.out.println("i value is: " + i);
		}
		System.out.println("Compiler came out from the loop");
	}

	public static void main(String[] args) {

		System.out.println("Start");
		new Print().meth1();
		System.out.println("End");
	}
}
