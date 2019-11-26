package domain;

public class FS {
	private String SID;
	private String FID;
	private String Voca;
	
	public FS(){}
	public FS(String sid, String fid, String voca)
	{
		SID=sid;
		FID=fid;
		Voca=voca;
	}
	public String getSID() {
		return SID;
	}
	public void setSID(String sID) {
		SID = sID;
	}
	public String getFID() {
		return FID;
	}
	public void setFID(String fID) {
		FID = fID;
	}
	public String getVoca() {
		return Voca;
	}
	public void setVoca(String voca) {
		Voca = voca;
	}
	
}