package zizixin.JavaPractice.designPattern.compositePattern;

import zizixin.JavaPractice.designPattern.Demo;

public class CompositePatternDemo implements Demo{

	@Override
	public void show() throws Exception {
		Employer ceo = new Employer("namea","ceo");
		
		Employer passerbyA = new Employer("nameb","passerby");
		
		Employer passerbyB = new Employer("namec","passerby");
		
		ceo.getEmployers().add(passerbyA);
		ceo.getEmployers().add(passerbyB);
		
		for(Employer employer:ceo.getEmployers()){
			System.out.println(ceo.getName()+ " manger "+employer.getName());
		}
	}

	public static void main(String[] args) {
		try {
			new CompositePatternDemo().show();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
