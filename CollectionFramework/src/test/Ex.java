package test;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex  {

	public static void main(String[] args) {
	
		ArrayList<Employee> al=new ArrayList<Employee>();
		Employee e1=new Employee("sanju",28,"Gaya");
		Employee e2=new Employee("avinash",29,"Aurangabad");
		Employee e3=new Employee("ankit",25,"delhi");
		
		al.add(e1);
		al.add(e2);
		al.add(e3);
	Iterator<Employee> i=al.iterator();
	while(i.hasNext()) {
	Employee e=	i.next();
	System.out.print(e.name+" ");
	System.out.print(e.age+" ");
	System.out.print(e.city+" ");
	}
	}

}
