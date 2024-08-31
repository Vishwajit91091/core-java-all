package iostreams;

import java.io.FileReader;
import java.io.FileWriter;

public class CharacterStreams 
{
	void operations1()throws Exception 
	{
		System.out.println("reading the data into a file");
		FileReader fr=new FileReader("D:\\file2.txt");
		int x;
		while((x=fr.read())!=-1)
		{
		System.out.print((char)x);	
		}
		System.out.println("Data retrived");
		fr.close();
	}
	void operations2()throws Exception
	{
		System.out.println("Writing the data into a file");
		FileWriter fw=new FileWriter("D:\\file2.txt",true);
		String s=" Because java is object oriented programming language";
		fw.write(s);
		System.out.println("Data Retrived");
		fw.close();
	}
     void operations3()throws Exception
     {
    	 System.out.println("coping the data into a file");
    	 FileReader fr=new FileReader("D:\\file2.txt");
    	 FileWriter fw=new FileWriter("D:\\file4.txt");
    	 int x;
    	 while((x=fr.read())!=-1)
    	 {
    		 fw.write((char)x);
    	 }
    	 System.out.println("Data Retrived");
    	 fr.close();
    	 fw.close();
     }

	public static void main(String[] args)throws Exception 
	{
		 CharacterStreams cs=new  CharacterStreams();
		 cs.operations1();
		 //cs.operations2();
		 //cs.operations3();

	}

}
