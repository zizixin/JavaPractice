package zizixin.JavaPractice.designPattern.decoratorPattern;

import zizixin.JavaPractice.designPattern.Demo;

/**
 * @author zizixin
 *
 * 装饰器模式是动态生成具有继承的效果的一种模式
 */
public class DecoratorPatternDemo implements Demo{

	@Override
	public void show() throws Exception {
		Bread baseBread = new Bread("i am base Bread");
		
		Ingredient finalMeal = new Veg(new Meat(baseBread));
		
		System.out.println(finalMeal.getDescription());
		
		System.out.println(finalMeal.getCost());
		
	}
	
	public static void main(String[] args) {
		try {
			new DecoratorPatternDemo().show();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
