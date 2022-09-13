package com.mutualmobile.employees.usecases


import com.mutualmobile.employees.models.Laptop
import com.mutualmobile.employees.store.LaptopStore
import java.lang.System.`in`
import java.util.*


class UseCaseUpdateLaptop(private val laptopStore: LaptopStore) : UseCaseTemplate() {
    override fun perform() {
        val systemIn = Scanner(`in`)
        println("enter laptop id to update")
        val id = systemIn.nextLine()
        println("enter the new laptop name")
        val name = systemIn.nextLine()
        val updatedlaptop = Laptop(
            name,
            id,
        )
        laptopStore.update(updatedlaptop)
    }
}

