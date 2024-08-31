package test;

import java.util.LinkedList;

public class SingleLinkedList {

	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<String>();
		//add
		ll.add("test");
		ll.add("qta");
		ll.add("selenium");
		
		//print
		System.out.println(ll);
		//addFirst
		ll.addFirst("java");
		//addLast
		ll.addLast("spring");
		System.out.println(ll);
		//get
		System.out.println(ll.get(0));
		//set
		ll.set(0,"html");
		System.out.println(ll.get(0));
		//remove 1st and last
		ll.removeFirst();
		ll.removeLast();
		System.out.println(ll);
		ll.remove(2);
		System.out.println(ll);
		//printing using while loop
		int no=0;
		while(ll.size()>no) {
			System.out.print(ll.get(no)+" ");
			no++;
		}
	}
}