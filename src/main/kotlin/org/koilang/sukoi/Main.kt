package org.koilang.sukoi

import grammars.KoiLexer
import grammars.KoiParser
import org.antlr.v4.runtime.*
import org.antlr.v4.runtime.tree.ParseTreeWalker

fun main(args: Array<String>) {
    val inputStream = ANTLRInputStream("print(\"Hello\", \"World!\", 1, 1.0, true)")
    val lexer = KoiLexer(inputStream)
    val commonTokenStream = CommonTokenStream(lexer)
    val parser = KoiParser(commonTokenStream)

    val tree = parser.program()
    val walker = ParseTreeWalker()
    walker.walk(KoiInterpreter(), tree)
}
