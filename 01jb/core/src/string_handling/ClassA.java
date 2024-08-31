package string_handling;

/*
 Given Two String a & b returns the results of putting 
 them together in the order  ab-ba,
 Ex: "Hi" & "Bye"  returns "HiByeByeHi"
 */
public class ClassA {
	
	String MakeAba(String a, String b) {
		return a+b+b+a;
		//return a.concat(b).concat(b).concat(a);
	}

	public static void main(String[] args) {
		ClassA aobj=new ClassA();
		//System.out.println(aobj.MakeAba("Hi", "Bye"));
    	String result=aobj.MakeAba("Hi", "Bye");
    	System.out.println(result);
	}

}
