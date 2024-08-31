package objectclassmethod;

public class ObjectClassMethod {
	void meth1() {
		System.out.println("method()1 called");
	}
	int meth2() {
		return 100;
	}
	
    void hashCodeEquals() {
    	
    	 ObjectClassMethod aobj1=new  ObjectClassMethod ();
    	 ObjectClassMethod aobj2=new  ObjectClassMethod ();
    	 int x=aobj1.hashCode();
    	 int y=aobj2.hashCode();
    	 System.out.println("aobj1 hash code: "+x);
    	 System.out.println("aobj2 hash code: "+y);
    	 
    	 System.out.println(new  ObjectClassMethod().hashCode());
    	 System.out.println(new  ObjectClassMethod().meth2());
    	 System.out.println("======================");
    	 
    	 System.out.println(aobj1.equals(aobj2));//false
    	 System.out.println(aobj1.equals(aobj1));//true
    	 System.out.println(aobj1.equals(new ObjectClassMethod()));//false
    	 System.out.println(new ObjectClassMethod().equals(new ObjectClassMethod()));//false
    }
	public static void main(String[] args) {
		new  ObjectClassMethod().hashCodeEquals();

	}

}
