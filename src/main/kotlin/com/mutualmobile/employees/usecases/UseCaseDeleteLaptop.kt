package com.mutualmobile.employees.usecases

import com.mutualmobile.employees.store.LaptopStore
import java.util.*

class UseCaseDeleteLaptop(private val laptopStore: LaptopStore):UseCaseTemplate() {
    override fun perform() {
        val systemIn = Scanner(System.`in`)
        println("Choose the employee which you want to delete !")
        val laptop = laptopStore.getData()
        for (laptop in laptop) {
            println(" Do you want to delete $laptop ?")
            val yes = systemIn.nextBoolean()
            if (yes) {
                laptopStore.delete(laptop)
                break
            }
        }
    }
}