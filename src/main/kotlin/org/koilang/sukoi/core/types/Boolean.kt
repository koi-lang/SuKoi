package org.koilang.sukoi.core.types

class Boolean(private var value: kotlin.Boolean) : Value() {
    fun not(): Boolean {
        return Boolean(!value)
    }

    override fun asBoolean(): Boolean {
        return Boolean(value)
    }
}