package zizixin.JavaPractice.designPattern.flyweightPattern;

import zizixin.JavaPractice.designPattern.Demo;

public class FlyWeightPatternDemo implements Demo{

	public static int number=20;
	
	public static final String[] colors = {"red","green","yellow","white","black"};
	
	/**
	 * @return
	 *note Math.random 产生的是一个0-1 的double的随机数
	 */
	public static String getColor(){
		return colors[(int) (Math.random()*colors.length)];
	}
	
	public static void main(String[] args) {
		try {
			new FlyWeightPatternDemo().show();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void show() throws Exception {
		for(int i=0;i<FlyWeightPatternDemo.number;i++){
			Circle shape = (Circle) ShapeFactory.getShape(getColor());
			shape.draw();
			shape.setX((int) (Math.random()*100));
			shape.setY((int) (Math.random()*100));
			shape.setRadius((int) (Math.random()*100));
		}
	}

}
