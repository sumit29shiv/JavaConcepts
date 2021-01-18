package exceptionHandling;

public class ExceptionHandelingPart2 {
	
	int a = 4;

	public static void main(String[] args) {
		
		ExceptionHandelingPart2 obj = new ExceptionHandelingPart2();
		obj = null;
		
		try {
			int a = 2/0;
		System.out.println(obj.a);
		}
		
		catch(NullPointerException n) {
			System.out.println("Exception occured");
			n.printStackTrace();
			System.out.println(n.getMessage());
		}
		
		catch(ArithmeticException a) {
			System.out.println("other Exception occured");
			a.printStackTrace();
			System.out.println(a.getMessage());
		}
		System.out.println("Hellooooooo");

	}

}
