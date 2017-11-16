package zizixin.JavaPractice.designPattern.commandPattern;

import zizixin.JavaPractice.designPattern.Demo;

public class commandPatternDemo implements Demo{

	@Override
	public void show() throws Exception {
		
		Something cellPhone = new Something("cellPhone");
		OrderManager instance = new OrderManager();
		instance.takeOrder(new BuySomething(cellPhone));
		instance.takeOrder(new SellSomething(cellPhone));
		instance.placeOrder();
		
	}

	
	public static void main(String[] args) {
		try {
			new commandPatternDemo().show();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
