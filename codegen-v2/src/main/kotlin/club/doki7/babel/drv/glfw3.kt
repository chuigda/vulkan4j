package club.doki7.babel.drv

import club.doki7.babel.codegen.CodegenOptions
import club.doki7.babel.codegen.generateCommandFile
import club.doki7.babel.codegen.generateConstants
import club.doki7.babel.extract.glfw3.extractGLFWHeader
import club.doki7.babel.util.render
import java.io.File

private const val packageDir = "glfw/src/main/java/club/doki7/glfw"

fun glfw3Main() {
    val glfw3Registry = extractGLFWHeader()

    val codegenOptions = CodegenOptions(
        packageName = "club.doki7.glfw",
        extraImport = listOf(),
        constantClassName = "GLFWConstants",
        functionTypeClassName = "GLFWFunctionTypes",
        refRegistries = emptyList()
    )

    val constantsDoc = generateConstants(glfw3Registry, codegenOptions)
    File("$packageDir/${codegenOptions.constantClassName}.java")
        .writeText(render(constantsDoc))

    val commandsDoc = generateCommandFile(
        glfw3Registry,
        "GLFW",
        glfw3Registry.commands.values.sortedBy { it.name },
        codegenOptions,
        null
    )
    File("$packageDir/GLFW.java")
        .writeText(render(commandsDoc))
}


