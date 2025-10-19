
public class Country {
 private String name;
 private String capital;

 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }

 public String getCapital() {
  return capital;
 }

 public void setCapital(String capital) {
  this.capital = capital;
 }

 @Override
 public String toString() {
  StringBuilder builder = new StringBuilder();
  builder.append("Country [name=").append(name).append(", capital=").append(capital).append("]");
  return builder.toString();
 }

 @Override
 public int hashCode() {
  final int prime = 31;
  int result = 1;
  result = prime * result + ((capital == null) ? 0 : capital.hashCode());
  result = prime * result + ((name == null) ? 0 : name.hashCode());
  return result;
 }

 @Override
 public boolean equals(Object obj) {
  if (this == obj)
   return true;
  if (obj == null)
   return false;
  if (getClass() != obj.getClass())
   return false;
  Country other = (Country) obj;
  if (capital == null) {
   if (other.capital != null)
    return false;
  } else if (!capital.equals(other.capital))
   return false;
  if (name == null) {
   if (other.name != null)
    return false;
  } else if (!name.equals(other.name))
   return false;
  return true;
 }

}