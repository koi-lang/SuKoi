package org.koilang.sukoi.core.other

import org.koilang.sukoi.core.types.Boolean
import org.koilang.sukoi.core.types.Character
import org.koilang.sukoi.core.types.Double
import org.koilang.sukoi.core.types.Float
import org.koilang.sukoi.core.types.Integer
import org.koilang.sukoi.core.types.Object
import org.koilang.sukoi.core.types.String

class Variable(private var value: Object) : Object() {
    override fun asBoolean(): Boolean {
        return value.asBoolean()
    }

    override fun asCharacter(): Character {
        return value.asCharacter()
    }

    override fun asDouble(): Double {
        return value.asDouble()
    }

    override fun asFloat(): Float {
        return value.asFloat()
    }

    override fun asInteger(): Integer {
        return value.asInteger()
    }

    override fun asString(): String {
        return value.asString()
    }
}