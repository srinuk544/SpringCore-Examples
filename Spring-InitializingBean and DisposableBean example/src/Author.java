import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Author implements InitializingBean, DisposableBean {

	private String firstName;
	private String lastName;

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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	private String country;
	private String dateOfBirth;

	public Author() {
		System.out.println("Is a Author Constractorrr");
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Author [firstName=").append(firstName).append(", lastName=").append(lastName)
				.append(", dateOfBirth=").append(dateOfBirth).append(", country=").append(country).append("]");
		return builder.toString();
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("\n**************************");
		System.out.println("Destroying bean " + this);
		System.out.println("**************************");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("\n**************************");
		System.out.println("Following properties are set to author bean");
		System.out.println("firstName : " + firstName);
		System.out.println("lastName : " + lastName);
		System.out.println("dateOfBirth : " + dateOfBirth);
		System.out.println("country : " + country);
		System.out.println("**************************\n");
	}

}
