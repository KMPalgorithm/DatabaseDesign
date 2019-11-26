package domain;

public class FT {
	private String TID;
	private String FID;
	private int TC;
	
	public FT(){}
	public FT(String Fid, String Tid, int tc)
	{
		FID=Fid;
		TID=Tid;
		TC=tc;
	}
	public String getTID() {
		return TID;
	}
	public void setTID(String tID) {
		TID = tID;
	}
	public String getFID() {
		return FID;
	}
	public void setFID(String fID) {
		FID = fID;
	}
	public int getTC() {
		return TC;
	}
	public void setTC(int tc) {
		TC = tc;
	}
	
}