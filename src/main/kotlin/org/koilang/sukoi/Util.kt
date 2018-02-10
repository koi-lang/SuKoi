package org.koilang.sukoi

import grammars.KoiParser

fun koiPrint(valueList: List<KoiParser.ValueContext>): String {
    var printValue = ""

    for (item in valueList) {
        printValue += koiValue(item.text)

        if (item != valueList[valueList.size - 1]) {
            printValue += " "
        }
    }

    return printValue
}

fun koiValue(value: String): String {
    if (isSingleString(value) || isLitString(value) || isMultiString(value)) {
        return value.substring(1, value.length - 1)
    } else {
        return value
    }
}

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