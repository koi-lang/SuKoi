package org.koilang.sukoi.core.types

class Float(private var value: kotlin.Float) : Value() {
    override fun asFloat(): Float {
        return Float(value)
    }
}