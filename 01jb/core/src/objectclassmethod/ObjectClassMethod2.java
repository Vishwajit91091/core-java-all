package objectclassmethod;

public class ObjectClassMethod2 {

	void meth1() {
		System.out.println("Java is awsome");
	}

	@Override
	protected void finalize() {
		System.out.println("Garbage Has Been Called");
	}

	void meth3() {
		ObjectClassMethod2 aobj1 = new ObjectClassMethod2();
		ObjectClassMethod2 aobj2 = new ObjectClassMethod2();
		
		System.out.println("Get Class(): "+aobj1.getClass());
		System.out.println("Get Class(): "+aobj2.getClass());
		
		System.out.println("==================================");
		System.out.println("aobj1: "+aobj1.toString());
		System.out.println("aobj2: "+aobj2.toString());
		
		System.out.println("==================================");
		aobj1.meth1();
		aobj1=null;
		System.gc();//way to call garbage collector mainualy
		//aobj1.meth1();//generates a null pointer Exception
	}

	public static void main(String[] args) {
		new ObjectClassMethod2().meth3();
	}

}
