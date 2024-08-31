package array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {
	void meth1() {
		
		System.out.println("Implementing Java Array");
		
	int arr1[];
	arr1=new int[5];   //1st way
	
	int arr2[]=new int [4];   //2nd way
	
	int arr3[]= {100,200,300};  //3rd way
	 
	int arr4[]=new int[] {11,22,33,44,55,66};  //4th way
	
	String s="java";
	
	System.out.println("String Length: "+s.length());

	System.out.println("arr1 Length: "+arr1.length);
	System.out.println("arr2 Length: "+arr2.length);
	System.out.println("arr3 Length: "+arr3.length);
	System.out.println("arr4 Length: "+arr4.length);
	System.out.println("============================");
	
	System.out.println("Oth Index Position Value "+arr1[0]);
	//System.out.println(arr1[5]); // It generates an AIOB Exception
	System.out.println("Last Index Position Value "+arr1[4]);
	System.out.println("Last Index Position Value "+arr1[arr1.length-1]);
	System.out.println("=============================");
	
	arr1[1]=20;
	arr1[2]=30;
	arr1[4]=50;
	
	System.out.println("arr1: "+Arrays.toString(arr1));
	System.out.println("arr2: "+Arrays.toString(arr2));
	System.out.println("arr3: "+Arrays.toString(arr3));
	System.out.println("arr4: "+Arrays.toString(arr4)); 
	
	//Arrays.toString(arrayName):is used to display the contents present in the aaray
	
	System.out.println("=========================");
	System.out.println(arr2[arr1.length-3]);
	System.out.println(arr3[arr2.length-arr3.length]);
	
	}
	void meth2() {
		Scanner sc=new Scanner(System.in);
		System.out.println("How Many ticket u want?");
		String names[]=new String [sc.nextInt()];
		System.out.println("Please Enter "+names.length+" name");
		for(int i=0;i<names.length;i++) {
			names[i]=sc.next();
		}
		System.out.println("Your tickets were Booked for");
		System.out.println(Arrays.toString(names));
		System.out.println("========================");
		
		System.out.println("Returing the data from an array by using loop");
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]);
		}
		System.out.println("========================");
		System.out.println("Returning the data from an array by using for-each loop");
		for(String data: names) {
			System.out.println(data);
		}
		sc.close();
		
	}
	public static void main(String[] args) {
		ArrayDemo aobj=new ArrayDemo();

		aobj.meth1();
		aobj.meth2();
	}

}
