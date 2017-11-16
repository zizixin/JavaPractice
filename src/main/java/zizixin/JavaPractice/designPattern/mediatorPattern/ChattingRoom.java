package zizixin.JavaPractice.designPattern.mediatorPattern;

public class ChattingRoom implements Mediator{

	public void showMessage(User user,String message){
		System.out.println("[user:"+user.name+"]:"+message);
	}
	
}
