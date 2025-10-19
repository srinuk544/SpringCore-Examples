
public class Author implements LifeCycleService {
	private String firstName;
	private String lastName;
	private String dateOfBirth;
	private String country;

	public Author() {
		System.out.println("Author Constructor called");
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Author [firstName=").append(firstName).append(", lastName=").append(lastName)
				.append(", dateOfBirth=").append(dateOfBirth).append(", country=").append(country).append("]");
		return builder.toString();
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		System.out.println(this + " is initialized");
	}

	@Override
	public void distroy() {
		// TODO Auto-generated method stub
		System.out.println(this + " is about to destroy");
	}
}