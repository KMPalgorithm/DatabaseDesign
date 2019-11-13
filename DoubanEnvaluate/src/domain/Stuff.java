package domain;

public class Stuff {
	private String SID;
	private String SN;
	private String Sex;
	private String BDate;
	private String BP;
	private String Voca;
	private String MN;
	private String SIntro;
	private String Spic;
	
	public void setBDate(String bDate) {
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
	
	
	public String getBDate() {
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
	public String getSpic() {
		return Spic;
	}
	public String getVoca() {
		return Voca;
	}
	
	
	
}
