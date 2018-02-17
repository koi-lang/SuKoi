package org.koilang.sukoi.util

import java.lang.Boolean.parseBoolean

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

fun isString(value: String): Boolean {
    return isSingleString(value) || isLitString(value) || isMultiString(value)
}

fun isInteger(value: String): Boolean {
    try {
        Integer.parseInt(value)
        return true
    }
    catch (exception: NumberFormatException) {
        return false
    }
}

fun isBoolean(value: String): Boolean {
    return parseBoolean(value)
}

fun isVariable(value: String, variables: HashMap<String?, Any?>): Boolean {
    return value in variables.keys
}