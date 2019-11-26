package domain;

import java.sql.Date;

public class Reply 
{
	private String CID;
	private String UID;
	private Date date;
	private String Cont;
	private int LikeNum;
	
	public Reply(){}
	
	public Reply(String cid, String uid, Date dat, String cont, int liken)
	{
		CID=cid;
		UID=uid;
		date=dat;
		Cont=cont;
		LikeNum=liken;
	}
	
	public String getCID() {
		return CID;
	}
	public void setCID(String cID) {
		CID = cID;
	}
	public String getUID() {
		return UID;
	}
	public void setUID(String uID) {
		UID = uID;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getCont() {
		return Cont;
	}
	public void setCont(String cont) {
		Cont = cont;
	}
	public int getLikeNum() {
		return LikeNum;
	}
	public void setLikeNum(int likeNum) {
		LikeNum = likeNum;
	}
}
