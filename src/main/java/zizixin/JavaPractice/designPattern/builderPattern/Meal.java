package zizixin.JavaPractice.designPattern.builderPattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Meal {

	public List<Item> items = new ArrayList<Item>();
	
	public void addItem(Item item){
		this.items.add(item);
	}
	
	public void showIems(){
		Iterator<Item> iterator = items.iterator();
		while(iterator.hasNext()){
			Item item = iterator.next();
			System.out.println("name: "+item.getName()+" packing: "+item.getPacking().pack()+" price: "+item.getPrice());
		}
	}
	
	public Float getCost(){
		Float cost = (float) 0.0;
		Iterator<Item> iterator = items.iterator();
		while(iterator.hasNext()){
			cost = iterator.next().getPrice() + cost;
		}
		return cost;
	}
	
}
