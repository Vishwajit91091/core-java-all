package iostreams;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectStream 
{

	public static void main(String[] args)throws Exception
	{
		ObjectStream_1 aobj=new ObjectStream_1();
		ObjectStream_2 bobj=new ObjectStream_2();
		
		System.out.println(aobj.a+"  "+aobj.b);
		System.out.println(bobj.x+"  "+bobj.y);
		System.out.println("Serializable Started");
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(""));
		
	}

}
