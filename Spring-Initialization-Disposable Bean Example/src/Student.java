import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student implements InitializingBean,DisposableBean{

	private String name;
	private String address;
	private int roll;

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

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public Student() {
		System.out.println("consttt");
	}

	public void show() {
		System.out.println("name of the student:" + name + "---" + "Address of the student:" + address + "---"
				+ "roll number of the student:" + roll);
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		
		
		 System.out.println("\n**************************");
		  System.out.println("Following properties are set to student bean");
		  System.out.println("Name : " + name);
		  System.out.println("address : " + address);
		  System.out.println("roll : " + roll);
		 
		  System.out.println("**************************\n");
		 }

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("\n**************************");
		  System.out.println("Destroying bean " + this);
		  System.out.println("**************************");
		
	}
	
	

}
