package com.mutualmobile.employees.usecases

import com.mutualmobile.employees.store.LaptopStore

class UseCaseGetLaptop(private val LaptopStore: LaptopStore) : UseCaseTemplate() {
    override fun perform() {
        LaptopStore.getData().forEach {
            println(it)
        }
    }
}