package c_based_programs;

public class RevTheDegits {

	public static void main(String[] args) {
		new RevTheDegits().meth1(12);
		int no=1234;
		while(no!=0) {
			int d=no%10;
			System.out.print(d);
			no=no/10;
		}
		int n=1234;
		int sum=0;
		while(n!=0) {
			int d=n%10;
			sum=sum+d;
			n=n/10;
		}
		System.out.println();
		System.out.println(sum);
		
		int no1=1234;
		while(no1!=0) {
			int d=no1%10;
			if(d%2==1) {
				System.out.print(d+" ");
			}
			no1=no1/10;
		}
		System.out.println();
		System.out.println("==========================");
		int no2=100;
		for(int i=1;i<=no2;i++) {
			for(int j=2;j<=no2-1;j++) {
		
			}
		}	
		
	}
	void meth1(int unit) {
		int bill=unit*100;
		if(bill>=1000) {
			int dis=(bill*10)/100;
			System.out.println("your are getting 10 % discount your final bill is: "+(bill-dis));
		}
		else
		System.out.println("you are not getting dis your bill is "+bill+" if you perches more "+(1000-bill)+" then get 10% dis");
	}
	
	
	
	
	
	
	
	
	
	
	
}
