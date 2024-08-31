package innerclass;

 interface demo
{
	void print();
}
 public class ClassX
{
	 static demo out =new demo() {
		 @Override
		public void print() {
			 System.out.println("Start");
			 //super.print();
			 System.out.println("I am AnynomysInnerClass");
			 System.out.println("End");
		 }
	 };
	public static void main(String[] args) 
	{
		out.print();

	}
  }

