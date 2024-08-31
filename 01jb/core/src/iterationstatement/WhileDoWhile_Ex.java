package iterationstatement;

public class WhileDoWhile_Ex {

	void meth1() {
		System.out.println("==========meth1()==========");
		int i=1;
		while(i<=10) {
			System.out.println("i value is: "+i);
			i++;
		}
		System.out.println("meth1() execution complited");
	}
	
	void meth2() {
		System.out.println("==========meth2()==========");
		int i=1;
		while(i<=10) {
			System.out.println("i value is: "+ ++i);
			i++;
		}
		
		System.out.println("meth2() execution complited");
	}
	void meth3() {
		System.out.println("==========meth3()==========");
		int i=1;
		while(i<=10)
			//int i=50; C:E because we should not write any declarative statements at this line 
			System.out.println("i value is: "+i);
			i++;
		    System.out.println("meth3() execution complited");
	}
	 void meth4() {
		System.out.println("==========meth4()==========");
		int i=1;
		while(true) {
			System.out.println("i value is: "+i);
			i++;
		}
		//System.out.println("meth4() execution complited");//C:E because it a unreachable code 
	}
	 void meth5() {
			System.out.println("==========meth1()==========");
			int i=1;
			do {
				System.out.println("i value is: "+i);
				i++;
			}
			while(i<=10);
			System.out.println("meth1() execution complited");
		}
	
	public static void main(String[] args) {
		WhileDoWhile_Ex ex=new WhileDoWhile_Ex();
		//ex.meth1();
		//ex.meth2();
		//ex.meth3();//it will generates infinite loop
	   // ex.meth4();//it will generates infinite loop
		ex.meth5();
	}

}
