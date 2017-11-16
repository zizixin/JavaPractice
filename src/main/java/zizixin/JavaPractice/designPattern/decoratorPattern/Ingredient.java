package zizixin.JavaPractice.designPattern.decoratorPattern;

/**
 * @author zizixin
 * 装饰器模式的关键是抽象出来这个类
 */
public abstract class Ingredient{

	public abstract String getDescription();
	
	public abstract float getCost();
	
	public void print(){
		System.out.println("description: "+this.getDescription());
		
		System.out.println("cost: "+this.getCost());
	}
	
}
