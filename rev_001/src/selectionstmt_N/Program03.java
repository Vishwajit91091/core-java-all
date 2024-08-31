package selectionstmt_N;

public class Program03 
{
	void meth1(int units) {
		int finalbill=units*100;
		if(finalbill>=1000) {
			int discount=(finalbill*10)/100;
			System.out.println("your totalbill is: "+(finalbill-discount)+" you save your money is: "+discount);
		}
		else {
			System.out.println("your total bill is: "+finalbill+" if you perchase more "+(1000-finalbill)+" then get 10% discount");
		}
	}

	public static void main(String[] args) {
		new Program03().meth1(15);

	}

}
