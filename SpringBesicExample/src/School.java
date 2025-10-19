
public class School {
	String schoolname;
	String schooladdress;
	int schoolid;

	public String getSchoolname() {
		return schoolname;
	}

	public void setSchoolname(String schoolname) {
		this.schoolname = schoolname;
	}

	public String getSchooladdress() {
		return schooladdress;
	}

	public void setSchooladdress(String schooladdress) {
		this.schooladdress = schooladdress;
	}

	public int getSchoolid() {
		return schoolid;
	}

	public void setSchoolid(int schoolid) {
		this.schoolid = schoolid;
	}

	public void show() {
		System.out.println("name of the school:" + schoolname + "-------" + "Address of the school :" + schooladdress+ "school id :" + schoolid);
	}

}
