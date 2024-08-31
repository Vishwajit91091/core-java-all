package basics;

public class Demo6 {
	void msg() {
		System.out.println("hi");
	}
	public static void main(String[] args) {
		Demo6 d=new Demo6();
		d.msg();  //calling with help of Object Refrance
		
		new Demo6().msg();//calling directly with the help of object
	}

}
