package basics;

public class IfExample {
	void meth1() {
		System.out.println("meth1() called");
		int x=10;
		if(x!=10) {
			System.out.println("if block executed");
			System.out.println("Hi");
		}
		else {
			System.out.println("else block executed");
			System.out.println("Hello");
		}
	}
	void CheckEligiblity(int age,String name) {
		int i=18;
		if(age>=i) {
			System.out.println(name+" as your age is "+age+" you r eligble for vote");
		}else {
			System.out.println(name+" as your age is "+age+" you need to wait for another "+(18-age)+" years");
		}
	}
	void govEligiblity(int age,String name) {
		if(age>=21 && age<=35) {
			System.out.println(name+" your age is "+age+" you r eligble for conducting gov exam");
		}
		else {
			System.out.println(name+" your age is "+age+" you r not eligbile to conduct exam");
		}
	}
	public static void main(String[] args) {
		IfExample a=new IfExample();
		a.meth1();
		System.out.println("*************************");
		a.CheckEligiblity(15, "Vishwajit");
		System.out.println("*************************");
		a.govEligiblity(20, "Sanju");
	}
}
