package encapsulationConcept;

public class ChromeBrowser {
	
	public void launchChrome() {
		System.out.println("Launching Chrome Browser");
		checkChromeVersion();
		checkOSVersion();
		interactingWithOSServices();
		checkRamSpace();
	}
	
	private void checkChromeVersion() {
		System.out.println("Checking Chrome Version");
	}
	
	private void checkOSVersion() {
		System.out.println("Checking OS Version");
	}
	
	private void interactingWithOSServices() {
		System.out.println("Connecting with OS Services");
	}
	
	private void checkRamSpace() {
		System.out.println("Checking Ram Space");
	}

}
