package org.koilang.sukoi.util

fun isSingleString(value: String): Boolean {
    if (value.startsWith("\"") && value.endsWith("\"")) {
        return true
    }

    return false
}

fun isLitString(value: String): Boolean {
    if (value.startsWith("'") && value.endsWith("'")) {
        return true
    }

    return false
}

fun isMultiString(value: String): Boolean {
    if (value.startsWith("`") && value.endsWith("`")) {
        return true
    }

    return false
}