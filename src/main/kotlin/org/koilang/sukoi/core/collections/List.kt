package org.koilang.sukoi.core.collections

import org.koilang.sukoi.core.types.Object

class List(private var values: ArrayList<out Object>) : Array<Object?>(values) {
}