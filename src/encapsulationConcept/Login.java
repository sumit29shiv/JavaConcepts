package encapsulationConcept;

public class Login {
	
	private String uname;
	private String pwd;
	
	Login(String uname, String pwd){
		this.uname = uname;
		this.pwd = pwd;
	}
	
	
	public String getUname() {
		return uname;
	}
//	public void setUname(String uname) {
//		this.uname = uname;
//	}
	
	public String getPwd() {
		return pwd;
	}
	
//	public void setPwd(String pwd) {
//		this.pwd = pwd;
//	}
	
	public void doLogin(String uname, String pwd) {
		System.out.println("Login with credetials: "+uname +" "+pwd);
	}

}
