package org.koilang.sukoi.core.types

import org.koilang.sukoi.core.collections.Array

class String(private var values: ArrayList<out Object>) : Array<Char?>(values) {
    override fun toString(): String {
        return String(values)
    }
}