
public class Product {
	String pname;
	String paddress;
	int pnumber;

	public Product(String pname, String paddress, int pnumber) {
		this.paddress = paddress;
		this.pname = pname;
		this.pnumber = pnumber;

	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPaddress() {
		return paddress;
	}

	public void setPaddress(String paddress) {
		this.paddress = paddress;
	}

	public int getPnumber() {
		return pnumber;
	}

	public void setPnumber(int pnumber) {
		this.pnumber = pnumber;
	}

	public void display() {
		System.out.println("Product name:" + pname + "---" + "Product address:" + "---" + "Product number:" + pnumber);
	}

}
