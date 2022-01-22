package prob04;

public class Depart extends Employee {

	private String dept;

	public Depart(String name, int salary, String dept) {
		super(name, salary);
		this.dept = dept;
	}

	@Override
	public void getInformation() {
		super.getInformation();
		System.out.print("  부서: "+ this.dept);
	}


}
