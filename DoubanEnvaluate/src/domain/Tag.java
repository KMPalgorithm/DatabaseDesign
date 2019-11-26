package domain;

public class Tag
{
	private String TID;
	private String TN;
	
	public Tag()
	{}
	
	public Tag(String TID, String TN)
	{
		this.TID = TID;
		this.TN = TN;
	}
	
	public String getTN()
	{
		return TN;
	}
	public String getTID()
	{
		return TID;
	}
	
	public void setTN(String TN)
	{
		this.TN = TN;
	}
	public void setTID(String TID)
	{
		this.TID=TID;
	}
}