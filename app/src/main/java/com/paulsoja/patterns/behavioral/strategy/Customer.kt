package com.paulsoja.patterns.behavioral.strategy

class Customer(var bookingStrategy: BookingStrategy) {

    fun calculateFare(numOfPassangeres: Int): Double {
        val fare = numOfPassangeres * bookingStrategy.fare
        println("Calculating fares using " + bookingStrategy)
        return fare
    }

}