package arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_Demo 
{
	void meth1() {
	ArrayList<Object> al=new ArrayList<Object>();
	al.add(10);     // maintain Inserition order
	al.add("Java"); //Hectrozenious data Are Allowed
	al.add(10);    //duplicate data allowed
	al.add(null);  //null is allowed
	al.add(56);    //it is not synchronized
	al.add(58);   //it come into java 1.2v
	al.add(1);    //default capesity 10
	al.add(98);   //it increses the capisity by ahlff (capisity*3/2)+1
	System.out.println(al);
	System.out.println("=============using for loop==========");
	for(int i=1;i<al.size();i++) {
		System.out.print(al.get(i)+" ");
	}
	System.out.println();
	System.out.println("=============using for-each loop==========");
	for(Object o:al) {
		System.out.print(o+" ");
	}
	System.out.println();
	System.out.println("=============using for Iterator==========");
	 Iterator<Object> i=al.iterator();
	 while(i.hasNext()) {
		 System.out.print(i.next()+" ");
	 }
	}
	public static void main(String[] args) {
		new ArrayList_Demo().meth1();
		

	}

}
