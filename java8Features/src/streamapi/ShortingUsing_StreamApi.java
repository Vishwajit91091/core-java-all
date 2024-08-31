package streamapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ShortingUsing_StreamApi 
{
	void meth1() {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(55);
		al.add(22);
		al.add(66);
		al.add(11);
		al.add(44);
		al.add(33);
		//System.out.println(al);
		//Collections.sort(al);
		//System.out.println(al);
		
		Collections.sort(al,Collections.reverseOrder());
		System.out.println(al);
		/*
		Iterator<Integer> i=al.iterator();
		while(i.hasNext()) {
			System.out.print(i.next()+"  ");
		}
		*/
		al.forEach(data->System.out.print(data+"  "));
		
	}

	public static void main(String[] args) 
	{
		new ShortingUsing_StreamApi().meth1();

	}

}
