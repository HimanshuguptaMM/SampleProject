package com.mutualmobile.employees.usecases

import com.mutualmobile.employees.store.LaptopStore

class UseCaseGetlaptop(private val laptopStore: LaptopStore) : UseCaseTemplate() {
    override fun perform() {
       laptopStore.getData().forEach {
            println(it)
        }

    }}