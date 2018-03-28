package org.koilang.sukoi.core.types

class Double(private var value: kotlin.Double) : Value() {
    override fun toDouble(): Double {
        return Double(value)
    }
}