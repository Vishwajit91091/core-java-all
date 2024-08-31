package streamapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortingCollection_Using_StreamApi
{
	//Subtract all elements-10 in Present in ArrayList
	void meth1()
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(55);
		al.add(22);
		al.add(44);
		al.add(33);
		al.add(66);
		al.add(11);
		/*
		Stream<Integer> s1=al.stream();
		Stream<Integer> s2=s1.map(x->x-10);
		List li=s2.collect(Collectors.toList());
		System.out.println(li);
		*/
		
		//sort the data by using Stream Api
		
		//Collections.sort(al);
		//System.out.println(al);
		
		Stream<Integer> s1=al.stream().sorted();
		List<Integer> s2=s1.collect(Collectors.toList());
		System.out.println(s2);
	}

	public static void main(String[] args) 
	{

		new SortingCollection_Using_StreamApi().meth1();
	}

}
