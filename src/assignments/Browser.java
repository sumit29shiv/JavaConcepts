package assignments;
import java.util.ArrayList;
import java.util.Arrays;

public class Browser {
	
	String browserName;
	String vendorName;
	double currentversion;
	ArrayList<String> plugins;
	

	public static void main(String[] args) {
		
		ArrayList<String> chromePlugins = new ArrayList<String>(Arrays.asList("Chropath", "Selectorhub","json formatter"));
		
		Browser chrome = new Browser("chrome","Google",85.0,chromePlugins);
		System.out.println(chrome.getBrowserName());
		System.out.println(chrome.getVendorName());
		System.out.println(chrome.getCurrentversion());
		System.out.println(chrome.getPlugins());
		
	}
	
	/*
		2. Design a browser class template with the following features:
		 variables:
		browserName
		vendorName
		currentVersion
		List of plugins supported by Browser in Array List<String>
		
		--Design the constructor of this class with different parameters and all parameters.
		
		--Write the get method of each variable with return keyword. 
	 */
	
	Browser(String bname, String vname, double cversion, ArrayList<String> plugins){
		
		this.browserName = bname;
		this.vendorName = vname;
		this.currentversion = cversion;
		this.plugins = plugins;
		
		
	}

	public Browser(String browserName, String vendorName, float currentversion) {
		super();
		this.browserName = browserName;
		this.vendorName = vendorName;
		this.currentversion = currentversion;
	}

	public Browser(String browserName, String vendorName) {
		super();
		this.browserName = browserName;
		this.vendorName = vendorName;
	}

	public Browser(String browserName, float currentversion) {
		super();
		this.browserName = browserName;
		this.currentversion = currentversion;
	}
	
	//getter methods

	public String getBrowserName() {
		return browserName;
	}

	
	public String getVendorName() {
		return vendorName;
	}

	
	public double getCurrentversion() {
		return currentversion;
	}

	
	public ArrayList<String> getPlugins() {
		return plugins;
	}

	
	
	

}
