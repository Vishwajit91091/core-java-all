package collection;

public class PassingObj_IntoVector_A 
{
	private String stdName;
	private int stdId;
	private String stdBranch;
	public PassingObj_IntoVector_A(String stdName, int stdId, String stdBranch) {
		
		this.stdName = stdName;
		this.stdId = stdId;
		this.stdBranch = stdBranch;
	}
	@Override
	public String toString() {
		return   stdName + " " + stdId + " " + stdBranch;
	}

}
