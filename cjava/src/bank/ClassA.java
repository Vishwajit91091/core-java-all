package bank;

public class ClassA {

	void meth1()
	{
		int arr1[];
		arr1=new int [5];//1 st way
		int arr2[]=new int [4]; //2nd way
		int arr3[]= {10,20,50,30,40,10};//3rd way
		int arr4[]=new int[] {50,80,60,40,30,90};//4th way
		
		String s="java";
		System.out.println(s.length());
		System.out.println(arr1.length);
		System.out.println(arr2.length);
		System.out.println(arr3.length);
		System.out.println(arr4.length);
		
		System.out.println("=================");
		System.out.println("0th index position of "+arr4[0]);
		System.out.println("Last index position of "+arr4[5]);
		System.out.println("Last index position of "+arr4[arr4.length-1]);
		System.out.println("=================");
		
		
		
	}
	public static void main(String[] args) {
		new ClassA().meth1();
	}

}
