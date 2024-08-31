package finalkw;

public final class FinalKw //fianl class can't be inherited
{
	final int a=10; //final variables r constent we can't modifier their contents
	
	final void meth1() //final methods can't be overridden
	{
		//System.out.println(a++);
		System.out.println(a);
	}
	public static void main(String[] args) 
	{
		new FinalKw().meth1();

	}

}
