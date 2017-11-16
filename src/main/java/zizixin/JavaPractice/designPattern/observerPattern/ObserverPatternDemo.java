package zizixin.JavaPractice.designPattern.observerPattern;

import zizixin.JavaPractice.designPattern.Demo;

public class ObserverPatternDemo implements Demo{

	@Override
	public void show() throws Exception {
		Subject subject = new Subject();
		PersonAObserver personAObserver = new PersonAObserver(subject);
		PersonBObserver personBObserver = new PersonBObserver(subject);
		PersonCObserver personCObserver = new PersonCObserver(subject);
		subject.setState(1);
		subject.setState(2);
		subject.setState(3);
	}

	public static void main(String[] args) {
		try {
			new ObserverPatternDemo().show();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
