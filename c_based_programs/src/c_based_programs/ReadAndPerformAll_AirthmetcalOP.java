package c_based_programs;

public class ReadAndPerformAll_AirthmetcalOP {

	void meth1(int a, int b) {
		System.out.println("sum of two no: "+(a+b));
		System.out.println("substract of two no: "+(a-b));
		System.out.println("multiplaction of two no: "+(a*b));
		System.out.println("divide of two no: "+(a/b));
		System.out.println("mod of two no: "+(a%b));
	}
	public static void main(String[] args) {
		new ReadAndPerformAll_AirthmetcalOP().meth1(10, 20);

	}

}
