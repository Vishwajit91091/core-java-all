package basic;

public class PrintVowelOrConst {
	
	void meth1(char c)
	{
	if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
		System.out.println("the given letter is vowel");
	}
		else if (c=='A'||c=='E'||c=='I'||c=='O'||c=='U') {
			System.out.println("the given letter is vowel");
		}
		else {
			System.out.println("the given letter is consonent");
		}

	}
	public static void main(String[] args) {
		PrintVowelOrConst pvc=new PrintVowelOrConst();
		pvc.meth1('b');
	}

}
