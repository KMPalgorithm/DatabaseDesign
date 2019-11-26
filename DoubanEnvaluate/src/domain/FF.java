package domain;

public class FF {
	private String FID;
	private String FFID;
	
	public FF()
	{}
	public FF(String a, String b)
	{
		FID=a;
		FFID=b;
	}
	
	public String getFID() {
		return FID;
	}
	public void setFID(String fID) {
		FID = fID;
	}
	public String getFFID() {
		return FFID;
	}
	public void setFFID(String fFID) {
		FFID = fFID;
	}
	
}
