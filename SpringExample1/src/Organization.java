
public class Organization {
	private String companeyName;
	private String Address;

	public String getCompaneyName() {
		return companeyName;
	}

	public void setCompaneyName(String companeyName) {
		this.companeyName = companeyName;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	Organization(Employee e){
		this.e=e;
		
		
	}

	private Employee e;

	public void Display() {
		System.out.println("Comany name:" + companeyName + "---" + "Compney address:" + Address);

		System.out.println("Company name:" + e.getName() + "--" + "Company address:" + e.getSalary());
	}

}
