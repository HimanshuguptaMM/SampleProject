package com.mutualmobile.employees.usecases

import com.mutualmobile.employees.store.EmployeeStore

class UseCaseGetEmployees(private val employeeStore: EmployeeStore) : UseCaseTemplate() {
  override fun perform() {
    employeeStore.getData().forEach {
      println(it)
    }

  }
}