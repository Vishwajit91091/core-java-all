package type_casting;

public class ClassA {
	void implicit() {
		System.out.println("Performing implicit type casting");
		byte b1=50;
		int i1=50;
		float f1=b1;
		System.out.println("byte b1: "+b1);
		System.out.println("int i1: "+i1);
		System.out.println("float f1: "+f1);
		char c1='a';
		int i2=c1;
		System.out.println("char c1: "+c1);
		System.out.println("int i2: "+i2);
	}
	void explicit() {
		System.out.println("performing explicit type casting");
		int x=50;
		byte b1=(byte)x;
		System.out.println("int x: "+x);
		System.out.println("byte b1: "+b1);
		
		int y=65;
		char c1=(char)y;
		System.out.println("int y: "+y);
		System.out.println("byte c1: "+c1);
		
		int z=500;
		byte b2=(byte)z;
		System.out.println("int z: "+z);
		System.out.println("byte b2: "+b2);
		
		float f=10.9999f;
		byte b3=(byte)f;
		System.out.println("float f: "+f);
		System.out.println("byte b3: "+b3);
	}
	void meth1(char c,byte b) {
		System.out.println("c value: "+c);
		System.out.println("b value: "+b);
	}

	public static void main(String[] args) {
		ClassA aobj=new ClassA();
		//aobj.implicit();
       // aobj.explicit();
		aobj.meth1((char)'A', (byte)120);
	}
}
