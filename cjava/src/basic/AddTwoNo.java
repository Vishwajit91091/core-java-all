package basic;

public class AddTwoNo {
  void meth1(int a,int b) {
	int sum=a+b; 
	System.out.println("sum=> "+sum);
  }
  public static void main(String[] args) {
	 new AddTwoNo().meth1(10, 20);
}

}
