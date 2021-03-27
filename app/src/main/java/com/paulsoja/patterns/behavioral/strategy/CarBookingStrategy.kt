package com.paulsoja.patterns.behavioral.strategy

class CarBookingStrategy : BookingStrategy {

    override val fare: Double = 12.5

    override fun toString(): String {
        return "CarBookingStrategy"
    }

}