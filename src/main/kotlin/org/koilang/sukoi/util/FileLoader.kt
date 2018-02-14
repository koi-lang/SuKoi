package org.koilang.sukoi.util

import java.io.File

object FileLoader {
    fun loadFromResources(fileName: String): File {
        val classLoader = javaClass.classLoader

        return File(classLoader.getResource(fileName).file)
    }
}