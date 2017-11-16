package zizixin.JavaPractice.designPattern.filterPattern;

import java.util.ArrayList;
import java.util.List;

import zizixin.JavaPractice.designPattern.Demo;

public class FilterPatternDemo implements Demo{

	@Override
	public void show() throws Exception {
		List<Person> persons = new ArrayList<Person>();
		persons.add(new Person("Robert",Gender.MALE, MaritalStatus.nomarige));
		persons.add(new Person("John",Gender.MALE, MaritalStatus.marrige));
		persons.add(new Person("Laura",Gender.FEMALE, MaritalStatus.marrige));
		persons.add(new Person("Diana",Gender.FEMALE, MaritalStatus.nomarige));
		persons.add(new Person("Mike",Gender.MALE, MaritalStatus.nomarige));
		persons.add(new Person("Bobby",Gender.MALE, MaritalStatus.nomarige));
		
		PersonCriterion male = new MalePersonCriterion();
		PersonCriterion female = new FemalePersonCriterion();
		PersonCriterion single = new MaritalStatusNoCriterion();
	    PersonCriterion singleMale = (PersonCriterion) new AndCriterion(single, male);
		PersonCriterion singleOrFemale = (PersonCriterion) new OrCriterion(single, female);
		  
		
		System.out.println("male criterion：");
		printList(male.critertion(persons));
		
		System.out.println("female criterion" );
		printList(female.critertion(persons));
		
		System.out.println("single criterion");
		printList(single.critertion(persons));
		
		System.out.println("singleMale criterion");
		printList(singleMale.critertion(persons));
		
		System.out.println("singleOrFemale criterion");
		printList(singleOrFemale.critertion(persons));
	}

	public static void main(String[] args) {
		try {
			new FilterPatternDemo().show();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static <T> void printList(List<T> lists){
		for(T t:lists){
			System.out.println(t);
		}
	}
}
