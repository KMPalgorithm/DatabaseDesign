package domain;

public class AType {
	private String ATID;
	private String TName;
	
	public AType()
	{}
	
	public AType(String id, String tn)
	{
		ATID = id;
		TName = tn;
	}
	
	public String getATID() {
		return ATID;
	}
	public void setATID(String aTID) {
		ATID = aTID;
	}
	public String getTName() {
		return TName;
	}
	public void setTName(String tName) {
		TName = tName;
	}
	
}
