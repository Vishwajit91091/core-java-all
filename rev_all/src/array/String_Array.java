package array;

public class String_Array {

	public static void main(String[] args) {

		String[] s= {"java","python","html","python","css","c","html"};
		
		//print the String array
		for(int i=0;i<s.length;i++) {
			System.out.print(s[i]+" ");
		}
		//Reverse of String Array
		for(int i=s.length-1;i>=0;i--) {
			System.out.print(s[i]+" ");
		}
	}

}