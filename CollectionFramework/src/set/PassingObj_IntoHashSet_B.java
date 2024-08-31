package set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class PassingObj_IntoHashSet_B
{
	void meth1()
	{
		HashSet<Object> hs=new HashSet<Object>();
		PassingObj_IntoHashSet_A aobj=new PassingObj_IntoHashSet_A("sanju",101,"java");
		hs.add(aobj);
		hs.add(new PassingObj_IntoHashSet_A("kishan",102,"python"));
		hs.add(new PassingObj_IntoHashSet_A("rashmi",103,"Html"));
		
		Iterator<Object> i=hs.iterator();
		while(i.hasNext()) {
			System.out.print(i.next()+" ");
		}
		ArrayList<Object> al=new ArrayList<Object>(hs);
		Iterator<Object> li=al.iterator();
		while(li.hasNext())
		{
			System.out.print("\n"+li.next());
		}
	}

	public static void main(String[] args) {
	
		new PassingObj_IntoHashSet_B().meth1();
	}

}
