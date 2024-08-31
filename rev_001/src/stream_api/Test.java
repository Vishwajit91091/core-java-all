package stream_api;

import java.util.ArrayList;

public class Test 
{
	void meth1() {
		ArrayList<String> al=new ArrayList<String>();
		al.add("manisha");
		al.add("vishwajit");
		al.add("govind");
		al.add("sahabaz");
		al.add("priya");
		
		for(int i=0;i<al.size();i++) {
			String s=al.get(i);
			if(s.length()>=6) {
				System.out.println(s);
			}
		}
	}

	public static void main(String[] args) {
		new Test().meth1();

	}

}
