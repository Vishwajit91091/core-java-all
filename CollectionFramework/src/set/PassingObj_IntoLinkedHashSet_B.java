package set;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class PassingObj_IntoLinkedHashSet_B {

	public static void main(String[] args) {
		LinkedHashSet<Object> lhs=new LinkedHashSet<Object>();
		PassingObj_IntoLinkedHashSet_A aobj=new PassingObj_IntoLinkedHashSet_A(101,"sanju","A+");
		lhs.add(aobj);
		lhs.add(new PassingObj_IntoLinkedHashSet_A(102,"kishan","A++"));
		lhs.add(new PassingObj_IntoLinkedHashSet_A(103,"rashmi","B+"));
		
		System.out.println(lhs+"\n");
		Iterator<Object> i=lhs.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("\n");
		ArrayList<Object> al=new ArrayList<Object>(lhs);
		Iterator<Object> i2=al.iterator();
		while(i2.hasNext()) {
			System.out.println(i2.next());
		}
		
	}

}
