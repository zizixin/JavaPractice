package zizixin.JavaPractice.designPattern.observerPattern;

import java.util.ArrayList;
import java.util.List;

public class Subject {

	private int state;
	
	/**
	 * 观察者的站位符号，observer 需要注册进来
	 */
	public List<Observer> observers = new ArrayList<>();
	
	public void addObserver(Observer observer){
		this.observers.add(observer);
	}
	
	public int getState(){
		return this.state;
	}
	
	public void setState(int state){
		this.state = state;
		notifyAllObservers();
	}
	
	
	public void notifyAllObservers(){
		for(Observer observer:this.observers){
			observer.update();
		}
	}
}
