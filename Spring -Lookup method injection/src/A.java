
public class A {
	public A() {
		System.out.println("Constractor of A");

	}

	private B dependency;

	public B getDependency() {
		return dependency;
	}

	public void setDependency(B dependency) {
		this.dependency = dependency;
	}
}
