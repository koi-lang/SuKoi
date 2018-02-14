package org.koilang.sukoi

import grammars.KoiBaseListener
import grammars.KoiParser
import org.koilang.sukoi.util.*

class KoiInterpreter : KoiBaseListener() {
    override fun enterPrint(ctx: KoiParser.PrintContext?) {
        print(koiPrint(ctx?.value()!!.toList()))
    }

    override fun enterPrintLine(ctx: KoiParser.PrintLineContext?) {
        println(koiPrint(ctx?.value()!!.toList()))
    }
}