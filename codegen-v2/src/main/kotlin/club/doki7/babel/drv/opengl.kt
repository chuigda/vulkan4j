package club.doki7.babel.drv

import club.doki7.babel.codegen.CodegenOptions
import club.doki7.babel.codegen.generateConstants
import club.doki7.babel.extract.opengl.GLCommandMetadata
import club.doki7.babel.extract.opengl.extractOpenGLRegistry
import club.doki7.babel.util.render
import java.io.File

private const val packageDir = "opengl/src/main/java/club/doki7/opengl"

fun openglMain() {
    val openglRegistry = extractOpenGLRegistry()

    val codegenOptions = CodegenOptions(
        packageName = "club.doki7.opengl",
        extraImport = listOf(),
        constantClassName = "GLEConstants",
        functionTypeClassName = "GLFunctionTypes",
        refRegistries = emptyList()
    )

    val constantsDoc = generateConstants(openglRegistry, codegenOptions)
    File("$packageDir/${codegenOptions.constantClassName}.java")
        .writeText(render(constantsDoc))

    val (compatibilityCommands, coreCommands) = openglRegistry.commands.values
        .sortedBy { it.name }
        .partition { it.ext<GLCommandMetadata>().isCompatibility }

    val coreCommandsDoc = club.doki7.babel.codegen.generateCommandFile(
        openglRegistry,
        "GL",
        coreCommands,
        codegenOptions,
        null
    )
    File("$packageDir/GL.java")
        .writeText(render(coreCommandsDoc))
}
