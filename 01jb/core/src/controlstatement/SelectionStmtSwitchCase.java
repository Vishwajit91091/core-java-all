package controlstatement;

public class SelectionStmtSwitchCase {

	 void meth1() {
		 System.out.println("Implementing Switch Case");
		 
		 int x=100;
		 byte b=50;
		 final int i=10;
		 //i++; C.E because final variables r constants we can't change them
		 String day="sunday";
		 switch(b+250-270+35-25+10) {
		 //System.out.println("Hello World!!");
		 default:
			 System.out.println("invalid Input");
			 break;
		 case i:
			 System.out.println("case 10 executed");
			 break;
		 case 'A':
			 System.out.println("int & Char Both r Compatable");
			 break;
		 case 300-270:
			 System.out.println("case 30 is executed");
			 break;
		 case 40:
			 System.out.println("case 40 is executed");
			 if(x<=100) {
				 System.out.println("if block executed");
				 new SelectionStmtSwitchCase().meth2();
			 }
			 else {
				 System.out.println("else bock executed");
				 new SelectionStmtSwitchCase().meth3();
			 }
			 break;
		 case 50:
			 System.out.println("case 50 is executed");
			 switch(day) {
			 case "saturday":
				 System.out.println("today is saturday");
				 break;
			
		 case "sunday":
			 System.out.println("today  is sunday");
			 break;
			 }
			 break;
		 }
		 System.out.println("Compiler Came Out From Switch Case");
	 }
	 void meth2() {
		 System.out.println("meth2() called");
	 }
	 void meth3() {
		 System.out.println("meth3() called");
	 }
	public static void main(String[] args) {
	 new SelectionStmtSwitchCase().meth1();

	}

}
