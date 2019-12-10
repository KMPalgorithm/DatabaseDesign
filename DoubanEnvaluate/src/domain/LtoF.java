package domain;

public class LtoF {
	private String LID;
	private String FID;
	
	public LtoF()
	{}
	public LtoF(String a, String b)
	{
		LID=a;
		FID=b;
	}
	
	public String getLID() {
		return LID;
	}
	public void setLID(String uID) {
		LID = uID;
	}
	public String getFID() {
		return FID;
	}
	public void setFID(String sID) {
		FID = sID;
	}
	
}
