package org.koilang.sukoi.core.types

class Character(private var value: Char) : Value() {
    override fun toChar(): Character {
        return Character(value)
    }
}