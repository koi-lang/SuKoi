package org.koilang.sukoi.core.types

import kotlin.Int

class Integer(private var value: Int) : Value() {
    override fun toInteger(): Integer {
        return Integer(value)
    }
}