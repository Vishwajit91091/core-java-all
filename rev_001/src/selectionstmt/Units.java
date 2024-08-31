package selectionstmt;

public class Units 
{
	void meth1(int units) {
		int finalbill=units*100;
		if(finalbill>=1000) {
		  int discount=(finalbill*10)/100;
		  System.out.println("your final bill is "+(finalbill-discount)+" you save your money "+discount);
		}
		else
			System.out.println("your bill is "+finalbill+" if you perches more "+(1000-finalbill)+" then get 10% discount");
	}

	public static void main(String[] args) {
		new Units().meth1(10);

	}

}
