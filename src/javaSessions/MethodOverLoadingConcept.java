package javaSessions;

public class MethodOverLoadingConcept {

	public static void main(String[] a) {
		
		MethodOverLoadingConcept o = new MethodOverLoadingConcept();
//		o.test();
//		o.test(2);
//		o.test("Hello");
//		o.test(2,3);
		o.signUp();
		

	}
	
	// Below are non static overloaded method
	public void test() {
		System.out.println("Hello");
		
	}
	
	public void test(int a) {
		System.out.println(a);
	}
	
	public void test(int a, int b) {
		System.out.println(a+b);
	}
	
	public void test(String a) {
		System.out.println(a);
	}
	

	// any non static method/static method can be called in to another non static method directly becoz
	// they r part of same obj 
	public void signUp() {
		System.out.println("Sign up");
		login();
		hello();
	}
	
	public void login() {
		System.out.println("Login");
		
	}
	
	public void addToCart() {
		System.out.println("Add to cart");
		
	}
	
	public void purchase() {
		System.out.println("Purchase");
		
	}
	
	// non static method can not be called directly inside static method 
	// to call it we need to create obj referance
	public static void hello() {
		MethodOverLoadingConcept o = new MethodOverLoadingConcept();
		o.addToCart();
		System.out.println("Hello static");
		
	}
}
