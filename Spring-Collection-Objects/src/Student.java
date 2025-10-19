import java.util.List;

public class Student {
	private List studentname;

	public List getStudentname() {
		return studentname;
	}

	public void setStudentname(List studentname) {
		this.studentname = studentname;
	}
	
	
	public void show() {
		System.out.println("Student name:"+studentname);
	}

}
