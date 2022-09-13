package com.mutualmobile

import com.mutualmobile.employees.store.LaptopStore
import com.mutualmobile.employees.usecases.UseCaseCreateLaptop
import com.mutualmobile.employees.usecases.UseCaseDeleteLaptop
import com.mutualmobile.employees.usecases.UseCaseGetLaptop
import com.mutualmobile.employees.usecases.UseCaseUpdateLaptop
import java.util.*

object MyConstants {
    const val CREATE = 1
    const val DELETE = 2
    const val UPDATE = 3
    const val GETLIST = 4
}

val laptopStore = LaptopStore()
fun main(
) {
    informLaptop()
    askUserLaptop()
}

fun askUserLaptop() {
    showOptions()

    val scannerInput = Scanner(System.`in`)
    val optionThatUserChose = scannerInput.nextInt()
    println("Use chose $optionThatUserChose")
    processes(optionThatUserChose)
}

fun informLaptop() {
    println("Hello! Welcome to MutualMobile")
    Thread.sleep(1000)
    println("Please choose from a list of options")
    Thread.sleep(500)
}

fun processes(optionThatUserChose: Int) {
    when (optionThatUserChose) {
        MyConstants.CREATE -> {
            val useCaseCreateLaptop = UseCaseCreateLaptop(laptopStore)
            useCaseCreateLaptop.perform()
            askUserLaptop()
        }

        MyConstants.DELETE -> {
            val useCaseDeleteLaptop = UseCaseDeleteLaptop(laptopStore)
            useCaseDeleteLaptop.perform()
            askUserLaptop()
        }

        MyConstants.GETLIST -> {
            val useCaseGetLaptop = UseCaseGetLaptop(laptopStore)
            useCaseGetLaptop.perform()
            askUserLaptop()
        }

        MyConstants.UPDATE -> {
            val useCaseUpdateLaptop = UseCaseUpdateLaptop(laptopStore)
            useCaseUpdateLaptop.perform()
            askUserLaptop()
        }

    }
}


fun showOptions() {
    println("${MyConstants.CREATE}. Create Laptop")
    Thread.sleep(500)
    println("${MyConstants.DELETE}. Delete laptop")
    Thread.sleep(500)
    println("${MyConstants.UPDATE}. Update laptop")
    Thread.sleep(500)
    println("${MyConstants.GETLIST}. Get List of Laptop")
}
