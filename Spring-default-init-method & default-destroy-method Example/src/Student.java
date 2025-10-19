
public class Student implements LifeCycleService {
	private String name;
	 public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}

	private int id;


	 public Student(){
	  System.out.println("Student constructor called");
	 }
	 
	 
	
	@Override
	public void init() {
		// TODO Auto-generated method stub
		System.out.println(this + " is initialized");
	}

	@Override
	public void distroy() {
		// TODO Auto-generated method stub
		 System.out.println(this + " is about to destroy");
	}

	 @Override
	 public String toString() {
	  StringBuilder builder = new StringBuilder();
	  builder.append("Student [name=").append(name).append(", id=").append(id).append("]");
	  return builder.toString();
	 }

}
