package streamapi;

import java.util.ArrayList;
import java.util.stream.Stream;

public class ChekArrayListAndShow 
{
	void meth1()
	{
		ArrayList<String> al=new ArrayList<String>();
		al.add("Vishwajit");
		al.add("Ankit");
		al.add("Imteyaz");
		al.add("Sneha");
		al.add("Priya");
		al.add("Manisha");
		
		//Stream<String> s1=al.stream();
		//Stream<String> s2=s1.filter(data->data.length()<=6);
	   // Long result=s2.count();
	    
	   Long result=al.stream().filter(data->data.length()<=6).count();
		
	   System.out.println("there r "+result+" elements whose length is<=6");
	}

	public static void main(String[] args) 
	{
      new ChekArrayListAndShow().meth1();
	}

}
