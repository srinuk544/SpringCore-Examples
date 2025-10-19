import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class School {
	private String schoolname;
	private Map studentdata;

	public String getSchoolname() {
		return schoolname;
	}

	public void setSchoolname(String schoolname) {
		this.schoolname = schoolname;
	}

	public Map getStudentdata() {
		return studentdata;
	}

	public void setStudentdata(Map studentdata) {
		this.studentdata = studentdata;
	}

	public void show() {
		Set s = studentdata.entrySet();
		Iterator itr = s.iterator();
		while (itr.hasNext()) {
			Map.Entry me = (Map.Entry) itr.next();
			System.out.println(me.getKey() + " - " + me.getValue());
		}

		System.out.println("school name" + schoolname);

	}
}