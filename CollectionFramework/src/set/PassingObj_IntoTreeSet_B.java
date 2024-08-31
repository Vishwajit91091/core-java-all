package set;

import java.util.Iterator;
import java.util.TreeSet;

public class PassingObj_IntoTreeSet_B 
{

	public static void main(String[] args) 
	{
		TreeSet<Object> ts=new TreeSet<Object>();
		PassingObj_IntoTreeSet_A obj1=new PassingObj_IntoTreeSet_A(107,"Sanju","HYD");
		ts.add(obj1);
		ts.add(new PassingObj_IntoTreeSet_A(105,"Kishan","andhra"));
		ts.add(new PassingObj_IntoTreeSet_A(102,"Hk","hyd"));
		
		System.out.println(ts);
		Iterator<Object> i=ts.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

	
}
