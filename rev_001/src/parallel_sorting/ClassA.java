package parallel_sorting;

import java.util.Arrays;

public class ClassA {
	void meth1() {
		int arr[]= {1,5,7,4,3,8,2,6,9};
		for(int x:arr) {
			System.out.print(x+" ");
		}
		System.out.println();
       /*
		Arrays.sort(arr);
		for(int y:arr) {
			System.out.print(y+" ");
		}
		System.out.println();
		*/
		Arrays.parallelSort(arr,2,8);
		for(int z:arr) {
			System.out.print(z+" ");
		}
	}
	public static void main(String[] args) {
		new ClassA().meth1();
	}

}
