import org.springframework.context.Lifecycle;

public class Student implements Lifecycle {
	private String name;
	private String address;
	private int roll;

	public Student() {
		System.out.println("const");
	}

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

	public void show() {
		System.out.println("name of the student:" + name + "----" + "address of the student :" + address + "---"
				+ "roll number of the student:" + roll);
	}

	@Override
	public boolean isRunning() {
		// TODO Auto-generated method stub
		System.out.println("now is running state");
		return false;
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub

		System.out.println("now is starting ");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("now is Stop the process");
	}

}
