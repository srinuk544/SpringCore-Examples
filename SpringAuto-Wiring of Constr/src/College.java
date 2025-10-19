
public class College {
	private String collegeName;
	private Student st;

	public College(String collegeName) {
		this.collegeName = collegeName;

	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public void show() {
		System.out.println("College name:" + collegeName);
		System.out.println("Student name:" + st.getStuname() + "------" + "Student Roll:" + st.getRoll());
	}

}
