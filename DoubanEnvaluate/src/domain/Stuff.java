package domain;

import java.sql.Date;

public class Stuff {
	private String SID;
	private String SN;
	private String Sex;
	private Date BDate;
	private String BP;
	private String Voca;
	private String MN;
	private String SIntro;
	private String SPic;
	
	public Stuff()
	{}
	
	public Stuff(String sid, String sn, String sex, Date bdate, String bp, String voca, String mn, String sintro, String spic)
	{
		SID=sid;
		SN=sn;
		Sex=sex;
		BDate=bdate;
		BP=bp;
		Voca=voca;
		MN=mn;
		SIntro = sintro;
		SPic = spic;
	}
	
	public void setBDate(Date bDate) {
		BDate = bDate;
	}
	public void setBP(String bP) {
		BP = bP;
	}
	public void setMN(String mN) {
		MN = mN;
	}
	public void setSex(String sex) {
		Sex = sex;
	}
	public void setSID(String sID) {
		SID = sID;
	}
	public void setSN(String sN) {
		SN = sN;
	}
	public void setVoca(String voca) {
		Voca = voca;
	}
	public void setSIntro(String sIntro) {
		SIntro = sIntro;
	}
	
	
	public Date getBDate() {
		return BDate;
	}
	public String getBP() {
		return BP;
	}
	public String getMN() {
		return MN;
	}
	public String getSex() {
		return Sex;
	}
	public String getSID() {
		return SID;
	}
	public String getSIntro() {
		return SIntro;
	}
	public String getSN() {
		return SN;
	}
	public String getSPic() {
		return SPic;
	}
	public String getVoca() {
		return Voca;
	}
	
	
	
}
