package com.djamware

class Vehicle {

    Integer year
    String name
    Make make
    Model model

    static constraints = {

        year min: 1900
        name maxSize: 255
    }
}
