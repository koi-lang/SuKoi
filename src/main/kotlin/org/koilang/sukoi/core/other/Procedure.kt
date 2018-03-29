package org.koilang.sukoi.core.other

import org.koilang.sukoi.core.types.None
import org.koilang.sukoi.core.types.Reference

abstract class Procedure : Reference() {
    abstract fun call(): None
}