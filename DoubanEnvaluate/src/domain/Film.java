package domain;

import java.sql.*;

public class Film {
	private String FID;
	private String FN;
	private String TYPE;
	private String AREA;
	private String LNG;
	private int FT;
	private String AN;
	private String INTRO;
	private String POS;
	
	public Film()
	{}
	
	public Film(String fid, String fn, String type, String area, String lng, int ft, String an, String intro, String pos)
	{
		FID=fid;
		FN=fn;
		AREA=area;
		LNG=lng;
		FT=ft;
		AN=an;
		INTRO=intro;
		TYPE=type;
		POS=pos;
	}
	
	public void setAN(String aN) {
		AN = aN;
	}
	public void setAREA(String aREA) {
		AREA = aREA;
	}

	public void setFID(String fID) {
		FID = fID;
	}
	public void setFN(String fN) {
		FN = fN;
	}
	public void setFT(int fT) {
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
	public void setTYPE(String tYPE) {
		TYPE = tYPE;
	}
	public String getAN() {
		return AN;
	}
	public String getAREA() {
		return AREA;
	}
	public String getFID() {
		return FID;
	}
	public String getFN() {
		return FN;
	}
	public int getFT() {
		return FT;
	}
	public String getINTRO() {
		return INTRO;
	}
	public String getLNG() {
		return LNG;
	}
	public String getPOS() {
		return POS;
	}
	public String getTYPE() {
		return TYPE;
	}
	
}
