package entities;

public class Teacher extends OrganizationalUnit {
	private final String subject;
	private final double salary;

	public Teacher(String name, String subject, double salary) {
		super(name);
		this.subject = subject;
		this.salary = salary;
	}

	@Override
	public double getBudget() {
		return salary;
	}

	@Override
	public int getStudentCount() {
		return 0;
	}

	@Override
	public void displayDetails() {
		System.out.println("    Teacher: " + name + ", Subject: " + subject + ", Salary: " + salary);
	}
}
