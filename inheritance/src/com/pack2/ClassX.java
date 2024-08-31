package com.pack2;

import com.pack1.ClassB;

public class ClassX extends ClassB{
	
	public void meth3() {
		System.out.println("Class x method");	
	}

	public static void main(String[] args) {
		
		ClassX xobj=new ClassX();
		xobj.meth1();
		xobj.meth2();
		xobj.meth3();
	}

}
