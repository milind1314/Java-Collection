package jan_01.employee_directory;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Directory
{
	List<Employee> employees = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	
	// addEmployees method is used to add employees in directory
	public void addEmployees(Employee emp)
	{
		employees.add(emp);
	}
	
	// displayAllEmployees method is used to displayed all the employees present in directory
	public void displayAllEmployees() 
	{
		 if (employees.isEmpty()) 
		 {
			 System.out.println("No employees to display.");
	     }
		 else
		 {
			 employees.forEach(emp -> System.out.println(emp));			 
		 }
	}

	// updateEmployee method is used to update employee based on index position
	public void updateEmployee()
	{
		int index = 0;
		try {
			System.out.print("Enter index of employee to update: ");
	        index = sc.nextInt();
		} catch (InputMismatchException e) {
			System.err.println("ERROR : Invalid Input! Input should be a positive number and not greater than size of Arraylist.");
		}
        sc.nextLine(); // Consume newline

        if (index >= 0 && index < employees.size()) {
            System.out.print("Enter new name: ");
            String name = sc.nextLine();

            System.out.print("Enter new position: ");
            String position = sc.nextLine();

            System.out.print("Enter new salary: ");
            double salary = sc.nextDouble();

            employees.set(index, new Employee(name, position, salary));
            System.out.println("Employee updated successfully.");
        } 
        else 
        {
            System.out.println("Invalid index.");
        }
	}

	// deleteEmployee method is used to delete employee based on index position
	public void deleteEmployee() 
	{
		int index = 0;
		 try {
			 System.out.print("Enter index of employee to delete: ");
		        index = sc.nextInt();
		} catch (InputMismatchException e) {
			System.err.println("ERROR : Invalid Input! Input should be a positive number and not greater than size of Arraylist.");
		}
	        if (index >= 0 && index < employees.size()) 
	        {
	        	employees.remove(index);
	            System.out.println("Employee deleted successfully.");
	        } 
	        else 
	        {
	            System.out.println("Invalid index.");
	        }
	}

}