package controlstatement;

public class ClassD {
	
	void users(int sal,int years) 
	{
		int bonous=(sal*5)/100;
		
		if(years>5) {
			System.out.println("your updated sal is: "+(sal+bonous));
		}
		else {
			System.out.println(sal+" your sal is not increase please wait more: "+(5-years)+" years");
		}
		
	}
	public static void main(String[] args) {
		new ClassD().users(5000, 3);
	}

}
