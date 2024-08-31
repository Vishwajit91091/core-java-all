package basic;

public class AreaOfTrangle {
	void meth1() {
		double b=25.75;
		double h=12.25;
		double area=0.5*b*h;
		System.out.println("area=> "+area);
	}

	public static void main(String[] args) {
		new AreaOfTrangle().meth1();
	}
}
