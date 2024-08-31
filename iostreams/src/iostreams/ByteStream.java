package iostreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ByteStream 
{
	void operations1() throws Exception
	{
		System.out.println("Reading the data from a file ");
		FileInputStream fr=new FileInputStream("D:\\file1.txt");
		System.out.println("Connection Created");
		int x;
		while((x=fr.read())!=-1)
		{
			System.out.print((char)x);
		}
		System.out.println();
		System.out.println("Data Retrived");
		fr.close();
	}
	void operations2() throws Exception
	{
		System.out.println("Writing the data into a file");
		FileOutputStream fos=new FileOutputStream("D:\\\\file2.txt",true);
		System.out.println("connection created");
		String data="Java Is Awsome";
		byte arr[]=data.getBytes();
		fos.write(arr);
		System.out.println("Data Entered");
		fos.close();
	}
	void operations3()throws Exception
	{
		System.out.println("copying the data from one into another file");
		FileInputStream fis=new FileInputStream("D:\\car1.jpg");
		FileOutputStream fos=new FileOutputStream("D:\\car2.jpg");
        System.out.println("Connection created");
        int x;
        while((x=fis.read())!=-1)
        {
        	fos.write(x);
        }
        System.out.println("Data Copied ");
     
        fis.close();
        fos.close();
	}

	public static void main(String[] args) throws Exception
	{
		ByteStream obj=new ByteStream();
		//obj.operations1();
		//obj.operations2();
		obj.operations3();
		
	}
}
