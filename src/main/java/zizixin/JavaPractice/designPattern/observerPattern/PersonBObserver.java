package zizixin.JavaPractice.designPattern.observerPattern;

public class PersonBObserver extends Observer{

	public PersonBObserver(Subject subject){
		this.subject = subject;
		this.subject.observers.add(this);
	}
	
	@Override
	public void update() {
		System.out.println("i am personB"+this.subject.getState());
	}

}
