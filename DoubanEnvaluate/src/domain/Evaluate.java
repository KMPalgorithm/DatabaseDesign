package domain;

import java.sql.Date;

public class Evaluate {

	private String UID;
	private String FID;
	private int Score;
	private String CMT;
	private String Status;
	private String UT;
	private Date EDate;
	
	public Evaluate()
	{}
	
	public Evaluate(String uid, String fid, int score, String cmt, String status, String ut, Date edate)
	{
		UID=uid;
		FID=fid;
		Score=score;
		CMT=cmt;
		Status=status;
		UT=ut;
		EDate=edate;
	}
	
	public String getUID() {
		return UID;
	}
	public void setUID(String uID) {
		UID = uID;
	}
	public String getFID() {
		return FID;
	}
	public void setFID(String fID) {
		FID = fID;
	}
	public int getScore() {
		return Score;
	}
	public void setScore(int score) {
		Score = score;
	}
	public String getCMT() {
		return CMT;
	}
	public void setCMT(String cMT) {
		CMT = cMT;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public String getUT() {
		return UT;
	}
	public void setUT(String uT) {
		UT = uT;
	}
	public Date getEDate() {
		return EDate;
	}
	public void setEDate(Date eDate) {
		EDate = eDate;
	}
}