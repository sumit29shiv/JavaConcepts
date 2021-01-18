package constructerConcept;

public class Employee {
	
	String name;
	int age;
	int empId;
	int sal;
	boolean isPermanent;
	char gender;
	
	//Constructer of the class
	public Employee() {
		
		System.out.println("No param Constructor");
		
	}
	
	public Employee(String name) {
		System.out.println("1 param consturctor "+name);
	}
	
	public static void main(String[] a ) {
		System.out.println("Hello");
		
		Employee e1 = new Employee();
		Employee e2 = new Employee("Sumit");
	}
	

}
