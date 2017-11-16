package zizixin.JavaPractice.designPattern.MVCPattern;

import zizixin.JavaPractice.designPattern.Demo;

public class MVCPatternDemo implements Demo{

	@Override
	public void show() throws Exception {
		StudentModel model = new StudentModel();
		
		model.setName("personA");
		
		StudentView studentView =new StudentView();
		
		StudentController studentController = new StudentController(model, studentView);
		
		studentController.updateView();
		
		model.setName("personB");
		
		studentController.updateView();
	}

	public static void main(String[] args) {
		try {
			
			new MVCPatternDemo().show();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
