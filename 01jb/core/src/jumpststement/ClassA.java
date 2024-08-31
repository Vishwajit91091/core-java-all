package jumpststement;

public class ClassA {

	void meth1(int b) {
		int a =10;
		while (a <= 20) {
			if (a == 15) {
				while (b <= 30) {
					if (b == 25) {
						break;
					}
					System.out.println("b value is: " + b);
					b++;
				}
			}
			System.out.println("a value is: " + a);
			a++;
		}
	}

	public static void main(String[] args) {
		 new ClassA().meth1(20);

	}

}
