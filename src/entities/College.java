package entities;

import java.util.ArrayList;
import java.util.List;

public class College extends OrganizationalUnit {
	private final List<OrganizationalUnit> units = new ArrayList<>();

	public College(String name) {
		super(name);
	}

	@Override
	public double getBudget() {
		return units.stream().mapToDouble(OrganizationalUnit::getBudget).sum();
	}

	@Override
	public int getStudentCount() {
		return units.stream().mapToInt(OrganizationalUnit::getStudentCount).sum();
	}

	@Override
	public void displayDetails() {
		System.out.println("College: " + name);
		units.forEach(OrganizationalUnit::displayDetails);
	}

	@Override
	public void add(OrganizationalUnit unit) {
		units.add(unit);
	}

	@Override
	public void remove(OrganizationalUnit unit) {
		units.remove(unit);
	}
}
