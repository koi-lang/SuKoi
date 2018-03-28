package org.koilang.sukoi.core.collections

import org.koilang.sukoi.core.types.String
import org.koilang.sukoi.core.types.Value

class Dictionary(private var values: kotlin.collections.HashMap<String, Value>) : HashMap<String, Value>(values) {
}