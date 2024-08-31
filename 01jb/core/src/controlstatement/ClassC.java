package controlstatement;

public class ClassC {
  void bill(int unit) {
	  int finalBill=unit*100;
	  if(finalBill>=1000) {
		  int discount=(finalBill*10)/100;
		  System.out.println("your finalBill is: "+(finalBill-discount));
	      System.out.println("congratulation you saved:"+discount+"!!!");
	  }
	  else {
		  System.out.println("your finalBill is: "+finalBill);
		  System.out.println("you will get 10% discount if you r spend more: "+(1000-finalBill));
	  }
  }
  public static void main(String[] args) {
	new ClassC().bill(9);
}
}
