package selectionstmt;

public class CheckGivenValueCircleOrNot 
{
	void meth1(int length,int breath) {
		if(length != breath) {
			System.out.println("the given no is rectangle");
		}
		else
			System.out.println("the given no is circle");
	}

	public static void main(String[] args) {
		new CheckGivenValueCircleOrNot().meth1(10, 10); 

	}

}
