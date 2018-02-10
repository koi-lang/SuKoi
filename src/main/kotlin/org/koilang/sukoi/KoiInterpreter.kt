package org.koilang.sukoi

import grammars.KoiBaseListener
import grammars.KoiParser

class KoiInterpreter : KoiBaseListener() {
    override fun enterPrint(ctx: KoiParser.PrintContext?) {
        koiPrint(ctx?.value()!!.toList())
    }

    override fun enterPrintLine(ctx: KoiParser.PrintLineContext?) {
        koiPrint(ctx?.value()!!.toList(), "println")
    }
}

private fun koiPrint(valueList: List<KoiParser.ValueContext>, mode: String = "print") {
    var printValue = ""

    for (item in valueList) {
        printValue += item.text.substring(1, item.text.length - 1)

        if (item != valueList[valueList.size - 1]) {
            printValue += " "
        }
    }

    if (mode == "println") {
        printValue += "\n"
    }

    print(printValue)
}