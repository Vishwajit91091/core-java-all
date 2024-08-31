package basics;

import java.security.DomainCombiner;

public class TypeCasting2 {

	void implicit() {
		byte b=10;
		System.out.println("byte value is "+b);
		short s=b;
		System.out.println("short value is "+s);
		s++;
		int i=s++;
		System.out.println("int values is "+i);
		System.out.println("short value is "+s);
		
		long l=i;
		System.out.println("long values is "+(--l));
		float f=l;
		System.out.println("the value of floate is "+(f+b));
		double d=(--f);
		System.out.println("the value of double is "+d);
		show();
		
		if(!(d==f)) {
			
			System.out.println("equals");
		}
		else {
			System.out.println("not equals");
		}
		
	}
	public static void main(String[] args) {
		TypeCasting2 c2=new TypeCasting2();
		c2.implicit();
	}
	static void show() {
		char c='A';
		int a=++c;
		System.out.println(a);
		TypeCasting2 c2=new TypeCasting2();
		String s=c2.meth1();
		System.out.println(s);
	}
        String meth1() {
		String s="Implisit Casting is done by the compiler automatically";
		return s;
	}
}
