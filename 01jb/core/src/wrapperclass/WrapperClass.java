package wrapperclass;

public class WrapperClass 
{
	void meth1() {
		System.out.println("Implimenting Autoboxing");
		int i=10;
		Integer i1=i; //1st way 
		Integer i2=new Integer(i); //2nd way
		Integer i3=Integer.valueOf(i);//3rd way
		
		System.out.println("int PDT: "+i);
		System.out.println("Integer i1 WCO: "+i1);
		System.out.println("Integer i2 WCO: "+i2);
		System.out.println("Integer i3 WCO: "+i3);
		
		System.out.println("========================");
		
		byte b=50;
		Byte b1=Byte.valueOf(b);
		System.out.println("byte PDT: "+b);
		System.out.println("Byte b1 WCO: "+b1);
		
		System.out.println("========================");
		
		char c='A';
		Character c1=new Character(c);
		System.out.println("char PDT: "+c);
		System.out.println("Character c1 WCO: "+c1);
		
		System.out.println("========================");
		
		boolean flag=true;
		Boolean flag1=Boolean.valueOf(flag);
		System.out.println("booleab PDT: "+flag);
		System.out.println("Boolean flag1 WCO: "+flag1);
		
	}

	void meth2() {
		System.out.println("Implementing Auto Un-Boxing");
		
		Integer ival=new Integer(100);
		int i1=ival;//1st way 
		int i2=ival.intValue();//2nd way
		
		System.out.println("Integer WCO ival: "+ival);
		System.out.println("int PDT i1:"+i1);
		System.out.println("int PDT i1:"+i2);
		
		System.out.println("========================");
		
		Byte bval=new Byte((byte)50);
		byte b=bval.byteValue();
		
		System.out.println("Byte WCO bval: "+bval);
		System.out.println("byte PDT i1:"+b);
		
		System.out.println("========================");
		
		Float fval=new Float(100.2f);
		float f=fval.floatValue();
		
		System.out.println("Float WCO fval: "+fval);
		System.out.println("Float PDT i1:"+f);	
	}
	void meth3() {
		System.out.println("meth3() called");
		Integer ival=new Integer(10);
		Integer ival2=new Integer("500");
	   //Integer ival3=new Integer("java");//Generates a NumberFormateException
		
		System.out.println("ival1: "+ival);
		System.out.println("ival2: "+ival2);
		//System.out.println("ival3: "+ival3);
		
		System.out.println("========================");
		
		Boolean bval=new Boolean(true);
		Boolean bval2=new Boolean("true");
		Boolean bval3=new Boolean("kishan");//false
		Boolean bval4=new Boolean("FalSe");//false
		
		System.out.println("bval: "+bval);
		System.out.println("bval2: "+bval2);
		System.out.println("bval3: "+bval3);
		System.out.println("bval4: "+bval4);
		
		new Character('A');
		//new Character("A");//C E	
	}
	public static void main(String[] args) {
		WrapperClass wc=new WrapperClass();
		wc.meth1();
		wc.meth2();
		wc.meth3();
	}
}
