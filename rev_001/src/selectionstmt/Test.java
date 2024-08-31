package selectionstmt;

public class Test {
	void meth1(int units) {
		int finalbill=units*100;
		if(finalbill>=1000) {
			int discount=(finalbill*10)/100;
			System.out.println(finalbill-discount+" you save your money "+discount);
		}
		else
			System.out.println(finalbill+" if u r perchesed more "+(1000-finalbill)+" then get 10 % discount");
	}

	public static void main(String[] args) {
		new Test().meth1(10);
		
	}

}
