package com.mutualmobile.employees.usecases

import com.mutualmobile.employees.store.EmployeeStore
import java.util.Scanner

class UseCaseDeleteEmployee(private val employeeStore: EmployeeStore) : UseCaseTemplate() {
  override fun perform() {
    val systemIn = Scanner(System.`in`)
    println("Choose the employee which you want to delete !")
    val employees = employeeStore.getData()
    for (employee in employees) {
      println(" Do you want to delete $employee ?")
      val yes = systemIn.nextBoolean()
      if (yes) {
        employeeStore.delete(employee)
        break
      }
    }
  }
}