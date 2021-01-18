package encapsulationConcept;

public class EmployeeMain {

public static void main(String a[]) {
		
		Employee e1 = new Employee();
		
		// inside same class does not matter var or method is private or public
		// can be accessed anywhere in the class
		e1.setEname("Sumit");
		e1.setEsal(11.5);
		e1.setAge(23);
		e1.setPermanent(true);
		
		System.out.println("Employee name: "+e1.getEname());
		System.out.println("Employee Salary: "+e1.getEsal());
		System.out.println("Employee Age: "+e1.getAge());
		System.out.println("Employee is permanent: "+e1.isPermanent());
		
		Company c1 = new Company();
		c1.setCname("DELL EMC");
		System.out.println(c1.getCname());
		c1.getPolicyInfo();
		
	
		
	}
}
