package org.koilang.sukoi.util

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
        return koiString(value)
    } else {
        return value
    }
}

fun koiString(value: String): String {
    var stringValue = value.substring(1, value.length - 1)

    if (isSingleString(value)) {
        stringValue = stringValue.replace("\\n", "\n")
                .replace("\\r", "\r")
    }

    return stringValue
}