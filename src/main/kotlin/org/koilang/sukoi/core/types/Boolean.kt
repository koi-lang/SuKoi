package org.koilang.sukoi.core.types

class Boolean(private var value: kotlin.Boolean) : Value() {
    override fun toBoolean(): Boolean {
        return Boolean(value)
    }
}