package com.chiefcook

import groovy.json.*
import org.springframework.stereotype.Repository

@Repository
class VehicleRepository {

    String file = 'vehicles.json'

    Vehicle save(Vehicle vehicle) {
        File f = new File(file)

        List vehicles = f.exists() ? new JsonSlurper().parse(new File(file)) : []

        vehicle.setId(UUID.randomUUID().toString())

        vehicles << vehicle

        f.delete()

        f << JsonOutput.toJson(vehicles)

        return vehicle

    }

    Vehicle findById(String id) {
        File f = new File(file)

        List vehicles =  new JsonSlurper().parse(new File(file))

        return vehicles.find({it.id == id})
    }

    List find() {
        File f = new File(file)

        return  new JsonSlurper().parse(new File(file))
    }
}
