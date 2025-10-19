
public class University {
	private String universityname;

	private College clg;

	public String getUniversityname() {
		return universityname;
	}

	public void setUniversityname(String universityname) {
		this.universityname = universityname;
	}

	public College getClg() {
		return clg;
	}

	public void setClg(College clg) {
		this.clg = clg;
	}

	public void show() {
		System.out.println("University name:" + universityname);
		System.out.println("College name:" + clg.getClgname() + "------" + "College Address:" + clg.getClgaddress());
	}

}
