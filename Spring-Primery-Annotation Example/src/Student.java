
public class Student {
	String name;
	String address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void show() {
		System.out.println("Student name:" + name + "---" + "Student Address:" + address);
	}

}
