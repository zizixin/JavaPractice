package zizixin.JavaPractice.designPattern.mementoPattern;

import zizixin.JavaPractice.designPattern.Demo;

public class MementoPatternDemo implements Demo{

	@Override
	public void show() throws Exception {
		Original original = new Original("state originl");
		
		CareTaker careTaker = new CareTaker();
		
		original.setState("state one");
		
		original.setState("statue two");
		
		careTaker.add(original.saveStateToMemento());
		
		original.setState("state three");
		
		original.setState("state four");
		
		careTaker.add(original.saveStateToMemento());
		
		original.setState("state five");
		
		System.out.println("new status"+original.getState());
		
		System.out.println("stash one status"+careTaker.get(0).getState());
		
		System.out.println("stash two status"+careTaker.get(1).getState());
	}

	public static void main(String[] args) {
		try {
			new MementoPatternDemo().show();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
