package collection;

public class PassingObj_IntoArrayList_A
{
	private int empId;
	private String empName;
	private int empSal;
	public PassingObj_IntoArrayList_A(int empId, String empName, int empSal) {
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
	}
	@Override
	public String toString() {
		return  empId +empName +  empSal;
	}

	
}
