package org.koilang.sukoi

import grammars.KoiLexer
import grammars.KoiParser
import org.antlr.v4.runtime.*
import org.antlr.v4.runtime.tree.ParseTreeWalker
import org.koilang.sukoi.util.FileLoader
import java.io.FileInputStream

fun main(args: Array<String>) {
    val inputStream = ANTLRInputStream(FileInputStream(FileLoader.loadFromResources("examples/print.koi")))
    val lexer = KoiLexer(inputStream)
    val commonTokenStream = CommonTokenStream(lexer)
    val parser = KoiParser(commonTokenStream)

    val tree = parser.program()
    val walker = ParseTreeWalker()
    walker.walk(KoiInterpreter(), tree)
}
