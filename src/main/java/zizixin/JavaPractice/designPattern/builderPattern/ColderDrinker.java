package zizixin.JavaPractice.designPattern.builderPattern;

public abstract class ColderDrinker implements Item{

	@Override
	public Packing getPacking() {
		return new Bottle();
	}
}
