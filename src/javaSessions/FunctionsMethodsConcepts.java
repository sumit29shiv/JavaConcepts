package javaSessions;

public class FunctionsMethodsConcepts {

	public static void main(String[] args) {
		
		
		FunctionsMethodsConcepts fun = new FunctionsMethodsConcepts();
		fun.welcome();
		int result = fun.addition();
		System.out.println("addiiton is:"+result);
		fun.multiply(2, 3);
		int sub = fun.subtract(5, 2);
		System.out.println("Subtraction is:"+sub);
		String capital = fun.getCapitalName("Russia");
		System.out.println(capital);
		String capital1 = fun.getCapitalName("UK");
		System.out.println(capital1);
		
		if(fun.launchBrowser("chrome")) {
			System.out.println("starting testcases in chrome browser");
		}
		
		else {
			System.out.println("OOPS !! Browser not found..");
		}
	}

// non static methods
// functions type
//1. no input no return
	public void welcome(){
		
		System.out.println("Hello Guest !!");
	}
	
//2. no input with return
	public int addition() {
		
		System.out.println("performing addition");
		int a = 2;
		int b = 3;
		int sum = a+b;
		return sum;
	}

//3. some input with no return
	public void multiply(int a, int b) {
		
		System.out.println("performing addition");
		int mul = a*b;
		System.out.println(mul);
	}
	
//4. some input with return
	public int subtract(int a, int b) {
		
		System.out.println("Performing subtraction");
		return (a+b);
	}
	
	public String getCapitalName(String countryName) {
		
		String capital= "";
		
		System.out.println("Getting capital name for "+countryName + "..");
		
		if(countryName.equals("India")) {
			capital = "New Delhi";
		}
		
		else if(countryName.equals("USA")) {
			capital = "Washinton DC";
		}
		
		else if(countryName.equals("UK")) {
			capital = "London";
		}
		
		else {
			System.out.println("Capital not found "+countryName);
			return null;
		}
		
		return capital;
	}
	
	public boolean launchBrowser(String browserName) {
		boolean flag = false;
		System.out.println("Launching browser.. "+browserName);
		switch (browserName) {
		case "chrome":
			flag = true; 
			break;
			
		case "firefox":
			flag = true;
			break;
			
		case "safari":
			flag = true;
			break;

		default:
			break;
		}
		
		return flag;
	}
	
	
}
