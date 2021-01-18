package exceptionHandling;

public class TryCatchBlock {

	public static void main(String[] args) {
		
		System.out.println("Hello..");
		System.out.println("Hello..");
		System.out.println("Hello..");
		System.out.println("Hello..");
		
		TryCatchBlock t = new TryCatchBlock();
	
		
		
		try {
			System.out.println("hello");
			int i = 9/0;
			System.out.println("Hello bhai");
		}
		
		catch(ArithmeticException e){
			
			System.out.println("Exception found..");
			//e.printStackTrace();
			System.out.println(e.getMessage());
			
		}
		
		
		System.out.println("Hello..");
		System.out.println("Hello..");
		
		try {
			t.hello();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Exception occured i");
		}
		

	}
	
	public void hello () throws Exception {
		
		System.out.println(10/0);
	}

}
