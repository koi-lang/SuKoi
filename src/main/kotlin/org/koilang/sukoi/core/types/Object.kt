package org.koilang.sukoi.core.types

abstract class Object {
    fun new() {
        constructor()
        initializer()
    }
    fun constructor() {}
    fun deconstructor() {}

    fun initializer() {}


    fun equals(other: Object): Boolean {
        if (this == other) {
            return Boolean(true)
        }
        else {
            return Boolean(false)
        }
    }

    abstract fun asBoolean(): Boolean
    abstract fun asCharacter(): Character
    abstract fun asDouble(): Double
    abstract fun asFloat(): Float
    abstract fun asInteger(): Integer

    abstract fun asString(): String
}