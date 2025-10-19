
public class Bus implements Vechile {

	private String speed;

	public String getSpeed() {
		return speed;
	}

	public void setSpeed(String speed) {
		this.speed = speed;
	}

	@Override
	public void Move() {
		// TODO Auto-generated method stub

		System.out.println("Speed of the Bus:" + speed);
		System.out.println("Bus Has been staeted");

	}

}
