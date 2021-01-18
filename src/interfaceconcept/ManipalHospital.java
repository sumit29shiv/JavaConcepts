package interfaceconcept;

public class ManipalHospital extends ManipalTrust implements USHealthDep, IndiaHealthDep, UKHealthDep {

	
	@Override
	public void orthoService() {
		System.out.println("Manipal Ortho Serive");
		
	}

	@Override
	public void heartService() {
		System.out.println("Manipal Heart Service");
		
	}

	@Override
	public void gynoService() {
		System.out.println("Manipal Gyno Service");
		
	}

	@Override
	public void kneeService() {
		System.out.println("Manipal Knee Service");
		
	}

	@Override
	public void caridoServie() {
		System.out.println("Manipal Cardio Service.");
		
	}

	@Override
	public void PhysicoTherepy() {
		System.out.println("Manipal Physiso service");
		
	}

	@Override
	public void migranService() {
		System.out.println("Manipal Migran Service");
		
	}
	public void childCareService() {
		
		System.out.println("Manipal Child care Service");
	}

	@Override
	public void covid19Test() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void covidGuidelines() {
		// TODO Auto-generated method stub
		
	}

	
}
