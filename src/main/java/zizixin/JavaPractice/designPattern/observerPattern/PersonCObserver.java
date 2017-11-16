package zizixin.JavaPractice.designPattern.observerPattern;

public class PersonCObserver extends Observer{

	public PersonCObserver(Subject subject){
		this.subject = subject;
		this.subject.observers.add(this);
	}
	
	@Override
	public void update() {
		System.out.println("i am personC"+this.subject.getState());
	}
}
