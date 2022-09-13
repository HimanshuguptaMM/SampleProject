package com.mutualmobile.employees.store


import com.mutualmobile.employees.models.Laptop


class LaptopStore : Store<Laptop>() {
    private val laptop = mutableListOf<Laptop>()
    override fun create(data: Laptop) {
        laptop.add(data)                                          //ADD DATA
    }

    override fun getData(): MutableList<Laptop> {
        return laptop
    }

    override fun update(data: Laptop) {
        var newLaptop: Laptop? = laptop.firstOrNull { laptop: Laptop ->

            laptop.Laptopid == data.Laptopid
        }
        newLaptop?.let {
            newLaptop.name = data.name
            newLaptop.Laptopid = data.Laptopid
        }
    }


    override fun delete(data: Laptop) {
        laptop.remove(data)                         //DELETE DATA
    }


    private fun Laptop.Companion.add(data: Laptop) {

    }
}