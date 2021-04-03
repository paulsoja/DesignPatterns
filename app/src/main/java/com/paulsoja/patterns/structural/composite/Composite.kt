package com.paulsoja.patterns.structural.composite

open class Composite(name: String) : Equipment(0, name) {
    private val equipments = ArrayList<Equipment>()

    fun add(equipment: Equipment) {
        this.equipments.add(equipment)
    }

    override fun getPrice(): Int {
        return equipments.map { it.getPrice() }.sum()
    }
}