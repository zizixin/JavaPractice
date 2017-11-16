package zizixin.JavaPractice.designPattern.commandPattern;

public class SellSomething implements Order{

	public Something something;
	
	public SellSomething(Something someting){
		this.something = someting;
	}
	
	@Override
	public void excute() {
		this.something.sell();
	}

}
