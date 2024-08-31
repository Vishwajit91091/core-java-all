package collection;

public class PassingObj_IntoLinkedList_A
{
	private String stdName;
	private int stdId;
	private String stdBranch;
	public PassingObj_IntoLinkedList_A(String stdName, int stdId, String stdBranch) {
		this.stdName = stdName;
		this.stdId = stdId;
		this.stdBranch = stdBranch;
	}
	@Override
	public String toString() {
		return  stdName + " " + stdId + " " + stdBranch;
	}
	
	

}
