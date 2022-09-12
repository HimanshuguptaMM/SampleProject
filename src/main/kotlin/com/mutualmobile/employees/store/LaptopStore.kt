package com.mutualmobile.employees.store

import com.mutualmobile.employees.models.Employee
import com.mutualmobile.employees.models.Laptop

class LaptopStore : Store<Laptop>() {
  override fun create(data: Laptop) {
      Laptop.add(data)
  }

  override fun getData(): List<Laptop> {
    TODO("Not yet implemented")
  }

  override fun update(data: Laptop) {
    TODO("Not yet implemented")
  }

  override fun delete(data: Laptop) {
    TODO("Not yet implemented")
  }

}

private fun Laptop.Companion.add(data: Laptop) {

}
