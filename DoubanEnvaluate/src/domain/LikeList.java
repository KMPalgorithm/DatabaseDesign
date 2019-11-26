package domain;

public class LikeList
{
	private String LID;
	private String UID;
	private String FID;
	private String LN;
	private String LIntro;
	private String LPic;
	
	public LikeList()
	{}
	
	public LikeList(String lid, String uid, String fid, String ln, String lintro, String lpic)
	{
		LID=lid;
		UID=uid;
		FID=fid;
		LN=ln;
		LIntro=lintro;
		LPic=lpic;
	}
	
	public String getLID()
	{
		return LID;
	}
	public String getUID()
	{
		return UID;
	}
	public String getFID()
	{
		return FID;
	}
	public String getLN()
	{
		return LN;
	}
	public String getLIntro()
	{
		return LIntro;
	}
	public String getLPic()
	{
		return LPic;
	}
	
	public void setLID(String lid)
	{
		LID=lid;
	}
	public void setUID(String uid)
	{
		UID=uid;
	}
	public void setFID(String fid)
	{
		FID=fid;
	}
	public void setLN(String ln)
	{
		LN=ln;
	}
	public void setLIntro(String lintro)
	{
		LIntro = lintro;
	}
	public void setLPic(String lpic)
	{
		LPic=lpic;
	}
}