package main

import codegen.generateConstants
import codegen.generateCommandClassFile
import extract.extractGLES2Registry
import java.io.File

fun main() {
    val registry = extractGLES2Registry(File("codegen/input/gl.xml").readText())

    val constants = generateConstants(
        "tech.icey.gles2",
        registry.constantClassName,
        registry.constants.values.toList()
    )
    File("gles2/src/main/java/tech/icey/gles2/${registry.constantClassName}.java").writeText(constants)

    val commands = generateCommandClassFile(
        registry,
        registry.commands.values.toList(),
        "tech.icey.gles2",
        "tech.icey.gles2",
        "GLES2",
        emptyList()
    )
    File("gles2/src/main/java/tech/icey/gles2/GLES2.java").writeText(commands)
}
