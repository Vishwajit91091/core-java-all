package controlstatement;

public class FindADay {
 
	void meth1(int n) {
		switch(n) {
		case 1:{
			System.out.println("sunaday");
		}
		break;
		case 2:{
			System.out.println("monaday");
		}
		break;
		case 3:{
			System.out.println("tuesday");
		}
		break;
		case 4:{
			System.out.println("wednesday");
		}
		break;
		case 5:{
			System.out.println("thursday");
		}
		break;
		case 6:{
			System.out.println("friday");
		}
		break;
		case 7:{
			System.out.println("saturday");
		}
		break;
		default:{
			System.out.println("please enter 1 to 7 no only");
		}
		
		}
	}
	public static void main(String[] args) {
		new FindADay().meth1(1);
	}
}
