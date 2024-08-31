package set;

public class PassingObj_IntoLinkedHashSet_A
{
	private int stdId;
	private String stdName;
	private String stgGrade;
	public PassingObj_IntoLinkedHashSet_A(int stdId, String stdName, String stgGrade) {
		this.stdId = stdId;
		this.stdName = stdName;
		this.stgGrade = stgGrade;
	}
	@Override
	public String toString() {
		return   stdId + " " + stdName + " " + stgGrade;
				
	}
	
	

}
