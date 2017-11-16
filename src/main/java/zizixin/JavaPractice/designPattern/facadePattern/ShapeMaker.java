package zizixin.JavaPractice.designPattern.facadePattern;

/**
 * @author zizixin
 * 工程模式是返回对象，这个直接执行对象的相应功能
 */
public class ShapeMaker {

	private Circle circle;
	
	private Rectangle rectangle;
	
	private Square square;
	
	public ShapeMaker(){
		
		this.circle = new Circle();
		
		this.rectangle = new Rectangle();
		
		this.square = new Square();
	}
	
	public void drawCircle(){
		this.circle.draw();
	}
	
	public void drawRectangle(){
		this.rectangle.draw();
	}
	
	public void drawSquare(){
		this.square.draw();
	}
	
}
