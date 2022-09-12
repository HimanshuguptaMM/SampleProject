package com.mutualmobile.employees.models

import java.util.*

data class Laptop(

    var name: String,
    var Laptopid: String,
    var dateofhandover: Date = Date(),
    var designation: String,
) {
    companion object
}