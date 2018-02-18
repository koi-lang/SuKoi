package org.koilang.sukoi.util

import grammars.KoiParser

fun koiPrint(valueList: List<KoiParser.True_valueContext>, variables: HashMap<String?, Any?> = HashMap()): String {
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
    if (isString(value)) {
        return koiString(value)
    }
    else if (isVariable(value, variables)) {
        return koiValue(variables[value].toString())
    }
    else if (isInteger(value) || isBoolean(value)) {
        return value
    }
    else {
        throw Exception("Invalid value")
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