package org.koilang.sukoi.core.types

class Char(private var value: kotlin.Char) : Value() {
    override fun toChar(): org.koilang.sukoi.core.types.Char {
        return Char(value)
    }
}