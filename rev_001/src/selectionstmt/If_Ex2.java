package selectionstmt;

public class If_Ex2 {
	
	void bill(int units) {
		int finalbill=units*100;
		if(finalbill>=1000) {
			int discount=(finalbill*10)/100;
			System.out.println("your final bill is: "+(finalbill-discount));
			System.out.println("congratulations you saved: "+discount+"!!!");
		}
		else {
			System.out.println("your finalbill is: "+finalbill);
			System.out.println("you will get 10% discount if you r spend more:"+(1000-finalbill));
		}
	}

	public static void main(String[] args) {
     new If_Ex2().bill(2);
	}

}
