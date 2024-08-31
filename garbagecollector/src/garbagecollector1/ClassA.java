package garbagecollector1;

public class ClassA 
{
	void meth1()
	{
		System.out.println("meth1() called");
		ClassA aobj=new ClassA(); //(3rd) All the objs present inside the methods
	}
	protected  void finalize()
	{
		System.out.println("garbage has been collected ");
	}

	public static void main(String[] args) 
	{
		ClassA aobj1=new ClassA();
		ClassA aobj2=new ClassA();
		aobj1.meth1();
		//aobj1=null; //(1st) if we r nullifying the refrance
		//aobj1.meth1();// raises a NullPointerException
		//aobj2=aobj1; //(2nd) if we r assining the refrance to another refrance
		//aobj1.meth1();
		System.gc();

	}

}
