package com.paulsoja.patterns.structural.composite

open class Equipment(private var price: Int, private var name: String) {
    open fun getPrice(): Int = price
}

class Cabbinet : Composite("cabbinet")
class FloppyDisk : Equipment(70, "Floppy Disk")
class HardDrive : Equipment(250, "Hard Drive")
class Memory : Equipment(280, "Memory")