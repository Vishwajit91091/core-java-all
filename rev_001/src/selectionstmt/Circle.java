package selectionstmt;

public class Circle {
	void meth1(int a,int b)
	{
		if(a==b)
		{
			System.out.println("circle");
		}
		else
			System.out.println("rectangle");
	}

	public static void main(String[] args) {
		new Circle().meth1(5,5);
		Circle b=new Circle();
			b.meth1(5,2);
	}

}
