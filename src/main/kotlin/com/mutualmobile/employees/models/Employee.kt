package com.mutualmobile.employees.models

import java.util.Date

data class Employee(
  var name: String,
  var uuid: String,
  var dateOfJoining: Date = Date(),
  var designation: String,
  var photoUrl: String? = null
)
