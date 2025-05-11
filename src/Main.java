import entities.College;
import entities.Department;
import entities.Student;
import entities.Teacher;

public class Main {
	public static void main(String[] args) {
		College neu = new College("New Era University");

		College collegeOfEngineering = new College("College of Engineering");
		College collegeOfBusiness = new College("College of Business");

		Department csDepartment = new Department("Department of Computer Science");
		Department itDepartment = new Department("Department of Information Technology");
		Department businessDepartment = new Department("Department of Business Administration");

		Teacher csTeacher1 = new Teacher("Alice", "Data Structures", 50000);
		Teacher csTeacher2 = new Teacher("Bob", "Algorithms", 52000);
		Teacher itTeacher1 = new Teacher("Charlie", "Networking", 48000);
		Teacher itTeacher2 = new Teacher("David", "Cybersecurity", 49000);
		Teacher businessTeacher = new Teacher("Emma", "Accounting", 53000);

		Student student1 = new Student("Eve", "CS2023001", 20000);
		Student student2 = new Student("Frank", "CS2023002", 22000);
		Student student3 = new Student("Grace", "IT2023003", 21000);
		Student student4 = new Student("Heidi", "IT2023004", 23000);
		Student student5 = new Student("Ivy", "BA2023005", 24000);
		Student student6 = new Student("Jack", "BA2023006", 25000);

		csDepartment.add(csTeacher1);
		csDepartment.add(csTeacher2);
		csDepartment.add(student1);
		csDepartment.add(student2);

		itDepartment.add(itTeacher1);
		itDepartment.add(itTeacher2);
		itDepartment.add(student3);
		itDepartment.add(student4);

		businessDepartment.add(businessTeacher);
		businessDepartment.add(student5);
		businessDepartment.add(student6);

		collegeOfEngineering.add(csDepartment);
		collegeOfEngineering.add(itDepartment);

		collegeOfBusiness.add(businessDepartment);

		neu.add(collegeOfEngineering);
		neu.add(collegeOfBusiness);

		neu.displayDetails();
		System.out.println("\nTotal Students in NEU: " + neu.getStudentCount());
		System.out.println("Total Budget of NEU: " + neu.getBudget());

		System.out.println("\nRemoving 'Department of Computer Science' from 'College of Engineering'...");
		collegeOfEngineering.remove(csDepartment);

		neu.displayDetails();
		System.out.println("\nTotal Students in NEU: " + neu.getStudentCount());
		System.out.println("Total Budget of NEU: " + neu.getBudget());
	}
}
