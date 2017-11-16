package zizixin.JavaPractice.designPattern.decoratorPattern;

/**
 * @author zizixin
 * 一个基础的资源，不会对其他进行装饰，一般该类为装饰的起点
 */
public class Bread extends Ingredient{

	public String description;
	
	public Bread(String description){
		this.description = description;
	}
	
	@Override
	public String getDescription() {
		return this.description;
	}

	@Override
	public float getCost() {
		return 12;
	}

}
