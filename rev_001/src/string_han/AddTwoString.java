package string_han;

public class AddTwoString 
{
	String meth1(String a,String b) {
		//return a+b+b+a;
		return a.concat(b).concat(b).concat(a);
	}

	public static void main(String[] args) {
	System.out.println(new AddTwoString().meth1("hii", "bye"));
	}

}
