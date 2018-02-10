package org.koilang.sukoi

import grammars.KoiBaseListener
import grammars.KoiParser

class KoiInterpreter : KoiBaseListener() {
    override fun enterPrint(ctx: KoiParser.PrintContext?) {
        val valueList = ctx?.value()!!.toList()

        for (item in valueList) {
            var printValue = item.text.substring(1, item.text.length - 1)

            if (item != valueList[valueList.size - 1]) {
                printValue += " "
            }

            print(printValue)
        }
    }
}
}