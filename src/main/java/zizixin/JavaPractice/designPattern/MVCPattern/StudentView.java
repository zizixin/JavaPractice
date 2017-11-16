package zizixin.JavaPractice.designPattern.MVCPattern;

public class StudentView implements View{
	

	public void pirnt(String studentName,String studentAge) {
		
		System.out.println("studentName"+studentName);
		
		System.out.println("studentAge"+studentAge);
		
	}

	/* (non-Javadoc)
	 * @see zizixin.JavaPractice.designPattern.MVCPattern.View#pirnt(zizixin.JavaPractice.designPattern.MVCPattern.Model)
	 * view should not contain model instance in view
	 */
	@Override
	public void pirnt(Model model) {
		System.out.println(model.toString());
	}

	
	
}
