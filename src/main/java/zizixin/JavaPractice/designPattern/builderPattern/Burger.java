package zizixin.JavaPractice.designPattern.builderPattern;

public abstract class Burger implements Item{

	@Override
	public Packing getPacking() {
		return new Wrapper();
	} 
	
}
