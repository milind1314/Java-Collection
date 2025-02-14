package jan_01.employee_directory;

import java.util.Scanner;

public class EmployeeDirectoryExample 
{
	public static void main(String[] args)
	{
		Directory directory = new Directory();
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			System.out.println();
			System.out.println("--------------- Employee Records ---------------");
			System.out.println("1. Add Employee ");
			System.out.println("2. Display All Employees ");
			System.out.println("3. Update Employee ");
			System.out.println("4. Delete Employee ");
			System.out.println("5. Exit");
			
			System.out.print("\nEnter your choice: ");
			int choice = sc.nextInt();
			sc.nextLine(); 
			
			System.out.println();
			
			switch(choice)
			{
			case 1:
				System.out.print("Enter Employee Name: ");
				String name = sc.nextLine();
				
				System.out.print("Enter Employee Position: ");
				String position = sc.nextLine();
				
				System.out.print("Enter Employee Salary: ");
				double salary = sc.nextDouble();
				
				directory.addEmployees(new Employee(name, position, salary));
				break;
				
			case 2: 
				directory.displayAllEmployees();
				break;
				
			case 3: 
				directory.updateEmployee();
				break;
				
			case 4: 
				directory.deleteEmployee();
				break;
				
			case 5:
                System.out.println("Exiting program.");
                sc.close();
                return;
				
			default: System.out.println("Invalid choice.");
			}
			
		}
	}
}
