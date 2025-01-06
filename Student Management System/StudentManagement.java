package jan_06.studentManagementSystem;

import java.util.*;

public class StudentManagement {

	private Set<String> students = new HashSet<>();

	public void addStudent(String name) {
		boolean st = students.add(name);
		if (st) {

//			System.out.println("Student added: "+name);
			System.out.println(name + " added successfully.");
		} else {
			System.out.println(name + " already exists.");
		}

	}

	public void removeStudent(String name) {
		boolean st = students.contains(name);
		if (st) {
			students.remove(name);
			System.out.println(name + " removed successfully.");
		} else {
			System.out.println(name + " student was not found");
		}
	}

	public void displayStudents() {
		if (students.isEmpty()) {
			System.out.println("No Student to display.");
		} else {
			System.out.println("Students in the system: ");
			students.forEach(System.out::println);
		}
	}

	public static void main(String[] args) {

		System.out.println(".................Welcome to student management system...............");
		StudentManagement obj = new StudentManagement();
		Scanner sc = new Scanner(System.in);
		int choice;

		while (true) {
			System.out.println(
					"\n" + "1. Add a Student\r\n" + "2. Remove a Student\r\n" + "3. Display Students\r\n" + "4. Exit");

			System.out.print("Enter your choice: ");
			try {
				choice = sc.nextInt();
			} catch (InputMismatchException e) {
				System.err.println("Error.... Please enter a valid number");
				sc.next();
				continue;
			}

//			if (obj == null || choice == 0) {
//				System.err.println("Error.... Error Object is null");
//			}
//			else if (choice <= 0 || choice >= 5) {
//				System.err.println("Error.... Invalid choice");
//			}else {
			switch (choice) {
			case 1:
				System.out.print("Enter student name: ");
				sc.nextLine();
				String name = sc.nextLine().trim().toLowerCase(); 
				obj.addStudent(name);
				break;

			case 2:
				System.out.print("Enter student name: ");
				sc.nextLine();
				name = sc.nextLine().trim().toLowerCase(); 
				obj.removeStudent(name);
				break;
				
			case 3:
				obj.displayStudents();
				break;

			case 4:
				System.out.println("Exiting... Goodbye!");
				sc.close();
				return;

			default:
				System.err.println("Error.... Invalid choice");
				break;
//				}
			}
		}
	}
}
