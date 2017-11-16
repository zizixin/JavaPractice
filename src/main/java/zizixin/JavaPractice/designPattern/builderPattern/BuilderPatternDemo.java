package zizixin.JavaPractice.designPattern.builderPattern;

import zizixin.JavaPractice.designPattern.Demo;

/**
 * @author zizixin
 * 
 */
public class BuilderPatternDemo implements Demo{

	private static BuilderPatternDemo instance = new BuilderPatternDemo();
	
	public static BuilderPatternDemo getInstance(){
		return BuilderPatternDemo.instance;
	}
	
	private BuilderPatternDemo(){
		super();
	}
	
	@Override
	public void show() throws Exception {
		System.out.println("builderPattern demo begain");
		
		Meal mealOne = MealBuilder.preperVegMeal();
		mealOne.showIems();
		System.out.println(mealOne.getCost());
		
		Meal mealTwo = MealBuilder.preperNoVegMeal();
		mealTwo.showIems();
		System.out.println(mealTwo.getCost());
		
		System.out.println("builderPattern demo end!!!");
	}

}
