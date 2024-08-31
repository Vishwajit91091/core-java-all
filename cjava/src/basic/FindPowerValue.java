package basic;
import java.lang.Math;
public class FindPowerValue {

	void meth1() {
		int a=(int)Math.pow(5, 2);
		System.out.println("s^2 is: "+a);
		
		double d=Math.pow(1.5, 3);
		System.out.println("1.5^3 is: "+d);
		
		double b=Math.pow(50, 2);
		System.out.println("50^2 is: "+b);
	}
	
	public static void main(String[] args) {
		new FindPowerValue().meth1();
		
	}
}
