package parallelsorting;

import java.util.Arrays;

public class ParallelSorting
{
	void meth1()
	{
		int arr[]= {1,5,7,3,4,9,2,6,8};
		for(int x:arr) 
			System.out.print(x+"  ");
		System.out.println();
		/*
		Arrays.sort(arr);
		for(int y:arr)
			System.out.print(y+"  ");
		System.out.println();
		*/
		Arrays.parallelSort(arr,5,8);
		for(int x:arr)
			System.out.print(x+"  ");
		System.out.println();
		
		
		
	}

	public static void main(String[] args)
	{
		new ParallelSorting().meth1();

	}

}
