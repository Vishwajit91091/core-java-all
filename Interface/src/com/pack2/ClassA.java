package com.pack2;

public class ClassA implements InterfaceA,InterfaceB
{
	public void meth1() {
		InterfaceA.super.meth1();
		InterfaceB.super.meth1();
	}

	public static void main(String[] args) {
		InterfaceA aobj=new ClassA();
		aobj.meth1();

	}

}
