package inheritance;

public class KeyPoints2 extends KeyPoints {

	public void meth2() {
		System.out.println("Key Points2 method");
	}
	
	public static void main(String[] args) {
		
		KeyPoints key1=new KeyPoints();//1st point [Has-A-Relation] [P]
		             //we can store Parent class obj in Parent Class refrance
		key1.meth1();
		//key1.meth2();
		
		KeyPoints key2=new KeyPoints2();//2nd point [P](Used in Method Overriding)
		             //we can store child class obj in parent class refrance
		key2.meth1();
		//key2.meth2();
		
		KeyPoints2 key3=new KeyPoints2();//3rd point [P & C](Is-A-Relation==inheritance)
		               //we can store child child class obj in child class refrance .
		key3.meth1();
		key3.meth2();
		
	   // KeyPoints2 key4=new KeyPoints();//C:E Invalid
		//we can not hold Parent Class obj in Child  class Refrance
        
	}

}
