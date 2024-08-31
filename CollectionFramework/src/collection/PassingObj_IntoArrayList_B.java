package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class PassingObj_IntoArrayList_B 
{
	void meth1()
	{
		System.out.println("Passing User Defined Object into ArrayList");
		ArrayList<PassingObj_IntoArrayList_A> al=new ArrayList<PassingObj_IntoArrayList_A>();
		
		PassingObj_IntoArrayList_A aobj1=new PassingObj_IntoArrayList_A(101,"kishan",50000);
		PassingObj_IntoArrayList_A aobj2=new PassingObj_IntoArrayList_A(102,"Sujtha",25000);
		
		al.add(aobj1);
		al.add(aobj2);
		al.add(new PassingObj_IntoArrayList_A(103,"sanju",35000));
		
		System.out.println(al+"\n");
		System.out.println("Retriving the data by using Iterato interface");
		
		Iterator<PassingObj_IntoArrayList_A> i=al.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

	public static void main(String[] args) 
	{
		new PassingObj_IntoArrayList_B().meth1();

	}

}
