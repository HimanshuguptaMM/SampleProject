package com.mutualmobile.employees.usecases

import com.mutualmobile.employees.models.Employee
import com.mutualmobile.employees.store.EmployeeStore
import java.util.*

class UseCaseCreateEmployee(private val store: EmployeeStore) : UseCaseTemplate() {
  override fun perform() {
    val scannerInput = Scanner(System.`in`)
    println("\n Please input the employee name")
    val name = scannerInput.nextLine()
    println("\n Please input the employee designation")
    val designation = scannerInput.nextLine()
    println("\n Please input the employee id")
    val employeeId = scannerInput.nextLine()

    val employee = Employee(
      name,
      employeeId,
      Date(),
      designation = designation
    )
    println(employee)
    store.create(employee)
  }
}