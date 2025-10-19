
public class Books {

	private String name;
	private String author;
	private int price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void show() {
		System.out.println("Book name:" + name + "-----" + "Book author:" + author + "-------" + "Book Price:" + price);
	}
}
