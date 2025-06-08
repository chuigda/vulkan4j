package club.doki7.babel.drv

import club.doki7.babel.codegen.CodegenOptions
import club.doki7.babel.codegen.generateConstants
import club.doki7.babel.extract.sdl3.extractSDLRegistry
import club.doki7.babel.util.render
import club.doki7.babel.util.setupLog
import java.io.File

private const val packageDir = "sdl3/src/main/java/club/doki7/sdl3"

fun main() {
    setupLog()

    val sdlRegistry = extractSDLRegistry()

    val codegenOptions = CodegenOptions(
        packageName = "club.doki7.sdl3",
        extraImport = listOf(),
        constantClassName = "SDL3Constants",
        functionTypeClassName = "SDL3FunctionTypes",
        refRegistries = emptyList()
    )

    val constantsDoc = generateConstants(sdlRegistry, codegenOptions)
    File("$packageDir/${codegenOptions.constantClassName}.java")
        .writeText(render(constantsDoc))
}
