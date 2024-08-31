package basic;

public class AreaOfCircle {

	void meth1(double r) {
		double area=(3.14*r)*2;
		System.out.println(area);
		
	}
	public static void main(String[] args) {
		new AreaOfCircle().meth1(2.4);
	}
}
