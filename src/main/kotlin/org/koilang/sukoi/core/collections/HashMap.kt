package org.koilang.sukoi.core.collections

import org.koilang.sukoi.core.types.Reference

abstract class HashMap<K, V>(private var values: kotlin.collections.HashMap<K, V>) : Reference() {
}