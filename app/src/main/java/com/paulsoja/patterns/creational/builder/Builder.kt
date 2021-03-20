package com.paulsoja.patterns.creational.builder

class Builder {

    private var title: String = "title"
    private var price: Int = 100
    private var weight: Float = 1f
    private var isPopular: Boolean = false

    fun setTitle(title: String): Builder = apply { this.title = title }
    fun setPrice(price: Int): Builder = apply { this.price = price }
    fun setWeight(weight: Float): Builder = apply { this.weight = weight }
    fun isPopular(isPopular: Boolean): Builder = apply { this.isPopular = isPopular }

    fun build(): Product = Product(
        title = title,
        price = price,
        weight = weight,
        isPopular = isPopular
    )

}