package zizixin.JavaPractice.designPattern.filterPattern;

import java.util.List;

/**
 * @author zizixin
 * 
 */
@Deprecated
public class MaleAndMaritalStatusNoCriterion implements PersonCriterion{
	
	PersonCriterion maleCriterion;
	
	PersonCriterion maritalStatusNoCroterion;
	
	public MaleAndMaritalStatusNoCriterion(MalePersonCriterion maleCriterion,MaritalStatusNoCriterion maritalStatusNoCroterion){
		this.maleCriterion = maleCriterion;
		this.maritalStatusNoCroterion = maritalStatusNoCroterion;
	}
	@Override
	public List<Person> critertion(List<Person> sources) {
//		PersonCriterion maleCriterion = new MalePersonCriterion();
//		PersonCriterion maritalStatusNoCroterion = new MaritalStatusNoCriterion();
		return this.maritalStatusNoCroterion.critertion(this.maleCriterion.critertion(sources));
	}

	
	
}
