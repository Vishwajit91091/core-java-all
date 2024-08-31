package encapsulation;

public class ClassA {
	
	private String empName;
	private int empId;
    private	String empDept;
    private double empSal;
    private int empExp;
    
    
    public double getEmpSal() {
		return empSal;
	}
	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}
	public int getEmpExp() {
		return empExp;
	}
	public void setEmpExp(int empExp) {
		this.empExp = empExp;
		
		if(empExp>=5) {
			double result=((empSal*10)/100);
			  empSal=empSal+result;
			//System.out.println(result);
		}
		else if(empExp<5) {
			double result=((empSal*5)/100);
			empSal=empSal+result;
			
		}
		
	}

	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpDept() {
		return empDept;
	}
	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}
	
}
