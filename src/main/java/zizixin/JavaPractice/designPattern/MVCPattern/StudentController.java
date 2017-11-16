package zizixin.JavaPractice.designPattern.MVCPattern;

public class StudentController implements Controller{

	public StudentModel studentModel;
	
	public StudentView studentView;
	
//	public void updateView(){
//		this.studentView.pirnt(this.studentModel);
//	}

	public void updateView(){
		this.studentView.pirnt(this.studentModel.getName(), this.studentModel.getAge());
	}
	
	public void setStudentName(String name){
		this.studentModel.setName(name);
	}

	public void setStudentAge(String age){
		this.studentModel.setAge(age);
	}
	
	public StudentController(Model model,StudentView view) throws Exception{
		vaild(model,view);
		this.studentModel = (StudentModel) model;
		this.studentView = view;
	}
	
	private void vaild(Model model,View view) throws Exception{
		
	}
}
