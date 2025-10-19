
public class ChildBean {
 private String releasedDate;
 private String author;
 private String name;
 private String version;

 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }

 public String getVersion() {
  return version;
 }

 public void setVersion(String version) {
  this.version = version;
 }

 public String getReleasedDate() {
  return releasedDate;
 }

 public void setReleasedDate(String releasedDate) {
  this.releasedDate = releasedDate;
 }

 public String getAuthor() {
  return author;
 }

 public void setAuthor(String author) {
  this.author = author;
 }

 @Override
 public String toString() {
  StringBuilder builder = new StringBuilder();
  builder.append("ChildBean [releasedDate=").append(releasedDate).append(", author=").append(author)
    .append(", name=").append(name).append(", version=").append(version).append("]");
  return builder.toString();
 }

}