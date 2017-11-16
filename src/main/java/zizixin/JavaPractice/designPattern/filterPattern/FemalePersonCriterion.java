package zizixin.JavaPractice.designPattern.filterPattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FemalePersonCriterion implements PersonCriterion{

	@Override
	public List<Person> critertion(List<Person> sources) {
		List<Person> targets = new ArrayList<>();
		Iterator<Person> sourcesIterator = sources.iterator();
		Person temp;
		while(sourcesIterator.hasNext()){
			if((temp = sourcesIterator.next()).getGender().equals(Gender.FEMALE))targets.add(temp);
			
		}
		return targets;
	}

}
