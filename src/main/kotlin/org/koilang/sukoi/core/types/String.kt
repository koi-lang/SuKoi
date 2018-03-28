package org.koilang.sukoi.core.types

class String(private var values: kotlin.Array<out Object>) : Array<Char?>(values) {
    override fun toString(): String {
        return String(values)
    }
}