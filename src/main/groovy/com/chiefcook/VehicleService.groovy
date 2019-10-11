package com.chiefcook

import org.springframework.stereotype.Service

@Service
class VehicleService {

    private final VehicleRepository vehicleRepository ;

    VehicleService(final VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository ;
    }

    Vehicle createVehicle(final String type,final String modelCode, final String brandName, final String launchDate) {
        final Vehicle vehicle = new Vehicle();
        vehicle.setType(type);
        vehicle.setModelCode(modelCode);
        vehicle.setBrandName(brandName)
        vehicle.setLaunchDate(launchDate)
        return this.vehicleRepository.save(vehicle)
    }

    List<Vehicle> getAllVehicles(final int count) {
        return this.vehicleRepository.find()
    }

    Vehicle getVehicle(final String id) {
        return this.vehicleRepository.findById(id);
    }
}
