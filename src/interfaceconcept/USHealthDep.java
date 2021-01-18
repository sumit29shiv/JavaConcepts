package interfaceconcept;


public interface USHealthDep extends WHO {
	

	// Only method declaration no implementation(method body)
	public void orthoService (); // method decration
	
	public void heartService(); // method declration
	
	public void migranService();
	
	
	public static void hello() {
		System.out.println("Hello");
	}

	
}
