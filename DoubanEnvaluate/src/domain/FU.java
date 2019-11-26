package domain;

public class FU {
	private String UID;
	private String FUID;
	
	public FU()
	{}
	public FU(String a, String b)
	{
		UID=a;
		FUID=b;
	}
	
	public String getUID() {
		return UID;
	}
	public void setUID(String uID) {
		UID = uID;
	}
	public String getFUID() {
		return FUID;
	}
	public void setFUID(String fUID) {
		FUID = fUID;
	}
	
}
