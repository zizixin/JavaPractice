package zizixin.JavaPractice.designPattern.filterPattern;

import java.util.List;

public class OrCriterion implements PersonCriterion {

	public PersonCriterion personCriterion;

	public PersonCriterion otherPersonCriterion;

	public OrCriterion(PersonCriterion personCriterion, PersonCriterion otherPersonCriterion) {
		this.personCriterion = personCriterion;
		this.otherPersonCriterion = otherPersonCriterion;
	}

	@Override
	public List<Person> critertion(List<Person> lists) {
		List<Person> targetLists = otherPersonCriterion.critertion(lists);
		for (Person person : personCriterion.critertion(lists)) {
			if (!targetLists.contains(person)) {
				targetLists.add(person);
			}
		}
		return targetLists;
	}

}
