package array;

import java.util.Arrays;
import java.util.HashSet;

public class ArrayDemo {

	void meth1() {
		int arr1[];
		arr1=new int[5];
		
		int arr2[]=new int[10];
		
		int arr3[]= {10,20,30};
		
		arr2[0]=10;
		arr2[1]=5;
		arr2[2]=11;
		arr2[3]=16;
		arr2[4]=20;
		arr2[5]=11;
		arr2[6]=5;
		arr2[7]=10;
		arr2[8]=13;
		arr2[9]=20;
		
		System.out.println("printing the value using for loop");
		for(int i=0;i<arr2.length;i++) {
			System.out.print(arr2[i]+" ");
		}
		
		System.out.println();
		System.out.println("===================");
		System.out.println("Printing the value using for each loop");
		for(int i:arr2) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		System.out.println("===================");
		System.out.println("reverse the given array using for loop");
		for(int i=arr2.length-1;i>=0;i--) {
			System.out.print(arr2[i]+" ");
		}
		
		System.out.println();
		System.out.println("===================");
		System.out.println("Print the value between the array in reverse");
		for(int i=arr2.length-2;i>=1;i--) {
			System.out.print(arr2[i]+" ");
		}
		System.out.println();
		System.out.println("===================");
		System.out.println("Find the max value");
		int max=arr2[0];
		for(int i=0;i<arr2.length;i++) {
			if(arr2[i]>max) {
				max=arr2[i];
			}
		}
		System.out.println(max);
		
		System.out.println("===================");
		System.out.println("Find the min value");
		int min=arr2[0];
		for(int i=0;i<arr2.length;i++) {
			if(arr2[i]<min) {
				min=arr2[i];
			}
		}
		System.out.println(min);
		
		System.out.println("===================");
		System.out.println("sum of all elements of an array");
		int sum=arr2[0];
		for(int i=0;i<=arr2.length-1;i++) {
			sum=sum+arr2[i];
		}
		System.out.println(sum);
		
		System.out.println("===================");
		System.out.println("Multiply all the element");
		int mul=arr2[0];
		for(int i=0;i<arr2.length;i++) {
			mul=mul*arr2[i];
		}
		System.out.println(mul);
		
		System.out.println("===================");
		System.out.println("Count the element");
		int count=0;
		for(int i=0;i<arr2.length;i++) {
			count=count+1;
		}
		System.out.println(count);
		
		System.out.println("===================");
		System.out.println("Print only even degits in array");
		for(int i=0;i<arr2.length;i++) {
			if(arr2[i]%2==0) {
				System.out.print(arr2[i]+" ");
			}
		}
		System.out.println();
		System.out.println("===================");
		System.out.println("Print only odd degits in array");
		for(int i=0;i<arr2.length;i++) {
			if(arr2[i]%2==1) {
				System.out.print(arr2[i]+" ");
			}
		}
		System.out.println();
		System.out.println("===================");
		System.out.println("sort the arry");
		
		Arrays.sort(arr2);
		for(int i:arr2) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		System.out.println("===================");
		System.out.println("find 2nd max value");
		
		
		System.out.println(arr2[arr2.length-2]); //1st way
		
		if(arr2.length>=2) {
			int smax=arr2[arr2.length-2];
			System.out.println(smax);
		}
	
		System.out.println("===================");
		System.out.println("find 2nd min value");
		
		System.out.println(arr2[1]); //1st way
		if(arr2.length>2) {
			int smin=arr2[1];
			System.out.println(smin);
		}

		System.out.println("===================");
		System.out.println("find 3rd max value");
		
		System.out.println(arr2[arr2.length-3]); //1st way
		if(arr2.length>3) {
			int tmax=arr2[arr2.length-3];
			System.out.println(tmax);
		}

		System.out.println("===================");
		System.out.println("find 3rd min value");
		
		System.out.println(arr2[2]); //1st way
		if(arr2.length>3) {
			int tmin=arr2[2];
			System.out.println(tmin);
		}
		
		System.out.println("===================");
		System.out.println("find duplicate value in array");
		for(int i=0;i<arr2.length-1;i++) {
			for(int j=i+1;j<arr2.length;j++) {
				if(arr2[i]==arr2[j]&&(i!=j)) {
					System.out.print(arr2[i]+" ");
				}
			}
		}
		System.out.println();
		System.out.println("===================");
		System.out.println("find duplicate value & sum array");
		
		int sum2=0;
		for(int i=0;i<arr2.length;i++) {
			
			for(int j=i+1;j<arr2.length;j++) {
				if(arr2[i]==arr2[j]) {
					sum2=sum2+arr2[i];
				}
			}
		}
		System.out.println(sum2);
		
		System.out.println("===================");
		System.out.println("find duplicate value & remove");
		HashSet<Integer> hs=new HashSet<>();
		for(int i=0;i<arr2.length;i++) {
			hs.add(arr2[i]);
		}
		System.out.println(hs);
			
	}
	public static void main(String[] args) {
		new ArrayDemo().meth1();
	}

}
