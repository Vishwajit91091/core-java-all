package c_based_programs;

public class ReadAge_inNo_FindYear {

	void meth1(int days) {
		int year=days/365;
		int mongth=(days%365)/30;
		int day=(days%365)%30;
		System.out.println(year+" year "+mongth+" mongth "+day+" days");
	}
	public static void main(String[] args) {
		new ReadAge_inNo_FindYear().meth1(366);

	}

}
