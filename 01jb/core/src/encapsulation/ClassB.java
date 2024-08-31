package encapsulation;

import java.util.Scanner;

public class ClassB {

	Scanner sc=new Scanner(System.in);
	void meth1() {
		ClassA aobj=new ClassA();
		
		System.out.println("Please Enter Your Name..!!");
		//aobj.empName=sc.nextLine();
		aobj.setEmpName(sc.nextLine());
		System.out.println("Please Enter Your empId..!!");
		//aobj.empId=sc.nextInt();
		aobj.setEmpId(sc.nextInt());
		System.out.println("Enter your DeptName..!!");
		//aobj.empDept=sc.next();
		aobj.setEmpDept(sc.next());
		System.out.println("Please Enter Your Salary..!!");
		//double empSal=aobj.nextDouble();
		aobj.setEmpSal(sc.nextDouble());
		System.out.println("Please Enter your Expriance..!!");
		// int empExp=aobj.nextInt();
		aobj.setEmpExp(sc.nextInt());
		System.out.println("-------------------------");
		//System.out.println(aobj.empName);
		System.out.println("Name..! "+aobj.getEmpName());
		//System.out.println(aobj.empId);
		System.out.println("Emp Id..! "+aobj.getEmpId());
		//System.out.println(aobj.empDept);
		System.out.println("Emp Dept..! "+aobj.getEmpDept());
		//System.out.println(aobj.empSal());
		System.out.println("emp Sal..! "+aobj.getEmpSal());
		//System.out.println(aobj.empExp());
		System.out.println("Emp Exp..! "+aobj.getEmpExp());
	}
	public static void main(String[] args) {
		new ClassB().meth1();

	}

}
