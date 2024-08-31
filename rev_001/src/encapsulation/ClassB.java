package encapsulation;

import java.util.Scanner;

public class ClassB 
{
	Scanner sc=new Scanner(System.in);
	void meth1() {
		ClassA aobj=new ClassA();
		System.out.println("Enter Emp name: ");
		aobj.setEmpName(sc.nextLine());
		System.out.println("Enter empId: ");
		aobj.setEmpId(Integer.parseInt(sc.nextLine()));
		System.out.println("Enter EmpDept: ");
		aobj.setEmpDept(sc.nextLine());
		
		System.out.println("======================");
		System.out.println("Emp Name: "+aobj.getEmpName());
		System.out.println("Emp Id: "+aobj.getEmpId());
		System.out.println("Emp Dept: "+aobj.getEmpDept());
		System.out.println("======================");
		
	}

	public static void main(String[] args) {
		new ClassB().meth1();
	}
}
