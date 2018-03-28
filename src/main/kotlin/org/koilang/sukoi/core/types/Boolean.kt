package org.koilang.sukoi.core.types

class Boolean(private var value: kotlin.Boolean) : Value() {
    fun not(): Boolean {
        return Boolean(!value)
    }

    override fun toBoolean(): Boolean {
        return Boolean(value)
    }
}