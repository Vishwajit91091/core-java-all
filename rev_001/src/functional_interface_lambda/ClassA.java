package functional_interface_lambda;

public class ClassA {
	void method1() {
		int x=20;
		InterfaceA faceA = () -> System.out.println("Hello this is Interface A.");
		faceA.m1();

		InterfaceB faceB = (int a, int b) -> {
			System.out.println(a + b);
		};
		faceB.m2(13, 13);

		InterfaceC faceC = (int a, int b) -> {
			return a * b;
		};
		int result=faceC.m3(55, 10);
		System.out.println(result);
		System.out.println(faceC.m3(10, 15));
		
		InterfaceD faceD=()->{
			return 80+x;
		};
		
		System.out.println(faceD.m4());
	}

	public static void main(String[] args) {
		new ClassA().method1();
	}
}
