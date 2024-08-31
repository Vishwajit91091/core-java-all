package exceptionHandling;

import java.io.FileReader;

public class ThrowAndThrowsDemo {
	int avl_amt=1000;
	void with_draw(int wd_amt) {
		if(avl_amt<wd_amt) {
			throw new NullPointerException("Insuffiendt funds");
		}
		else {
			System.out.println("Transication success");
		}
	}
	void fileOperations()throws Exception
	{
		FileReader fr=new FileReader("D:\\01html\\files\\html_tutorial.docx");
		System.out.println("Hello World");
	}

	public static void main(String[] args) throws Exception
	{
		ThrowAndThrowsDemo obj=new ThrowAndThrowsDemo();
		obj.with_draw(600);
		obj.fileOperations();
	}
}
