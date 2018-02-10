package org.koilang.sukoi

import grammars.KoiParser

fun koiPrint(valueList: List<KoiParser.ValueContext>): String {
    var printValue = ""

    for (item in valueList) {
            printValue += item.text.substring(1, item.text.length - 1)

        if (item != valueList[valueList.size - 1]) {
            printValue += " "
        }
    }

    return printValue
}
