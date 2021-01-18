package encapsulationConcept;

public class LoginMain {

	public static void main(String[] args) {
	
		Login l = new Login("Sumit","abc123");
		
//		l.setUname("Sumit");
//		l.setPwd("abc123");
		
		l.doLogin(l.getUname(),l.getPwd());
		//l.doLogin(l.uname, l.pwd);
		
		Login l1 = new Login("Amit","bac");
		
		l.doLogin(l1.getUname(), l1.getPwd());

	}

}
