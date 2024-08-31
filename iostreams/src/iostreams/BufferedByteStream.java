package iostreams;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedByteStream 
{
	void operaions1() throws Exception
	{
		System.out.println("Reading the data into a file using BufferedByteStream");
	    BufferedInputStream bim=new BufferedInputStream(new FileInputStream("D:\\file1.txt"));
     System.out.println("Connection Created");
     int x;
     while((x=bim.read())!=-1)
     {
    	 System.out.print((char)x);
     }
     System.out.println("\nData Retrived");
     bim.close();
	}
	 void operation2()throws Exception
	 {
		 System.out.println("writing the data into a file using BufferedOutputStream");
		 BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("D:\\file3.txt"));
		 System.out.println("Connection Created");
		 String s="Java is Awsome...!, isn't it?";
		 byte[] n=s.getBytes();
		 bos.write(n);
		 System.out.println("Data retrived");
		 bos.close(); 
	 }
	 void operation3()throws Exception
	 {
		 System.out.println("copied the data one file into another file");
		 BufferedInputStream bim=new BufferedInputStream(new FileInputStream("D:\\file1.txt"));
		 BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("D:\\file3.txt"));
		 System.out.println("Connection created");
		 int x;
		 while((x=bim.read())!=-1) {
			 bos.write((char)x);
		 }
		 System.out.println("Data Retrived");
		 bim.close();
		 bos.close();
	 }
	public static void main(String[] args)throws Exception 
	{
		BufferedByteStream bs=new BufferedByteStream ();
		//bs.operaions1();
		//bs.operation2();
		//bs.operation3();
	}

}
