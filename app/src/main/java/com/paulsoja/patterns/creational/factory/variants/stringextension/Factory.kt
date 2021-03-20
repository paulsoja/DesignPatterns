package com.paulsoja.patterns.creational.factory.variants.stringextension

fun String.createFileParser() =
    when (this.substringAfterLast('.')) {
        "xml" -> XmlFileParser()
        "json" -> JsonFileParser()
        else -> throw Exception("I don't know how to deal with $this.")
    }