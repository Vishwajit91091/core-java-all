package controlstatement;

public class Program {
	void meth(int sal,int service)
	{
		int years=5;
		if(service>years)
		{
			int bonus=(sal*5)/100;
			System.out.println("Total updated salary of employee is:"+(sal+bonus));
		}
			else
			{
			System.out.println("Salary of employee:"+sal);	
			}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Program().meth(30000, 10);

	}

}
