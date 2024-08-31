package string_handling;
/*
 * Given an "out" Stringh length 4 such as "<<>>", and a word return a new String 
 * where the word is in middle of the out String eg: "<<word>>".
 * make out word ("<<>>","Yah")? "<<Yeh>>"
 * make out word ("[[]]","word")? "[[word]]"
 */
public class ClassE {

	public String MakeOutWord(String out,String word) {
		return out.substring(0,3)+word+out.substring(3);
	}
	public static void main(String[] args) {

		ClassE obj=new ClassE();
		String result=obj.MakeOutWord("{{{}}", "Sanju");
        System.out.println(result);
	}

}
