package iostreams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferedCharacterStream 
{
	void operations1()throws Exception
	{
		System.out.println("reading the data into a file using BufferedCharacterStream");
		BufferedReader br=new BufferedReader(new FileReader("D:\\file3.txt"));
		System.out.println("connection created");
		int x;
		while((x=br.read())!=-1) {
			System.out.print((char)x);
		}
		System.out.println("\nData Retrived");
	    br.close();
	}
	void operations2()throws Exception
	{
		System.out.println("writing data into a file using buffered writer");
		BufferedWriter bw=new BufferedWriter(new FileWriter("D:\\file3.txt",true));
		System.out.println("Connection Created");
		String s=" java is object oriented programming language";
		bw.write(s);
		bw.close();
	}
	 void operations3()throws Exception
	 {
		 System.out.println("copying the data into a file");
		 BufferedReader br=new BufferedReader(new FileReader("D:\\file3.txt")); 
		 BufferedWriter bw=new BufferedWriter(new FileWriter("D:\\file6.txt",true));
		 System.out.println("connection created");
		 int x;
		 while((x=br.read())!=-1) {
			 bw.write((char)x);
		 }
		 System.out.println("Data retrived");
	 }

	public static void main(String[] args)throws Exception 
	{
		BufferedCharacterStream obj=new BufferedCharacterStream ();
		//obj.operations1();
		//obj.operations2();
		obj.operations3();
	}

}
