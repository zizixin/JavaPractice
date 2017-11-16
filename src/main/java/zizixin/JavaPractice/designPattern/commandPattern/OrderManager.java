package zizixin.JavaPractice.designPattern.commandPattern;

import java.util.ArrayList;
import java.util.List;

public class OrderManager {

	public List<Order> orders = new ArrayList<>();
	
	public void takeOrder(Order order){
		this.orders.add(order);
	}
	
	public void placeOrder(){
		for(Order order:this.orders){
			order.excute();
		}
		this.orders.clear();
	}
}
