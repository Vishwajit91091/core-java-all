package basics;

public class Demo14 {
	void meth1(int age,String name) {
		int i=18;
		if(age>i) {
		 System.out.println(name+" eligible");
		}
		else {
			System.out.println(name+" not eligible plese wait "+(18-age)+" years");
		}	
	}
	void meth2(int age,String name) {
		if(age>18 && age<25) {
			System.out.println(name+" you r eligible for exam");		
		}
		else {
			System.out.println(name+" you r not elegible your age "+age+"is");
		}
	}
	public static void main(String[] args) {
	  new Demo14().meth1(15, "sanju");
	  new Demo14().meth2(24, "vishwajit");
	}

}
