package domain;

public class Award
{
	private String AID;
	private String AName;
	private String AIntro;
	
	public Award()
	{}
	
	public Award(String AID, String AName, String AIntro)
	{
		this.AID = AID;
		this.AName = AName;
		this.AIntro = AIntro;
	}
	
	public String getAID()
	{
		return AID;
	}
	public String getAName()
	{
		return AName;
	}
	public String getAIntro()
	{
		return AIntro;
	}
	
	public void setAID(String AID)
	{
		this.AID = AID;
	}
	public void setAName(String AName)
	{
		this.AName = AName;
	}
	public void setAIntro(String AIntro)
	{
		this.AIntro = AIntro;
	}
	
}