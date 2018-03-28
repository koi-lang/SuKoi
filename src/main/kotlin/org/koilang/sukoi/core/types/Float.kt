package org.koilang.sukoi.core.types

class Float(private var value: kotlin.Float) : Value() {
    override fun toFloat(): Float {
        return Float(value)
    }
}