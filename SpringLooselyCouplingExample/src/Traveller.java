
public class Traveller implements Journey {
	private Vechile v;

	public void setV(Vechile v) {
		this.v = v;
	}

	@Override
	public void Startjourney() {
		// TODO Auto-generated method stub
		System.out.println("Journey has been started");
		v.Move();

	}

}
