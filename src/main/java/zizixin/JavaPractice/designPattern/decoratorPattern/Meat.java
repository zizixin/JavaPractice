package zizixin.JavaPractice.designPattern.decoratorPattern;

/**
 * @author zizixin
 * 
 */
public class Meat extends Decorator{

	public Meat(Ingredient ingredient) {
		super(ingredient);
	}
	
	@Override
	public String getDescription() {
		return super.ingredient.getDescription()+"decorator with meat";
	}

	@Override
	public float getCost(){
		return super.ingredient.getCost()+(float)1.0;
	}

}
