package org.koilang.sukoi.core.types

open class Object {
    fun new() {}

    fun equals(other: Object): Boolean {
        if (this == other) {
            return Boolean(true)
        }
        else {
            return Boolean(false)
        }
    }
}