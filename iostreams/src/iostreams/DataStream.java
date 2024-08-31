package iostreams;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataStream 
{
	void operations1()throws Exception
	{
		System.out.println("Writing Primitive DataType Into a file");
		DataOutputStream dos=new DataOutputStream(new FileOutputStream("D:\\file6.txt"));
		System.out.println("Connection Created");
		dos.writeInt(1000);
		dos.writeChar('A');
		dos.writeBoolean(true);
		dos.writeInt(2000);
		System.out.println();
		dos.close();
		
		System.out.println("Reading the secure data into a file");
		DataInputStream dis=new DataInputStream(new FileInputStream("D:\\file6.txt"));
		System.out.println("Connection Created");
		System.out.println(dis.readInt());
		System.out.println(dis.readChar());
		System.out.println(dis.readBoolean());
		System.out.println(dis.readInt());
		dis.close();
	}

	public static void main(String[] args)throws Exception
	{
      new DataStream().operations1();
		
	}

}
