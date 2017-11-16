package zizixin.JavaPractice.designPattern.commandPattern;

public class BuySomething implements Order{
	
	public Something something;

	public BuySomething(Something something){
		this.something = something;
	}
	
	@Override
	public void excute() {
		this.something.buy();
	}

}
