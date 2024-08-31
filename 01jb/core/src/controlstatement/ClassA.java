package controlstatement;

public class ClassA {
	void meth1(int a, int b, int c) {
		if (a > b) {
			if (a > c)
				System.out.println(a + " is the biggest among the three ");

			else
				System.out.println(c + " is biggest of among the three ");

		} else {
			if (b > c)
				System.out.println(b + " is the biggest among the three ");

			else
				System.out.println(c + " is biggest of the three ");
		}

	}

	public static void main(String[] args) {
		new ClassA().meth1(20, 10, 30);
	}

}
