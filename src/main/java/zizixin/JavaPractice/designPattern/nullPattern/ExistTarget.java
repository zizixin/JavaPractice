package zizixin.JavaPractice.designPattern.nullPattern;

public class ExistTarget extends Target{

	public String name;
	
	public ExistTarget(String name){
		this.name = name;
	}
	
	@Override
	public Boolean isNull() {
		return false;
	}

	@Override
	public String getName() {
		return this.name;
	}

	
}
