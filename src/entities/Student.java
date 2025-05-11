package entities;

public class Student extends OrganizationalUnit {
	private final String studentId;
	private final double tuitionFee;

	public Student(String name, String studentId, double tuitionFee) {
		super(name);
		this.studentId = studentId;
		this.tuitionFee = tuitionFee;
	}

	@Override
	public double getBudget() {
		return -tuitionFee;
	}

	@Override
	public int getStudentCount() {
		return 1;
	}

	@Override
	public void displayDetails() {
		System.out.println("    Student: " + name + ", Student ID: " + studentId + ", Tuition Fee: " + tuitionFee);
	}
}
