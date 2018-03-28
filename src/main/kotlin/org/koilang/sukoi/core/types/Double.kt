package org.koilang.sukoi.core.types

class Double(private var value: kotlin.Double) : Value() {
    override fun asDouble(): Double {
        return Double(value)
    }
}