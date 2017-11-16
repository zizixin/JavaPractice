package zizixin.JavaPractice.designPattern.builderPattern;

public class ChickenBurger extends Burger{

	@Override
	public String getName() {
		return "ChickenBurger";
	}

	@Override
	public Float getPrice() {
		return (float) 1.5;
	}

}
