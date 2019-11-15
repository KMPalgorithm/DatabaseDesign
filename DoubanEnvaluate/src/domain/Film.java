package domain;

public class Film {
	private String FID;
	private String FN;
//	private String LR;  //leading role
//	private String ED;  
//	private String DIR; //director
	private String TYPE;
	private String AREA;
	private String LNG;
	private String FT;
	private String ST;
	private String AN;
	private String INTRO;
	private String POS;
	private String CT1;
	private String CT2;
	private String CT3;
	private String CT4;
	private String CT5;
	
	public void setAN(String aN) {
		AN = aN;
	}
	public void setAREA(String aREA) {
		AREA = aREA;
	}
	public void setCT1(String cT1) {
		CT1 = cT1;
	}
	public void setCT2(String cT2) {
		CT2 = cT2;
	}
	public void setCT3(String cT3) {
		CT3 = cT3;
	}
	public void setCT4(String cT4) {
		CT4 = cT4;
	}
	public void setCT5(String cT5) {
		CT5 = cT5;
	}

	public void setFID(String fID) {
		FID = fID;
	}
	public void setFN(String fN) {
		FN = fN;
	}
	public void setFT(String fT) {
		FT = fT;
	}
	public void setINTRO(String iNTRO) {
		INTRO = iNTRO;
	}
	public void setLNG(String lNG) {
		LNG = lNG;
	}
	public void setPOS(String pOS) {
		POS = pOS;
	}
	public void setST(String sT) {
		ST = sT;
	}
	public void setTYPE(String tYPE) {
		TYPE = tYPE;
	}
	public String getAN() {
		return AN;
	}
	public String getAREA() {
		return AREA;
	}
	public String getCT1() {
		return CT1;
	}
	public String getCT2() {
		return CT2;
	}
	public String getCT3() {
		return CT3;
	}
	public String getCT4() {
		return CT4;
	}
	public String getCT5() {
		return CT5;
	}
	public String getDIR() {
		return DIR;
	}
	public String getED() {
		return ED;
	}
	public String getFID() {
		return FID;
	}
	public String getFN() {
		return FN;
	}
	public String getFT() {
		return FT;
	}
	public String getINTRO() {
		return INTRO;
	}
	public String getLNG() {
		return LNG;
	}
	public String getLR() {
		return LR;
	}
	public String getPOS() {
		return POS;
	}
	public String getST() {
		return ST;
	}
	public String getTYPE() {
		return TYPE;
	}
	
}
