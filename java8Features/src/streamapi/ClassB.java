package streamapi;

public class ClassB 
{
	static int i=5;//11
	int j=10;


	public static void main(String[] args)
	{
		ClassB obj=new ClassB();
		System.out.println(obj.i+" "+obj.j);
		ClassB.i=obj.j+1;
		obj.j=ClassB.i+1;
		ClassB obj2=new ClassB();
		System.out.println(obj2.i+" "+obj2.j);
		
	}
	
}


