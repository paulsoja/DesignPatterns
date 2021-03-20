package com.paulsoja.patterns.creational.factory.variants.singleton.withcompanionobject

/* The kind of product */
interface FileParser

/* One possible product */
class XmlFileParser : FileParser
/* Another possible product */
class JsonFileParser : FileParser