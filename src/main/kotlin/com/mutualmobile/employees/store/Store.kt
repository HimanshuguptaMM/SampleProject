package com.mutualmobile.employees.store

abstract class Store<T> {
  abstract fun create(data: T)
  abstract fun getData(): List<T>
  abstract fun delete(data: T)
  abstract fun update(data: T)
}

