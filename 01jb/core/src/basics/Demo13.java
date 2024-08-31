package basics;

public class Demo13 {
	int sno;
	String sname;
	String scourse;

	Demo13(int no, String name, String course) {
		sno = no;
	    sname = name;
		scourse = course;
	}

	public static void main(String[] args) {

		Demo13 d1 = new Demo13(101, "kishan", "coreJava");
		Demo13 d2 = new Demo13(102, "Vishwajit", "Html");
		Demo13 d3 = new Demo13(103, "Sanju", "Oracle");
		System.out.println(d1.sno + " " + d1.sname + " " + d1.scourse);
		System.out.println(d2.sno + " " + d2.sname + " " + d2.scourse);
		System.out.println(d3.sno + " " + d3.sname + " " + d3.scourse);

	}

}
