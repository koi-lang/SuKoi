package org.koilang.sukoi

import grammars.KoiBaseListener
import grammars.KoiParser
import org.koilang.sukoi.util.*

class KoiInterpreter : KoiBaseListener() {
    private val variables = HashMap<String?, Any?>()

    override fun enterPrint(ctx: KoiParser.PrintContext?) {
        print(koiPrint(ctx?.value()!!.toList()))
    }

    override fun enterPrintLine(ctx: KoiParser.PrintLineContext?) {
        println(koiPrint(ctx?.value()!!.toList()))
    }

    override fun enterAsstmt(ctx: KoiParser.AsstmtContext?) {
        variables[ctx?.ID()?.text] = ctx?.value()?.text
    }
}