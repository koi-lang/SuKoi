package org.koilang.sukoi

import grammars.KoiParser

fun koiPrint(valueList: List<KoiParser.ValueContext>): String {
    var printValue = ""

    for (item in valueList) {
        if (isSingleString(item.text) || isLitString(item.text) || isMultiString(item.text)) {
            printValue += item.text.substring(1, item.text.length - 1)
        } else {
            printValue += item.text
        }

        if (item != valueList[valueList.size - 1]) {
            printValue += " "
        }
    }

    return printValue
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