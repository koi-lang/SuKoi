package org.koilang.sukoi.core.other

import org.koilang.sukoi.core.collections.Dictionary
import org.koilang.sukoi.core.types.None
import org.koilang.sukoi.core.types.Object

class Function(val arguments: Dictionary, val returnType: Object, val code: String) : Procedure() {
    override fun call(): None {
        TODO("not implemented")
    }
}