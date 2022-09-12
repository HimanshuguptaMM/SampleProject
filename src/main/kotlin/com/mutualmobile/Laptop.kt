package com.mutualmobile



import com.mutualmobile.employees.processOption
import com.mutualmobile.employees.showOptions
import com.mutualmobile.employees.store.LaptopStore
import java.util.*

object MyConstants {
    const val CREATE = 1
    const val DELETE = 2
    const val UPDATE = 3
    const val GETLIST = 4
}
val laptopStore = LaptopStore()
fun main(){
    informLaptop()
    askUserlaptop()

}



fun askUserlaptop() { showOptions()

    val scannerInput = Scanner(System.`in`)
    val optionThatUserChose = scannerInput.nextInt()
    println("Use chose $optionThatUserChose")

    processOption(optionThatUserChose)
}
fun informLaptop() {
    println("Hello! Welcome to MutualMobile")
    Thread.sleep(1000)
    println("Please choose from a list of options")
    Thread.sleep(500)
}

fun UseCaseCreatelaptop(employeeStore: LaptopStore) {

}

fun processs(optionThatUserChose: Int) {
    when (optionThatUserChose) {
        MyConstants.CREATE -> {
            val useCaseCreateLaptop = UseCaseCreatelaptop(laptopStore)
            useCaseCreateLaptop
            askUserlaptop()
        }}}


fun process(optionThatUserChose: Int) {
    when (optionThatUserChose) {
        MyConstants.CREATE -> {
            val useCaseCreateLaptop = UseCaseCreatelaptop(laptopStore)
            useCaseCreateLaptop
            com.mutualmobile.employees.askUserAgain()
        }
    }
    fun showOptions() {
        println("${MyConstants.CREATE}. Create Employee")
        Thread.sleep(500)
        println("${MyConstants.DELETE}. Delete Employee")
        Thread.sleep(500)
        println("${MyConstants.UPDATE}. Update Employee")
        Thread.sleep(500)
        println("${MyConstants.GETLIST}. Get List of Laptop")
    }
}