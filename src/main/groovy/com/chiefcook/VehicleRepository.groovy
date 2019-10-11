package com.chiefcook

import groovy.json.*
import org.springframework.stereotype.Repository

@Repository
class VehicleRepository {

    File vehicleFile

    VehicleRepository() {
        vehicleFile = new File('vehicles.json')
    }

    Vehicle save(Vehicle vehicle) {
        List vehicles = vehicleFile.exists() ? new JsonSlurper().parse(vehicleFile) : []

        vehicle.setId(UUID.randomUUID().toString())

        vehicles << vehicle

        vehicleFile.delete()

        vehicleFile << JsonOutput.toJson(vehicles)

        return vehicle

    }

    Vehicle findById(String id) {

        List vehicles =  new JsonSlurper().parse(vehicleFile)

        return vehicles.find({it.id == id})
    }

    List find() {
        return new JsonSlurper().parse(vehicleFile)
    }
}
