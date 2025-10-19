import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Employee {
	private Map data;

	public void setData(Map data) {
		this.data = data;
	}
	public void show() {
		System.out.println("Show the Employee Data:"+data);
		
		System.out.println("After iterartionnn:");
		Set s=data.entrySet();
		Iterator itr=s.iterator();
		while (itr.hasNext()) {
			 Map.Entry me = (Map.Entry)itr.next();
			   System.out.println(me.getKey()+ " - "+me.getValue());
			
		}
	}

}
