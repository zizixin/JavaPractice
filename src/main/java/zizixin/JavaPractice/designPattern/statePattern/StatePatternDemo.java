package zizixin.JavaPractice.designPattern.statePattern;

import zizixin.JavaPractice.designPattern.Demo;

public class StatePatternDemo implements Demo{

	@Override
	public void show() throws Exception {
		Context context = new Context();
		State startState = new StartState();
		
		State stopState = new StopState();
		
		startState.doAction(context);
		System.out.println(context.getState().toString());
		stopState.doAction(context);
		System.out.println(context.getState().toString());
	}

	public static void main(String[] args) {
		try {
			new StatePatternDemo().show();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
