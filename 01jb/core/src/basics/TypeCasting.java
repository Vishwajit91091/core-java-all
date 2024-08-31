package basics;

public class TypeCasting {
 
	void implicit() {
		System.out.println("Performing Implict Type Conversion");
		byte b1=50;
		int i1=50;
		float f1=b1;
		System.out.println("byte b1:"+b1);
		System.out.println("int i1:"+i1);
		System.out.println("byte b1:"+f1);
		
		char c1='a';
		int i2=c1;
		System.out.println("char c1:"+c1);
		System.out.println("int i2:"+i2);
		//int and char both r compatable datatype 
		
	}
	void explicit() {
		System.out.println("performing explicit type conversion");
		int x=50;
		byte b1=(byte)x;
		System.out.println("int x: "+x);
		System.out.println("byte b1: "+b1);
		
		int y=65;
		char c=(char)y;
		System.out.println("int y: "+y);
		System.out.println("char c: "+c);
		
		System.out.println("===================");
		
		int z=500;
		byte b2=(byte)z;//byte range :-128 to 127
		System.out.println("int z: "+z);//500
		System.out.println("byte b2: "+b2);//-12
		
		System.out.println("=======================");
		
		float f=10.9999f;
		byte b3=(byte)f;
		System.out.println("float f:"+f);
		System.out.println("byte b3:"+b3);
	}
	void meth1(char c,byte b) {
		System.out.println("meth1() called");
		System.out.println("c value: "+c);
		System.out.println("b value: "+b);
	}
	public static void main(String[] args) {
		
		TypeCasting ts=new TypeCasting();
			ts.implicit();
			System.out.println("===================");
			ts.explicit();
			System.out.println("===================");
			ts.meth1((char)66, (byte)100);
	}
}
