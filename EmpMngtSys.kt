import java.util.Scanner

data class Employee(val id: Int, var name: String, var position: String, var salary:Double)
class EmployeeManagementSystem {
    private val employees = mutableListOf<Employee>()

    fun manageEmployees(action: String, employee: Employee? = null, id: Int? = null, name: String? = null, position: String? = null,salary: Double? = null) {
        when (action) {
            "add" -> {
                if (employee != null) {
                    employees.add(employee)
                    println("Employee ${employee.name} added successfully")
                } else {
                    println("Employee data is missing")
                }
            }
            "remove" -> {
                if (id != null) {
                    val empToRemove = employees.find { it.id == id }
                    if (empToRemove != null) {
                        employees.remove(empToRemove)
                        println("Employee ${empToRemove.name} removed successfully")
                    } else {
                        println("Employee with ID $id not found")
                    }
                } else {
                    println("ID is missing")
                }
            }
            "list" -> {
                if (employees.isEmpty()) {
                    println("No employees found")
                } else {
                    employees.forEach { println("ID: ${it.id}, Name: ${it.name}, Position: ${it.position}, Salary: $(it.salary)") }
                }
            }
            "update" -> {
                if (id != null && name != null && position != null && salary != null) {
                    val empToUpdate = employees.find { it.id == id }
                    if (empToUpdate != null) {
                        empToUpdate.name = name
                        empToUpdate.position = position
                        empToUpdate.salary = salary
                        println("Employee ${empToUpdate.name} updated sucessfully")
                    } else {
                        println("Employee with ID $id not found")
                    }
                } else {
                    println("ID, name, or position is missing")
                }
            }
            else -> println("Invalid action")
        }
    }
}


fun main() {
    val scanner = Scanner(System.`in`)
    val system = EmployeeManagementSystem()

    while (true) {
        println("Choose an action: add, remove, list, update, exit")
        val action = scanner.nextLine()

        when (action) {
            "add" -> {
                println("Enter employee ID:")
                val id = scanner.nextInt()
                scanner.nextLine()
                println("Enter employee name:")
                val name = scanner.nextLine()
                println("Enter employee position:")
                val position = scanner.nextLine()
                println("Enter employee salary:")
                val salary = scanner.nextDouble()
                scanner.nextLine()

                val employee = Employee(id, name, position,salary)
                system.manageEmployees("add", employee = employee)
            }
            "remove" -> {
                println("Enter employee ID to remove:")
                val id = scanner.nextInt()
                scanner.nextLine() 
                system.manageEmployees("remove", id = id)
            }
            "list" -> {
                system.manageEmployees("list")
            }
            "update" -> {
                println("Enter employee ID to update:")
                val id = scanner.nextInt()
                scanner.nextLine() 
                println("Enter new employee name:")
                val name = scanner.nextLine()
                println("Enter new employee position:")
                val position = scanner.nextLine()
                println("Enter new employee salary:")
                val salary = scanner.nextDouble()
                scanner.nextLine()
                system.manageEmployees("update", id = id, name = name, position = position, salary = salary)
            }
            "exit" -> {
                println("Exiting from the Employee Management System.")
                break
            }
            else -> println("Invalid action")
        }
    }
}


