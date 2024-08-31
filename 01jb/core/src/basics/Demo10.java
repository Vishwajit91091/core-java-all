package basics;

public class Demo10 {
	int meth1(int a) {
		
		return 99+a;
	}
	int meth2(String s) {
	
		return 100;
	}
	int meth3() {
		System.out.println("hi");
		return 1+new Demo10().meth1(0);
	}
	public static void main(String[] args) {
		Demo10 d=new Demo10();
		int x=d.meth2("java is awsome")+d.meth3()+100;
		System.out.println(x);
	}

}
