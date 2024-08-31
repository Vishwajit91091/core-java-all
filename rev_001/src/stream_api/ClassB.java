package stream_api;

import java.util.ArrayList;
import java.util.stream.Stream;

public class ClassB {

	void meth1() {
		ArrayList<String> al = new ArrayList<String>();
		al.add("manisha");
		al.add("bunty");
		al.add("vishwajit");
		al.add("govind");
		al.add("sahabaz");
		al.add("priya");

		/*
		 * Stream<String> s1=al.stream(); Stream<String>
		 * s2=s1.filter(data->data.length()>=6); long result=s2.count();
		 */
		// long result=al.stream().filter(data->data.length()>=6).count();
		Stream<String> result = al.stream().filter(data -> data.length() >= 6);

	//	result.forEach(s -> System.out.println(s));
		System.out.println("--------------------------------------");
		result.forEach(System.out::println);
	}

	public static void main(String[] args) {
		new ClassB().meth1();

	}

}
