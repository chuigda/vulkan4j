package main

import extract.extractGLES2Registry
import java.io.File

fun main() {
    val registry = extractGLES2Registry(File("codegen/input/gl.xml").readText())
    registry.constantClassName = "GLConstants"
}
