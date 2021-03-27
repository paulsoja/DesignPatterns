package com.paulsoja.patterns.behavioral.strategy

class TrainBookingStrategy : BookingStrategy {

    override val fare: Double = 8.5

    override fun toString(): String {
        return "TrainBookingStrategy"
    }

}