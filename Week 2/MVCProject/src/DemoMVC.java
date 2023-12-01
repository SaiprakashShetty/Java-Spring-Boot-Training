
public class DemoMVC {
	public static void main(String[] args) {
		Student model = retrieveStudentFromDatabase();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);
        
        controller.updateView();
        controller.setStudentRollNum("6868");
        controller.updateView();
        }
	
	private static Student retrieveStudentFromDatabase() {
		Student student = new Student();
		student.setName("Sam");
		student.setRollNo("5757");
		return student;
	}
}
