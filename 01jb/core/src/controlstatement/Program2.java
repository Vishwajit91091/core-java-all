package controlstatement;

public class Program2 {
 
	void meth1(int marks) {
		
		if(marks>=80) {
			System.out.println("A grade");
		}
		else if(marks>=60 && marks<=80){
			System.out.println("B grade");
		}
		else if(marks>=45 && marks<=60) {
			System.out.println("C grade");
		}
		else if(marks>=45 && marks<=60) {
			System.out.println("D gread");
		}
		else if(marks<=25){
			System.out.println("Fail");
		}
	}
	public static void main(String[] args) {
		new Program2().meth1(90);
	}
}
