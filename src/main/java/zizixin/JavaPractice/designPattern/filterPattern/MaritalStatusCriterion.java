package zizixin.JavaPractice.designPattern.filterPattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MaritalStatusCriterion implements Criterion<Person>{

	@Override
	public List<Person> critertion(List<Person> sources) {
		List<Person> targets = new ArrayList<>();
		Iterator<Person> sourcesIterator = sources.iterator();
		Person temp;
		while(sourcesIterator.hasNext()){
			if((temp = sourcesIterator.next()).getMaritalStatus().equals(MaritalStatus.marrige))targets.add(temp);
		}
		return targets;
	}

}
