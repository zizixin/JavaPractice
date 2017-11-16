package zizixin.JavaPractice.designPattern.decoratorPattern;

public class Veg extends Decorator{

	public Veg(Ingredient ingredient) {
		super(ingredient);
	}

	@Override
	public String getDescription() {
		return super.ingredient.getDescription()+"Decorator with Veg";
	}
	
	@Override
	public float getCost(){
		return super.ingredient.getCost()+(float)1.5;
	}
	
}
