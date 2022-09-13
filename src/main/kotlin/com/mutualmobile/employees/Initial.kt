package com.mutualmobile.employees

import com.mutualmobile.employees.store.EmployeeStore
import com.mutualmobile.employees.usecases.UseCaseCreateEmployee
import com.mutualmobile.employees.usecases.UseCaseDeleteEmployee
import com.mutualmobile.employees.usecases.UseCaseGetEmployees
import com.mutualmobile.employees.usecases.UseCaseUpdateEmployeeStore
import java.util.*

val employeeStore = EmployeeStore()

object MyConstants {
  const val CREATE = 1
  const val DELETE = 2
  const val UPDATE = 3
  const val GETLIST = 4
}

fun main() {
  informUser()
  askUserAgain()
}

fun askUserAgain() {
  showOptions()

  val scannerInput = Scanner(System.`in`)
  val optionThatUserChose = scannerInput.nextInt()
  println("Use chose $optionThatUserChose")

  processOption(optionThatUserChose)
}

fun informUser() {
  println("Hello! Welcome to MutualMobile")
  Thread.sleep(1000)
  println("Please choose from a list of options")
  Thread.sleep(500)
}

fun processOption(optionThatUserChose: Int) {
  when (optionThatUserChose) {
    MyConstants.CREATE -> {
      val useCaseCreateEmployee = UseCaseCreateEmployee(employeeStore)
      useCaseCreateEmployee.perform()
      askUserAgain()
    }

    MyConstants.DELETE -> {
      val useCaseDeleteEmployee = UseCaseDeleteEmployee(employeeStore)
      useCaseDeleteEmployee.perform()
      askUserAgain()
    }

    MyConstants.UPDATE -> {
val useCaseUpdateLaptop = UseCaseUpdateEmployeeStore(employeeStore)
      useCaseUpdateLaptop.perform()
      askUserAgain()
    }

    MyConstants.GETLIST -> {
      val useCaseGetEmployees = UseCaseGetEmployees(employeeStore)
      useCaseGetEmployees.perform()
      askUserAgain()
    }

    else -> {
      println("Option not available")
    }
  }
}

fun showOptions() {
  println("${MyConstants.CREATE}. Create Employee")
  Thread.sleep(500)
  println("${MyConstants.DELETE}. Delete Employee")
  Thread.sleep(500)
  println("${MyConstants.UPDATE}. Update Employee")
  Thread.sleep(500)
  println("${MyConstants.GETLIST}. Get List of Employee")
}
