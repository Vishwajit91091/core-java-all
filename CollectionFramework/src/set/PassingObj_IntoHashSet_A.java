package set;

public class PassingObj_IntoHashSet_A
{
	private String sName;
	private int sId;
	private String sGrade;
	public PassingObj_IntoHashSet_A(String sName, int sId, String sGrade) {
		this.sName = sName;
		this.sId = sId;
		this.sGrade = sGrade;
	}
	@Override
	public String toString() {
		return  sName + " " + sId + " " + sGrade;
	}
	

}
