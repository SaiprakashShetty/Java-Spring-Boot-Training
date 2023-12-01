
public class StudentController {
	//Model Object
	//Model View
	private Student model;
	private StudentView view;
	
	public StudentController (Student model, StudentView view) {
		this.model = model;
		this.view = view; 
	}
	
	//to control model objects
	public void setStudentName (String name) {
		model.setName(name);
	}
	public void setStudentRollNum(String rollNo) {
		model.setRollNo(rollNo);
	}
	
	public String getStudentRollNum() {
		return model.getRollNo(); 
	} 
	public String getStudentName() { 
		return model.getName(); 
	} 
	//control view object 
	public void updateView() { 
		view.printStudentDetails(model.getName(), model.getRollNo());
	}
}
