package org.koilang.sukoi.core.types

import kotlin.Int

class Integer(private var value: Int) : Value() {
    override fun asInteger(): Integer {
        return Integer(value)
    }
}