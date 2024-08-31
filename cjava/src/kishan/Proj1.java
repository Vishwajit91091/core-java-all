package kishan;

import java.util.Scanner;

public class Proj1 {
	Scanner s = new Scanner(System.in);

	static int totalBill = 0;
	static int disc=0;
	static int discount=0;
	void store() 
	{
		a :while (true) {
			System.out.println("Please Choose What You Want To Purches");
			System.out.println("1)Fruits");
			System.out.println("2)Cosmetics");
			System.out.println("3)Vegetables");
			System.out.println("==================");
			System.out.println("Press 4  For Exit");
			int items = s.nextInt();

			switch (items) {

			case 1:

				System.out.println("-------------------------------------------");
				System.out.println("|  101)Mango--------1kg--------rs200------|");
				System.out.println("|  102)Apple--------1kg--------rs250------|");
				System.out.println("|  103)Banana--------1kg--------rs50------|");
				System.out.println("-------------------------------------------");
				System.out.println("Please Choose Your Product Code");
				int product = s.nextInt();
				switch (product) {
				case 101:
					System.out.println("How Many kg You Want");
					int frute = s.nextInt();
					int res = frute * 200;
					totalBill = totalBill + res;
					// System.out.println(res);
					System.out.println("Enter your choice");
                  //  switch()

					break;
				case 102:
					System.out.println("How Many kg You Want");
					int frute1 = s.nextInt();
					int res1 = frute1 * 250;
					totalBill = totalBill + res1;
					// System.out.println(res);
					break;
				case 103:
					System.out.println("How Many kg You Want");
					int frute2 = s.nextInt();
					int res2 = frute2 * 50;
					totalBill = totalBill + res2;
					// System.out.println(res);
					break;
				}

				break;
			case 2:

				System.out.println("-------------------------------------------");
				System.out.println("|  201)kajal------------1--------rs300------|");
				System.out.println("|  202)Lip stick--------1--------rs750------|");
				System.out.println("|  203)nail polish------1--------rs50-------|");
				System.out.println("-------------------------------------------");
				System.out.println("Please Choose Your Product Code");
				int product1 = s.nextInt();
				switch (product1) {
				case 201:
					System.out.println("How Many pis You Want");
					int costamit = s.nextInt();
					int res = costamit * 300;
					totalBill = totalBill + res;

					break;
				case 202:
					System.out.println("How Many pic You Want");
					int costamit1 = s.nextInt();
					int res1 = costamit1 * 750;
					totalBill = totalBill + res1;
					break;
				case 203:
					System.out.println("How Many pic You Want");
					int costamit2 = s.nextInt();
					int res2 = costamit2 * 50;
					totalBill = totalBill + res2;
					break;
				}
				break;
			case 3:
				int vegetables = 3;
				if (items == vegetables) {
					System.out.println("-------------------------------------------");
					System.out.println("|  301)Tomato----------1kg--------rs30------|");
					System.out.println("|  302)patato----------1kg--------rs20------|");
					System.out.println("|  303)brinjal---------1kg--------rs40-------|");
					System.out.println("-------------------------------------------");
					System.out.println("Please Choose Your Product Code");
					int product2 = s.nextInt();
					switch (product2) {
					case 301:
						System.out.println("How Many kg You Want");
						int vegetable = s.nextInt();
						int res = vegetable * 30;
						totalBill = totalBill + res;

						break;
					case 302:
						System.out.println("How Many kg You Want");
						int vegetable1 = s.nextInt();
						int res1 = vegetable1 * 20;
						totalBill = totalBill + res1;
						break;
					case 303:
						System.out.println("How Many kg You Want");
						int vegetable2 = s.nextInt();
						int res2 = vegetable2 * 40;
						totalBill = totalBill + res2;
						break;
					}
				}
				break;
			case 4:
				break a;
			}
			
		}

	}

	public static void main(String[] args) {

		Proj1 aobj = new Proj1();
		aobj.store();
		
		System.out.println("Enter Your Name: ");
		aobj.s.nextLine();
		String name = aobj.s.nextLine();
		System.out.println("Enter Your Address: ");
		String address = aobj.s.nextLine();
		System.out.println("Enter Your Mobile No : ");
		int no = aobj.s.nextInt();
		//System.out.println(totalBill);
		if (totalBill >= 1000) {
			// int totalbi=totalBill*(10/100);
			// System.out.println(totalbi-totalBill);

			discount = ((totalBill * 10) / 100);
			disc = totalBill - discount;
			//System.out.println("Total Bill Is " + disc);
		}
		System.out.println("|=====================================|");
		System.out.println("|==========Welcome To Store===========|");
		System.out.println("|======"+"Total Bill===="+totalBill+"=============|");
		System.out.println("|===="+"You Are Resived discount : "+discount+"===|");
		System.out.println("|===="+"Final Bill is "+disc+"===============|");
		System.out.println("|=============Thank You ==============|");
		
		System.out.println("Name : "+name);	
		System.out.println("Address : "+address);
		System.out.println("Mobile No : "+no);
	}

}
