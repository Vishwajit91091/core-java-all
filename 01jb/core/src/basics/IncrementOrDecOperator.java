package basics;

public class IncrementOrDecOperator {
	public static void main(String[] args) {
		int a=34;
		int b=21;
		int c=a++ + ++b;
		System.out.println("c=>"+c+" b=>"+b+" a=>"+a);
		int d=--a + --b+c--;
		System.out.println("d=>"+d+" c=>"+c+" b=>"+b+" a=>"+a);
		int e=a + +b+ +c+d--;
		System.out.println("e=>"+e+" d=>"+d+" c=>"+c+" b=>"+b+" a=>"+a);
		int f=-a+b-- + -c -d++;
		System.out.println("f=>"+f+" e=>"+e+" d=>"+d+" c=>"+c+" b=>"+b+" a=>"+a);
		int sum=a+b+c+d+e+f;
		System.out.println("sum=>"+sum);
		
	}

}
