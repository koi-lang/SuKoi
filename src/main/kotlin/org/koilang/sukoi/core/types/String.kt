package org.koilang.sukoi.core.types

import org.koilang.sukoi.core.collections.Array

class String(private var value: ArrayList<out Object>) : Array<Character?>(value) {
    override fun asString(): String {
        return String(value)
    }
}