package com.mutualmobile.employees.usecases

import com.mutualmobile.employees.models.Laptop
import com.mutualmobile.employees.store.LaptopStore
import java.util.*

class UseCaseCreateLaptop(private val laptopStore: LaptopStore):UseCaseTemplate() {
 override fun perform() {
        val scannerInput = Scanner(System.`in`)
        println("\n Please input the brand name")
        val name = scannerInput.nextLine()


        println("\n Please input the laptop id")
        val laptopId = scannerInput.nextLine()

        val laptop= Laptop(
            name,
           laptopId,
            Date()

        )
        println(laptop)
        laptopStore.create(laptop)
    }
}

private fun Any.create(laptopId: String) {

}
