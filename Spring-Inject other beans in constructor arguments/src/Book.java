
public class Book {
 private String title;
 private int noOfPages;
 private float price;
 private Author author;

 Book(Author author, String title, int noOfPages, float price) {
  this.author = author;
  this.title = title;
  this.noOfPages = noOfPages;
  this.price = price;
 }

 public String getTitle() {
  return title;
 }

 public void setTitle(String title) {
  this.title = title;
 }

 public int getNoOfPages() {
  return noOfPages;
 }

 public void setNoOfPages(int noOfPages) {
  this.noOfPages = noOfPages;
 }

 public float getPrice() {
  return price;
 }

 public void setPrice(float price) {
  this.price = price;
 }

 public Author getAuthor() {
  return author;
 }

 public void setAuthor(Author author) {
  this.author = author;
 }

 @Override
 public String toString() {
  StringBuilder builder = new StringBuilder();
  builder.append("Book [title=").append(title).append(", noOfPages=").append(noOfPages).append(", price=")
    .append(price).append(", author=").append(author).append("]");
  return builder.toString();
 }

}