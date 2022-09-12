package com.mutualmobile.employees.usecases

import com.mutualmobile.employees.models.Employee
import java.util.*

class UseCaseCreateLaptop {
    fun perform(Employeename: String, store: Any, laptopId: String) {
        val scannerInput = Scanner(System.`in`)
        println("\n Please input the employee name")
        val name = scannerInput.nextLine()
        println("\n Please input the employee designation")
        val designation = scannerInput.nextLine()
        println("\n Please input the laptop id")
        val employeeId = scannerInput.nextLine()

        val employee = Employee(
            name,
            laptopId,
            Date(),
            designation = designation
        )
        println(employee)
        store.create(laptopId)
    }
}

private fun Any.create(laptopId: String) {

}
