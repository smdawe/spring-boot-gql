package com.chiefcook

class Vehicle {

    String id
    String type
    String modelCode
    String brandName
    String launchDate

  static Vehicle fromMap(Map m) {
    new Vehicle(id: m.id, type: m.type, modelCode: m.modelCode, brandName: m.brandName, launchDate: m. launchDate)
  }
}
