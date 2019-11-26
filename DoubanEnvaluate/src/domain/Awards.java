package domain;

public class Awards {
	private String AID;
	private String ATID;
	private String FID;
	private String SID;
	
	public Awards(){}
	
	public Awards(String a, String b, String c, String d)
	{
		AID=a;
		ATID=b;
		FID=c;
		SID=d;
	}
	
	public String getAID() {
		return AID;
	}
	public void setAID(String aID) {
		AID = aID;
	}
	public String getATID() {
		return ATID;
	}
	public void setATID(String aTID) {
		ATID = aTID;
	}
	public String getFID() {
		return FID;
	}
	public void setFID(String fID) {
		FID = fID;
	}
	public String getSID() {
		return SID;
	}
	public void setSID(String sID) {
		SID = sID;
	}
	
}
