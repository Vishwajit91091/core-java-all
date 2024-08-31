package iterationstatement;

public class ForEachloopEx {

	void meth1() {
		System.out.println("meth1() Called");
		int arr[]= {10,20,30,40,50};
		
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
	
		System.out.println("Retriving the data into farward direction using for loop in array");
	    for(int i=0;i<=4;i++) {
	    	System.out.println(arr[i]);
	    }
	    
	    System.out.println("Retriving the data into reverse direction using for loop in array");
	    for(int i=4;i>=0;i--) {
	    	System.out.println(arr[i]);
	    }
	    
	    System.out.println("retriving specific data from array");
	    for(int i=3;i>=1;i--) {
	    	System.out.print(arr[i]+"  ");
	    }
	   System.out.println();
	    System.out.println("Retriving the from a array by using for-each loop");
	    for(int x:arr) {
	    	System.out.println(x);
	    }
	}
	
	// for loop will working on index value to retrive the data from an array
	//for-each loop not be working on index values it works on streaming data 
	public static void main(String[] args) {
	 
		new ForEachloopEx().meth1();
	}
}
