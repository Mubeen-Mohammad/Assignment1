package org.example
//Assignment1:Create a Employee Management System using kotlin.
// Create a model classes and create a menu driven class.

import java.util.Scanner
data class Employee(
    val id: Int,
    var name: String,
    var position: String,
    var salary: Double
)


val employees = mutableListOf<Employee>()
val scanner = Scanner(System.`in`)


fun addEmployee() {
    println("Enter Employee Details")
    print("ID: ")
    val id = scanner.nextInt()
    print("Name: ")
    val name = scanner.next()
    print("Position: ")
    val position = scanner.next()
    print("Salary: ")
    val salary = scanner.nextDouble()
    employees.add(Employee(id, name, position, salary))
    println("Employee added successfully!")
}

fun updateEmployee() {
    println("Enter Employee ID to Update: ")
    val id = scanner.nextInt()
    val employee = employees.find { it.id == id }
    if (employee != null) {
        print("Enter new name: ")
        employee.name = scanner.next()
        print("Enter new position: ")
        employee.position = scanner.next()
        print("Enter new salary: ")
        employee.salary = scanner.nextDouble()
        println("Employee updated successfully!")
    } else {
        println("Employee not found!")
    }
}

fun deleteEmployee() {
    println("Enter Employee ID to Delete: ")
    val id = scanner.nextInt()
    if (employees.removeIf { it.id == id }) {
        println("Employee deleted successfully!")
    } else {
        println("Employee not found!")
    }
}

fun viewEmployees() {
    if (employees.isEmpty()) {
        println("No employees found.")
    } else {
        println("Employee List:")
        for (employee in employees) {
            println("ID: ${employee.id}, Name: ${employee.name}, Position: ${employee.position}, Salary: ${employee.salary}")
        }
    }
}

fun main() {
    test@ while (true) {
        println("Employee Management System")
        println("1. Add Employee")
        println("2. Update Employee")
        println("3. Delete Employee")
        println("4. View Employees")
        println("5. Exit")
        print("Enter your choice: ")
        when (scanner.nextInt()) {
            1 -> addEmployee()
            2 -> updateEmployee()
            3 -> deleteEmployee()
            4 -> viewEmployees()
            5 -> {
                println("Exiting from the Employee Management System")
                break@test
            }
            else -> println("Invalid choice. Please try again.")
        }
    }
}
