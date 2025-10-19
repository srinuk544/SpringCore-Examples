
public class Car implements Vechile {

	private String carname;

	public String getCarname() {
		return carname;
	}

	public void setCarname(String carname) {
		this.carname = carname;
	}

	public int getFueltype() {
		return fueltype;
	}

	public void setFueltype(int fueltype) {
		this.fueltype = fueltype;
	}

	private int fueltype;

	@Override
	public void Move() {
		// TODO Auto-generated method stub
		System.out.println("Fuel type:" + fueltype);
		System.out.println("Ca name:" + carname);

		System.out.println("Car has been started");

	}

}
