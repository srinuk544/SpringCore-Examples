
public class College {
	private String collegeName;
	private Student st;

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public College(Student st) {
		this.st=st;
		
	}

	public void show() {
		System.out.println("College name:" + collegeName);
		System.out.println("Student name:" + st.getStuname() + "------" + "Student Roll:" + st.getRoll());
	}

}
