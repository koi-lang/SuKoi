package org.koilang.sukoi.core.collections

import org.koilang.sukoi.core.types.Object

class List(private var value: ArrayList<out Object>) : Array<Object?>(value) {
}