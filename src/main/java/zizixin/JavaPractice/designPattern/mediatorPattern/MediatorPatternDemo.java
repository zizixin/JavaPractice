package zizixin.JavaPractice.designPattern.mediatorPattern;

import zizixin.JavaPractice.designPattern.Demo;

public class MediatorPatternDemo implements Demo{

	@Override
	public void show() throws Exception {
		User personA = new User("personA");
		User personB = new User("persobB");
		ChattingRoom chattingRoom = new ChattingRoom();
		chattingRoom.showMessage(personA, "hello");
		chattingRoom.showMessage(personB, "nice to meet you");
	}

	public static void main(String[] args) {
		try {
			new MediatorPatternDemo().show();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
