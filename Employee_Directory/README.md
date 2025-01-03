# Employee Directory

## Overview
The **Employee Directory** is a simple Java application that allows users to manage employee information, including their name, position, and salary. The program supports basic CRUD (Create, Read, Update, Delete) operations, making it a useful example of working with Java collections and object-oriented programming.

## Features
- **Add Employee**: Add a new employee to the directory.
- **Display All Employees**: View details of all employees in the directory.
- **Update Employee**: Modify an employee's details at a specific index.
- **Delete Employee**: Remove an employee from the directory at a specific index.

## Class Structure

### 1. **Employee**
Represents an individual employee with the following attributes:
- `name`: The name of the employee.
- `position`: The position or job title of the employee.
- `salary`: The salary of the employee.

**Methods**:
- Constructor: Initializes an employee's details.
- Getters and setters for each attribute.
- Overridden `toString()` method to return a formatted string representation of the employee.

### 2. **Directory**
Manages a collection of `Employee` objects using an `ArrayList`.

**Methods**:
- `addEmployee(Employee employee)`: Adds an employee to the directory.
- `displayAllEmployees()`: Displays all employees in the directory.
- `updateEmployee(int index, String name, String position, double salary)`: Updates an employee's details at the specified index.
- `deleteEmployee(int index)`: Deletes an employee at the specified index.

### 3. **EmployeeDirectoryExample**
The main class that demonstrates the functionality of the application:
- Adds employees to the directory.
- Displays all employees.
- Updates an employee's details.
- Deletes an employee.
- Displays the updated directory.

## How to Run

1. **Prerequisites**:
   - Java Development Kit (JDK) installed.
   - A code editor or IDE (e.g., IntelliJ IDEA, Eclipse, VS Code).

2. **Steps**:
   - Clone or download the project to your local machine.
   - Compile the Java files:
     ```bash
     javac EmployeeDirectoryExample.java
     ```
   - Run the main class:
     ```bash
     java EmployeeDirectoryExample
     ```

3. **Expected Output**:
   The application will display the following sequence:
   - Initial list of employees.
   - Updated list after modifying an employee's details.
   - Final list after deleting an employee.

## Example Output

```plaintext
Initial Employees:
Employee{name='Alice', position='Manager', salary=60000.0}
Employee{name='Bob', position='Developer', salary=50000.0}

After Updating Bob's Details:
Employee{name='Alice', position='Manager', salary=60000.0}
Employee{name='Bob', position='Senior Developer', salary=55000.0}

After Deleting Alice:
Employee{name='Bob', position='Senior Developer', salary=55000.0}
