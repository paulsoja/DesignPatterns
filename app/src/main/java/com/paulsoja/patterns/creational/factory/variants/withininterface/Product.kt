package com.paulsoja.patterns.creational.factory.variants.withininterface

/* The kind of product */
interface FileParser {
    companion object {
        infix fun createFromFileName(fileName: String) =
            when (fileName.substringAfterLast('.')) {
                "xml" -> XmlFileParser()
                "json" -> JsonFileParser()
                else -> throw Exception("I don't know how to deal with $fileName.")
            }
    }
}

/* One possible product */
class XmlFileParser : FileParser
/* Another possible product */
class JsonFileParser : FileParser