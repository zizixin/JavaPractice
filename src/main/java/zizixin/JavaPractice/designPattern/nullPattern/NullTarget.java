package zizixin.JavaPractice.designPattern.nullPattern;

public class NullTarget extends Target{

	@Override
	public Boolean isNull() {
		return true;
	}

	@Override
	public String getName() {
		return "this is not available in now case";
	}

}
