package com.pack2;

public class ClassB extends ClassA{

	void display() {
		System.out.println("Hi");
		super.meth4();
	}
	static int show(int a) {
		System.out.println(a+a);
		return a+a++;
	}
	ClassB(){
		this(show(50));
		for(int i=1;;i++) {
			super.meth4();
			break;
		}
		System.out.println("Hii");
		System.out.println(show(50));
	}
	ClassB(int a){
		System.out.println("==>"+(a+++show(50)));
	}
	
	public static void main(String[] args) {
		new ClassB().display();
	}

}
