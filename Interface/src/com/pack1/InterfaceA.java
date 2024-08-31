package com.pack1;

public interface InterfaceA {

	void meth1();
	
	default void meth2() {
		System.out.println("default method of InterfaceA");//java 1.8v
		this.meth4();
	}
     static void meth3() {
    	 System.out.println("static method of InterfaceA");//java 1.8v
     }
	private void meth4() {
		System.out.println("private method of InterfaceA");//java 1.9v
	}
	public static void main(String[] args) //java 1.8v
	{
		System.out.println("InterfaceA main() called");
		InterfaceA.meth3();
	}
}
