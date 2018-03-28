package org.koilang.sukoi.core.types

abstract class Object {
    fun new() {}

    fun equals(other: Object): Boolean {
        if (this == other) {
            return Boolean(true)
        }
        else {
            return Boolean(false)
        }
    }

    abstract fun toBoolean(): Boolean
    abstract fun toChar(): Character
    abstract fun toDouble(): Double
    abstract fun toFloat(): Float
    abstract fun toInteger(): Integer

    abstract fun toString(): String
}