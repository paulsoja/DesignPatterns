package com.paulsoja.patterns

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.paulsoja.patterns.behavioral.strategy.CarBookingStrategy
import com.paulsoja.patterns.behavioral.strategy.Customer
import com.paulsoja.patterns.behavioral.strategy.TrainBookingStrategy
import com.paulsoja.patterns.behavioral.strategy.variants.Printer
import com.paulsoja.patterns.creational.builder.Builder
import com.paulsoja.patterns.creational.builder.Product
import com.paulsoja.patterns.creational.factory.StandardFileParserFactory
import com.paulsoja.patterns.creational.prototype.Film
import com.paulsoja.patterns.structural.adapter.CurrencyConverterAdapter
import com.paulsoja.patterns.structural.adapter.CurrencyToDollarConverter
import com.paulsoja.patterns.structural.adapter.CurrencyToEuroConverter
import com.paulsoja.patterns.structural.facade.Language
import com.paulsoja.patterns.structural.facade.TranslationManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    private fun useFactory() {
        StandardFileParserFactory().createFromFileName("filename.json")
    }

    private fun useBuilder() {
        val builder = Builder()
            .setTitle("Laptop")
            .setPrice(1000)
            .setWeight(1.1f)
            .isPopular(true)
            .build()
    }

    private fun usePrototype() {
        /*
        Prototype model is based on an object prototype, create a new object.
        Kotlin used because data class, are automatically equals, hashCode,
        toString and copy methods, many relatively simple java, copy the entire
        object and method may allow cloning of the new object to modify certain properties.
        */

        val film = Film( "Journey to the West", "...", "Liu Xiao Ling Tong ...")
        val copy = film.copy(name = "Journey 2")
        //there is different names in the film and copy objects
    }

    private fun useAdapter() {
        /*
        Convert the interface of a class into another interface clients expect.
        Adapter lets classes work together that couldn’t otherwise because of incompatible interfaces.
        */

        val currencyToDollarConverter = CurrencyToDollarConverter()
        currencyToDollarConverter.convertCurrency("Country name")

        val currencyToEuroConverter = CurrencyToEuroConverter()
        val currencyConverterAdapter = CurrencyConverterAdapter(currencyToEuroConverter)
        currencyConverterAdapter.convertCurrency("Country name")
    }

    private fun useFacade() {
        /*
        it aims to simplify connection between clients and complex subsystems by providing
        a simple interface that contains the needed functionalities by clients and redirect
        requests to the handlers in the subsystem
        */

        val translationManager = TranslationManager()
        translationManager.translate("Some text", Language.English, Language.Italian)
        translationManager.translate("Some text", Language.English, Language.French)
    }

    private fun useStrategy() {
        /*
        In the Strategy pattern, we create objects which represent various strategies and
        a context object whose behavior varies as per its strategy object. The strategy object
        changes the executing algorithm of the context object.
        */

        //CarBooking Strategy
        val cust = Customer(CarBookingStrategy())
        var fare = cust.calculateFare(5)
        println(fare)

        //TrainBooking Strategy
        cust.bookingStrategy = TrainBookingStrategy()
        fare = cust.calculateFare(5)
        println(fare)

        //output
        //Calculating fares using CarBookingStrategy
        //62.5
        //Calculating fares using TrainBookingStrategy
        //42.5
    }

    private fun useVariantStrategy() {
        val lowerCaseFormatter: (String) -> String = String::toLowerCase
        val upperCaseFormatter: (String) -> String = String::toUpperCase

        val lower = Printer(strategy = lowerCaseFormatter)
        println(lower.print("O tempora, o mores!"))
        val upper = Printer(strategy = upperCaseFormatter)
        println(upper.print("O tempora, o mores!"))

        //output
        //o tempora, o mores!
        //O TEMPORA, O MORES!
    }

}