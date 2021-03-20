package com.paulsoja.patterns.structural.facade

enum class Language {
    English,
    Italian,
    French;
}

interface Translator {
    fun translate(text: String, textLanguage: Language)
}

class ItalianTranslator : Translator {
    override fun translate(text: String, textLanguage: Language) {
        println("Translate ($text) from ${textLanguage.name} to Italian")
    }
}

class FrenchTranslator : Translator {
    override fun translate(text: String, textLanguage: Language) {
        println("Translate ($text) from ${textLanguage.name} to French")
    }
}

class EnglishTranslator : Translator {
    override fun translate(text: String, textLanguage: Language) {
        println("Translate ($text) from ${textLanguage.name} to English")
    }
}