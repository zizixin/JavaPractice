package zizixin.JavaPractice.designPattern.filterPattern;

import java.util.List;

@Deprecated
public class FemaleMaleOrMaterialStatusNoCriterion implements PersonCriterion{

	@Override
	public List<Person> critertion(List<Person> sources) {
		
		List<Person> personMales = new FemalePersonCriterion().critertion(sources);
		
		List<Person> personMaritalStatusNos = new MaritalStatusNoCriterion().critertion(sources);
		
		
		 for (Person person : personMales) {
	         if(!personMaritalStatusNos.contains(person)){
	        	 personMaritalStatusNos.add(person);
	         }
	      }	
		
		return personMaritalStatusNos;
	}

}
