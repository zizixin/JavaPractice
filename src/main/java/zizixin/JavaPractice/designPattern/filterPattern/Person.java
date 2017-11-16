package zizixin.JavaPractice.designPattern.filterPattern;

public class Person {

	private String name;
	
	private Gender gender;
	
	private MaritalStatus maritalStatus;
	
	public Person(String name,Gender gender,MaritalStatus maritalStatus){
		this.setName(name);
		this.setGender(gender);
		this.setMaritalStatus(maritalStatus);
	}

	@Override
	public String toString() {
		return "name "+ this.name + " gender "+ this.gender + " maritalStatus "+ this.maritalStatus;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public MaritalStatus getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(MaritalStatus maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	
}
