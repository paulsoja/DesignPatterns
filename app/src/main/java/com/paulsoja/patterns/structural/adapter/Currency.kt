package com.paulsoja.patterns.structural.adapter

interface CurrencyConverter{
    fun convertCurrency(countryName: String)
}

class CurrencyToDollarConverter: CurrencyConverter{
    override fun convertCurrency(countryName: String) {
        //console.log("Dollar Currency")
    }
}

class CurrencyToEuroConverter{
    fun convertCurrency(isoCode: String){
        //console.log("Euro currency")
    }
}