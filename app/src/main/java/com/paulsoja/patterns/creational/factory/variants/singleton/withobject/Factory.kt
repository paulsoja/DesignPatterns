package com.paulsoja.patterns.creational.factory.variants.singleton.withobject

/* The concept of the factory -> creates a Product */
interface FileParserFactory {
    fun createFromFileName(fileName: String): FileParser
}

/* Our specific Factory */
object ObjectFileParserFactory : FileParserFactory {
    override fun createFromFileName(fileName: String) =
        when (fileName.substringAfterLast('.')) {
            "xml" -> XmlFileParser()
            "json" -> JsonFileParser()
            else -> throw Exception("I don't know how to deal with $fileName.")
        }
}