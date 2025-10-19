
public class ParentBean {
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

 @Override
 public String toString() {
  StringBuilder builder = new StringBuilder();
  builder.append("ParentBean [name=").append(name).append(", version=").append(version).append("]");
  return builder.toString();
 }

}