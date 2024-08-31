package controlstatement;

public class SelectionStatement {
       // IF Statement
	void meth1(int a) {
		System.out.println("..........meth1()..........");
		
		if(a<=50) {
			System.out.println("hii..");
		}
		System.out.println("meth1()execution complited");
	}
	void meth2(int a)
	{
		System.out.println("..........meth2()..........");
		if(a==10)
			//int a=10;//C E because we should not write any declaritive stmts in this line
			System.out.println("hello..");
		    System.out.println("java is awsome");
		System.out.println("meth2()execution complited");
	}
	
	// IF-Else Statement
	
	void meth3(int a)
	{
		System.out.println("..........meth3()..........");
		if(!(a<=new SelectionStatement().meth4()*2)) 
		{
		System.out.println("if block executed");
		System.out.println("hii..");
		}
		else {
			System.out.println("else block executed");
			System.out.println("hello..");
		}
		System.out.println("meth3()execution complited");
	}
	 int meth4() {
		System.out.println("meth4() called");
		return 50;
	}
	 void meth5(int a) 
	 {
		 System.out.println("..........meth5()..........");
		 if(a<=10)
			 //int a=100;//C E
			 System.out.println("if block executed");
		    // System.out.println("hii..");
		 else
			 System.out.println("hello..");
		 System.out.println("meth5()execution complited");
	 }
	 void meth6(int a)
	 {
		 System.out.println("..........meth6()..........");
		 if(true)
		 {
			 System.out.println("if block executed");
		 }
		 else
		 {
			 System.out.println("else block executed");//dead code
		 }
		 
		 System.out.println("meth6()execution complited");
	 }
	 
	// IF-Else-If Statement
	 
	 void meth7(int num)
	 {
		 System.out.println("..........meth7()..........");
		 if(num>0) 
		 {
			 System.out.println(num+" no is positive ");
		 }
		 else if(num<0)
		 {
		 System.out.println(num+" no is negative ");
		 }
		 else
		 {
		 System.out.println(num+" no is equals to zero");
		 }
		 System.out.println("meth7()execution complited");
	 }
	 void meth8(int a,int b, int c) 
	 {
		 System.out.println("..........meth8()..........");
          if(a<=10)
          {
        	  if(b<=50) 
        	  {
        		System.out.println("hii...");  
        	  }
        	  else
        	  {
        		  System.out.println("hello...");
        	  }	  
          }
          else {
        	  if(c<=50) 
        	  {
        		System.out.println("Java");  
        	  }
        	  else
        	  {
        		  System.out.println("Oracle");
        	  }
          }
		 System.out.println("meth8()execution complited");
	 }
	 public static void main(String[] args) {
		 SelectionStatement ss=new SelectionStatement();
		 ss.meth1(100-'A');
		 ss.meth2(50);
		 ss.meth3('a'+3);
		 ss.meth5(5);
		 ss.meth6(500);
		 ss.meth7(-5);
		 ss.meth8(50, 10, (15)*2);
	}
}
