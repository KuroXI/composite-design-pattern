package entities;

public abstract class OrganizationalUnit {
	protected String name;

	public OrganizationalUnit(String name) {
		this.name = name;
	}

	public abstract double getBudget();
	public abstract int getStudentCount();
	public abstract void displayDetails();
	public void add(OrganizationalUnit unit) {
		throw new UnsupportedOperationException("Cannot add to this unit");
	}
	public void remove(OrganizationalUnit unit) {
		throw new UnsupportedOperationException("Cannot remove from this unit");
	}
}
