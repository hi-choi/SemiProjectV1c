package hi_choi.spring.vo;

public class Member {
	
	protected String mno;
	protected String userid;
	protected String passwd;
	protected String name;
	protected String email;
	protected String joindate;
	
	public Member() {
		
	}
	
	public String getMno() {
		return mno;
	}
	
	public void setMno(String mno) {
		this.mno = mno;
	}
	
	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	

	public String getJoindate() {
		return joindate;
	}
	
	public void setJoindate(String joindate) {
		this.joindate = joindate;
	}
	

}
