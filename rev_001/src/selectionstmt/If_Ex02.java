package selectionstmt;

public class If_Ex02 {
	
	void bill(int unit) {
		int finalbill=(unit*100);
		if(finalbill>=1000) {
			int discount=(finalbill*10)/100;
			System.out.println("your final bill is: "+(finalbill-discount));
			System.out.println("you save the money: "+discount);
		}
		else {
			System.out.println("your finalbill is: "+finalbill);
			System.out.println("if u r purches more "+(1000-finalbill)+" then get 10%n discount");
		}
	}

	public static void main(String[] args) {
   
	  new If_Ex02().bill(2);
	}

}
