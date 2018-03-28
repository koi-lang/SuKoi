package org.koilang.sukoi.core.types

open class Array<T>(private var values: ArrayList<out Object>) : Reference() {
    fun append(other: Object) {
        values + other
    }
}