package com.chiefcook

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class VehicleQuery implements GraphQLQueryResolver {
    @Autowired
    private VehicleService vehicleService

    List<Vehicle> getVehicles(final int count) {
        return this.vehicleService.getAllVehicles(count)
    }

    Vehicle getVehicle(final String id) {
        return this.vehicleService.getVehicle(id)
    }
}
