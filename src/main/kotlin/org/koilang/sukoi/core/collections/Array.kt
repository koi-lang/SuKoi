package org.koilang.sukoi.core.collections

import org.koilang.sukoi.core.types.Object
import org.koilang.sukoi.core.types.Reference

abstract class Array<T>(private var value: ArrayList<out Object>) : Reference() {
    fun append(other: Object) {
        value + other
    }
}