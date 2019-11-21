package domain;

public class User {
	private String UID;
	private String UN;
	private String PWD;
	private String PN;
	private String EMAIL;
	
	public User(String uid, String un, String pwd, String pn, String email)
	{
		UID=uid;
		PWD=pwd;
		PN=pn;
		UN=un;
		EMAIL=email;
	}
	
	public User()
	{}
	
	public String getUID() {
		return UID;
	}
	public void setUID(String uID) {
		UID = uID;
	}
	public String getEmail() {
		return EMAIL;
	}
	public void setEMAIL(String eMAIL) {
		EMAIL = eMAIL;
	}
	public String getPN() {
		return PN;
	}
	public void setPN(String pN) {
		PN = pN;
	}
	public String getPWD() {
		return PWD;
	}
	public void setPWD(String pWD) {
		PWD = pWD;
	}
	public String getUN() {
		return UN;
	}
	public void setUN(String uN) {
		UN = uN;
	}
	

}
