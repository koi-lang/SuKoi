package org.koilang.sukoi.core.types

abstract class Value : Object() {
    override fun toBoolean(): Boolean {
        return Boolean(true)
    }

    override fun toChar(): Char {
        TODO("not implemented")
    }

    override fun toFloat(): Float {
        TODO("not implemented")
    }

    override fun toInteger(): Integer {
        TODO("not implemented")
    }

    override fun toString(): String {
        TODO("not implemented")
    }
}