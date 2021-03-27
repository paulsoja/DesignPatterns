package com.paulsoja.patterns.behavioral.strategy.variants

class Printer(val strategy: (String) -> String) {
    fun print(string: String): String = strategy(string)
}