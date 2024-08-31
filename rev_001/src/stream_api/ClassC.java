package stream_api;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ClassC {

	void meth1() {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(55);
		al.add(44);
		al.add(66);
		al.add(33);
		al.add(77);
		al.add(11);
		/*
		Stream<Integer> s1=al.stream();
		Stream<Integer> s2=s1.map(x->x-10);
		List li=s2.collect(Collectors.toList());
		System.out.println(li);
		*/
		//sort the data by using Stream api 
		//Collections.sort(al);
		//System.out.println(al);
		Stream s=al.stream().sorted();
		List<Integer> li= (List<Integer>) s.collect(Collectors.toList());
		System.out.println(li);
		
	}
	public static void main(String[] args) {
		new ClassC().meth1();

	}

}
