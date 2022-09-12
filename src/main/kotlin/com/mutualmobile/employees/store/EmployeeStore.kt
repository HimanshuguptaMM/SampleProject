package com.mutualmobile.employees.store

import com.mutualmobile.employees.models.Employee

class EmployeeStore : Store<Employee>() {

  private val employees = mutableListOf<Employee>()

  override fun create(data: Employee) {
    employees.add(data)
  }

  override fun delete(data: Employee) {
    employees.remove(data)
  }

  override fun update(data: Employee) {
    val employeeToUpdate: Employee? = employees.firstOrNull { employee: Employee ->
      employee.uuid == data.uuid
    }
    employeeToUpdate?.let {
      employeeToUpdate.designation = data.designation
      employeeToUpdate.dateOfJoining = data.dateOfJoining
      employeeToUpdate.uuid = data.uuid
      employeeToUpdate.name = data.name
    }
  }

  override fun getData(): MutableList<Employee> {
    return employees
  }
}