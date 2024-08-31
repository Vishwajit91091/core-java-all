package string_handling;

public class DiffStringBufferStringBuilder {

	void meth1(){
		String s1=new String("java");
		String s2=new String("java");
		
		StringBuffer buffer1=new StringBuffer("java");
		StringBuffer buffer2=new StringBuffer("java");
		
		StringBuilder builder1=new StringBuilder("java");
		StringBuilder builder2=new StringBuilder("java");
		
		//equals()
		
		System.out.println(s1.equals(s2)); //true
		System.out.println(buffer1.equals(builder2)); //false
		System.out.println(builder1.equals(builder2)); //false
		
		//System.out.println(buffer1.equals(new String("java")));
		//Unlikely argument type for equals(): String seems to be unrelated to StringBuffer
		
		System.out.println(buffer1.equals(new StringBuffer("java")));
		System.out.println(new StringBuilder("java").equals(new StringBuilder("java")));
		
		System.out.println("===========================");
		
		// ==
		System.out.println(s1==s2);
		System.out.println(buffer1==buffer2);
		System.out.println(builder1==builder2);
		
		System.out.println("============================");
		
		//Comparing content present inside StringBuffer & StringBuilder
		
		System.out.println(buffer1.toString().equals(buffer2.toString()));
		System.out.println(buffer1.toString().equals(new String("java").toString()));
		System.out.println(buffer1.toString().equalsIgnoreCase(new StringBuffer("java").toString()));
		System.out.println(builder1.toString().equals(builder2.toString()));
	}
	
	void meth2() {
		String s=new String("java");
		StringBuffer buffer=new StringBuffer("java");
		StringBuilder builder=new StringBuilder("java");
		
		System.out.println("s: "+s);
		System.out.println("buffer: "+buffer);
		System.out.println("builser: "+builder);
		System.out.println();
		
		System.out.println(s.concat(" is awsome"));
		System.out.println(buffer.append(" is awsome"));
		System.out.println(builder.append(" is awsome"));
		
		System.out.println();
		System.out.println("s: "+s);
		System.out.println("buffer: "+buffer);
		System.out.println("builser: "+builder);
	}
	void meth3() {
		
		System.out.println("meth3() Called");
		StringBuffer sb=new StringBuffer();
		System.out.println("capacity: "+sb.capacity());
		sb.append("abcdefghijklmnop");
		System.out.println(sb);
		System.out.println("length(): "+sb.length());
		sb.append("q");
		System.out.println(sb);
		//(Currentcapacity+1)*2
		System.out.println("capacity: "+sb.capacity());
		System.out.println("length(): "+sb.length());
		
		System.out.println("=========================");
		System.out.println("charAt(): "+sb.charAt(sb.length()-2));
		System.out.println("substring(): "+sb.substring(sb.length()-2*2));
		//System.out.println("substring(): "+sb.substring((sb.length()-2)*2));//StringIndexOutOfBoundsException
	
		System.out.println("reverse(): "+sb.reverse());
	}
	public static void main(String[] args) {
		
		DiffStringBufferStringBuilder diff=new DiffStringBufferStringBuilder();
		diff.meth1();
		//diff.meth2();
		//diff.meth3();

	}

}
