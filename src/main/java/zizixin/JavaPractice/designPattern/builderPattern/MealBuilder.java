package zizixin.JavaPractice.designPattern.builderPattern;

/**
 * @author zizixin
 * 建造模式不应该一次准备完全，应该会一步一步细节建造目标对象
 */
public class MealBuilder {

	/**
	 *  一次操作建造一个meal
	 */
	private Meal meal;
	
	public MealBuilder(){
		this.meal = new Meal();	
	}
	
	public static Meal preperVegMeal(){
		Meal meal = new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new CokeCola());
		return meal;
	}
	
	public static Meal preperNoVegMeal(){
		Meal meal = new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new CokeCola());
		return meal;
	}

	public static MealBuilder getOneMealBuilder(){
		return new MealBuilder();
	}
	
	

	public MealBuilder perperVegMealMoreBuilderPatternByAddItem(Item item){
		this.meal.addItem(item);
		return this;
	}
	/**
	 * there could have planty buider method
	 * 
	 * */
	
	public Meal getMeal(){
		return this.meal;
	}
}
