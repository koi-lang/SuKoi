package org.koilang.sukoi

import grammars.KoiBaseListener
import grammars.KoiParser
import org.koilang.sukoi.util.*

class KoiInterpreter : KoiBaseListener() {
    private val variables = HashMap<String?, Any?>()

    private var value = ""

    override fun enterPrint(ctx: KoiParser.PrintContext?) {
        print(koiPrint(ctx?.value()!!.toList(), variables))
    }

    override fun enterPrintLine(ctx: KoiParser.PrintLineContext?) {
        println(koiPrint(ctx?.value()!!.toList(), variables))
    }

    override fun exitAsstmt(ctx: KoiParser.AsstmtContext?) {
        variables[ctx?.ID()?.text] = value
    }

    override fun enterValue(ctx: KoiParser.ValueContext?) {
        value = ctx?.text!!
    }
}