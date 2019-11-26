package domain;

import java.sql.Date;

public class Chat
{
	private String FID;
	private String CID;
	private String UID;
	private Date date;
	private String title;
	private String cont;
	private int likenum;
	
	public Chat()
	{}
	
	public Chat(String Fid, String Cid, String Uid, Date dat, String titl, String ct, int lnum)
	{
		FID = Fid;
		CID = Cid;
		UID = Uid;
		date = dat;
		title = titl;
		cont = ct;
		likenum = lnum;
	}
	
	public String getFID()
	{
		return FID;
	}
	public String getCID()
	{
		return CID;
	}
	public String getUID()
	{
		return UID;
	}
	public Date getDate()
	{
		return date;
	}
	public String getTitle()
	{
		return title;
	}
	public String getCont()
	{
		return cont;
	}
	public int getLikeNum()
	{
		return likenum;
	}
	
	public void setFID(String fid)
	{
		FID = fid;
	}
	public void setCID(String cid)
	{
		CID=cid;
	}
	public void setUID(String uid)
	{
		UID=uid;
	}
	public void setDate(Date dat)
	{
		date=dat;
	}
	public void setTitle(String Title)
	{
		title = Title;
	}
	public void setCont(String Cont)
	{
		cont=Cont;
	}
	public void setLikeNum(int LikeNum)
	{
		likenum = LikeNum;
	}
}