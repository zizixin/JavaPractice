package zizixin.JavaPractice.designPattern.observerPattern;

public class PersonAObserver extends Observer{

	public PersonAObserver(Subject subject) {
		this.subject = subject;
		this.subject.addObserver(this);
	}
	
	
	@Override
	public void update() {
		System.out.println("i am personA"+this.subject.getState());
	}

}
