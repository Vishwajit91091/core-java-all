package com.pack1;

public class ClassA extends ClassB implements InterfaceA,InterfaceB
{
   
	public void meth1() {
		System.out.println("Interface A abstract method Overriding");
	}
     public void msg() {
    	System.out.println("Interface A abstract method Overriding"); 
     }
	public static void main(String[] args) {

		InterfaceA aobj=new ClassA();
		aobj.meth1();
		aobj.meth2();
		InterfaceA.meth3();
		//aobj.meth4();//C:E because it is a private method 
        System.out.println("=========================");
        InterfaceB bobj=new ClassA();
        bobj.msg();
        System.out.println("=========================");
        new ClassA().display();
	}

}
