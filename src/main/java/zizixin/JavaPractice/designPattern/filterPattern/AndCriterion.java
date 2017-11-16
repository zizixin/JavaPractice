package zizixin.JavaPractice.designPattern.filterPattern;

import java.util.List;

public class AndCriterion implements PersonCriterion{

	public PersonCriterion personCriterion;
	
	public PersonCriterion otherPersonCriterion;
	
	public AndCriterion(PersonCriterion personCriterion,PersonCriterion otherPersonCriterion){
		this.personCriterion = personCriterion;
		this.otherPersonCriterion = otherPersonCriterion;
	}
	
	@Override
	public List<Person> critertion(List<Person> lists) {
		return this.personCriterion.critertion(this.otherPersonCriterion.critertion(lists));
	}

}
