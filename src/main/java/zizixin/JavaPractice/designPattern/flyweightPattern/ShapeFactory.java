package zizixin.JavaPractice.designPattern.flyweightPattern;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {

	public static final Map<String,Shape> flyWeightMap = new HashMap<>();
	
	public static Shape getShape(String color){
		
		Shape shape = flyWeightMap.get(color);
		if(shape == null){
			shape = new Circle(color);
			System.out.println(shape);
			flyWeightMap.put(color, shape);
		}
		return shape;
	}
	
}
