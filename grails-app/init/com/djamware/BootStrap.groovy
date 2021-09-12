package com.djamware

import groovy.transform.CompileStatic

@CompileStatic
class BootStrap {

    MakeService makeService
    ModelService modelService
    VehicleService vehicleService

    def init = { servletContext ->

        Make nissan = makeService.save('Nissan')
        Make ford = makeService.save( 'Ford')

        Model titan = modelService.save('Titan', nissan)
        Model leaf = modelService.save('Leaf', nissan)
        Model windstar = modelService.save('Windstar', ford)

        Vehicle vehicle1 = new Vehicle(name:'Pickup', make:nissan, model:titan, year:2012)
        Vehicle vehicle2 = new Vehicle(name:'Economy', make:nissan, model:leaf, year:2014)
        Vehicle vehicle3 = new Vehicle(name:'Minivan', make:ford, model:windstar, year:1990)

        vehicleService.save(vehicle1).save()
        vehicleService.save(vehicle2).save()
        vehicleService.save(vehicle3).save()
    }
    def destroy = {
    }
}
