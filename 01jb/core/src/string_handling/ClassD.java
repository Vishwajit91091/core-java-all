package string_handling;

import java.util.Scanner;

/*
  Given a String name ,e.g "Bob",return a greting of the from "Bob!"
  helloName("Bob")? "HelloBob!"
  helloName("Alice")? "HelloAlice!"
  helloName("x")? "Hellox!"
 */
public class ClassD {

	Scanner sc=new Scanner(System.in);
	
	public String helloName(String name) {
		//System.out.println("Hello"+name+"!");
		//return"Hello".concat(name).concat("!");
		return "Hello"+name+"!";
	}
	public static void main(String[] args) {
        ClassD obj=new ClassD();
        obj.helloName("sanju");
        //String result=obj.helloName("java");
        //System.out.println(result);
		//new ClassD().helloName("java");
        System.out.println("Enter a String ");
        String r=obj.sc.next();
        System.out.println(obj.helloName("sanju"));
	}

}
