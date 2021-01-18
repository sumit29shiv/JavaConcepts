package encapsulationConcept;

public class Employee {

	//declaring class variables as private
	private String ename;
	private double esal;
	private boolean isPermanent;
	private int age;
	
	// creating public getter and setter methods to give access to private data
	// members outside the class through them
	public void setEname(String name) {
		this.ename = name;
		
	}
	
	public String getEname() {
		return ename;
	
	}

	public double getEsal() {
		return esal;
	}

	public void setEsal(double esal) {
		this.esal = esal;
	}

	public boolean isPermanent() {
		return isPermanent;
	}

	public void setPermanent(boolean isPermanent) {
		this.isPermanent = isPermanent;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
