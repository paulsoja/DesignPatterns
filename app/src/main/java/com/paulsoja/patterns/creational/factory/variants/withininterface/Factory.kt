package com.paulsoja.patterns.creational.factory.variants.withininterface

fun FileParser.Companion.fromFile(filename: String) =
    this.createFromFileName(filename)