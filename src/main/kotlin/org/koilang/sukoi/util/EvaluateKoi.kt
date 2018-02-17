package org.koilang.sukoi.util

import grammars.KoiParser

fun koiPrint(valueList: List<KoiParser.ValueContext>, variables: HashMap<String?, Any?> = HashMap()): String {
    var printValue = ""

    for (item in valueList) {
        printValue += koiValue(item.text, variables)

        if (item != valueList[valueList.size - 1]) {
            printValue += " "
        }
    }

    return printValue
}

fun koiValue(value: String, variables: HashMap<String?, Any?> = HashMap()): String {
    if (isSingleString(value) || isLitString(value) || isMultiString(value)) {
        return koiString(value)
    }
    else if (value in variables.keys) {
        return koiValue(variables[value].toString())
    }
    else {
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