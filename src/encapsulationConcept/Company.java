package encapsulationConcept;

public class Company {
	
	private String cname;
	private int cemp;
	private int shareprice;
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getCemp() {
		return cemp;
	}
	public void setCemp(int cemp) {
		this.cemp = cemp;
	}
	public int getShareprice() {
		return shareprice;
	}
	public void setShareprice(int shareprice) {
		this.shareprice = shareprice;
	}
	
	private void getPrivacyPolicy() {
		System.out.println("Privacy policy..");
		
	}
	
	public void getPolicyInfo(){
		 getPrivacyPolicy();
	}
	

}
