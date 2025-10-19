import java.util.Set;

public class Student {

//	private String stuaddress;
	private Set studentData;

	public void setStudentData(Set studentData) {
		this.studentData = studentData;
	}

	
	public void show() {
		System.out.println("Student Data:" + studentData);
	}
}
