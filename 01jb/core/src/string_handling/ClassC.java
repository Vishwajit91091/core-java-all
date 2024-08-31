package string_handling;
/*
   Given a String return a String where for every char in the 
   orignial three or two chars.
   doubleChar ("aabb")   aaaabbbb
 */
public class ClassC {

	public String doubleChar(String str) {
		
		String result="";
		for(int i=0;i<str.length();i++) {
			result=result+str.charAt(i)+str.charAt(i);
		}
		return result;
	}
	public static void main(String[] args) {
		ClassC obj=new ClassC();
		String result=obj.doubleChar("java");

		System.out.println(result);
	}

}
