package zizixin.JavaPractice.designPattern.decoratorPattern;

public abstract class Decorator extends Ingredient{

	/**
	 *  建立一个抽象类来包裹抽象出来的方法
	 */
	protected Ingredient ingredient;
	
	public Decorator(Ingredient ingredient){
		this.ingredient = ingredient;
	}
	
	@Override
	public String getDescription(){
		return this.ingredient.getDescription();
	}
	
	@Override
	public float getCost() {
		return this.ingredient.getCost();
	}
	
}
