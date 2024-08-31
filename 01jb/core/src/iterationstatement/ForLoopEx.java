package iterationstatement;

public class ForLoopEx {
	void meth1() {
		System.out.println("==========meth1()==========");
		for(int i=1;i<=5;i++) {
			System.out.println("i value is: "+i);
		}
		System.out.println("meth1() Execution Complited");
	}
	void meth2() {
		System.out.println("==========meth2()==========");
		int i=1;
		for(i=1;i<=5;i++) 
			//int i=50;//C:E Because we should not write any declaritive statements at this line
			System.out.println("i value is "+ ++i);
		System.out.println("meth2() Execution Complited");
	}
	void meth3() {
		System.out.println("==========meth3()==========");
		for(int i=1;i<=10;++i) {
			System.out.println("i value is: "+(i++ + ++i));
		}
		System.out.println("meth3() Execution Complited");
	}
	
	void meth4() {
		System.out.println("==========meth4()==========");
		int i=1;
		for(;i<=5;) {
			System.out.println("i value is: "+i);
			i++;
		}
		System.out.println("meth4() Execution Complited");
	}
	
	void meth5() {
		System.out.println("==========meth5()==========");
		int i=1;
		for(System.out.println("meth5()======");i<=5;) {
			System.out.println("i value is: "+i);
			i++;
		}
		System.out.println("meth5() Execution Complited");
	}
	
	void meth6() {
		System.out.println("==========meth5()==========");
		int i=1;
		for(System.out.print("======"),System.out.println("meth()6=====");i<=5;) {
			System.out.println("i value is: "+i);
			i++;
		}
		System.out.println("meth6() Execution Complited");
	}
	
	int meth7() {
		return  1;
	}
	void meth8() {
		System.out.println("===============");
	}
	void meth9() {
		System.out.println("==========meth9()==========");
		for(int i=new ForLoopEx().meth7();i<=5;new ForLoopEx().meth8()) {
			System.out.println("i value is: "+i);
			i++;
		}
		System.out.println("meth9() Execution Complited");
	}
	
	void meth10() {
		System.out.println("==========meth10()==========");
		int i=1;
		for(; ;) {
			System.out.println("i value is: "+i);
			i++;
		}
		//System.out.println("meth10() Execution Complited");//C:E Unreachable Code
	}
	
	void meth11() {
		System.out.println("==========meth11()==========");
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.println("J Value is: "+j);
			}
			System.out.println("=============");
		}
		System.out.println("meth11() Execution Complited");
	}
	
	public static void main(String[] args) {
	ForLoopEx f=new ForLoopEx();
	//f.meth1();
	//f.meth2();
	//f.meth3();
	//f.meth4();
	//f.meth5();
	//f.meth6();
	//f.meth9();
	//f.meth10();
	f.meth11();
	}

}
