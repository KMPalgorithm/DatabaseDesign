package domain;

public class FeS {
	private String UID;
	private String SID;
	
	public FeS()
	{}
	public FeS(String a, String b)
	{
		UID=a;
		SID=b;
	}
	
	public String getUID() {
		return UID;
	}
	public void setUID(String uID) {
		UID = uID;
	}
	public String getSID() {
		return SID;
	}
	public void setSID(String sID) {
		SID = sID;
	}
	
}
