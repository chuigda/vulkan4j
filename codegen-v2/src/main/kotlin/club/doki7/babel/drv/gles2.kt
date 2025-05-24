package club.doki7.babel.drv

import club.doki7.babel.codegen.CodegenOptions
import club.doki7.babel.codegen.generateCommandFile
import club.doki7.babel.codegen.generateConstants
import club.doki7.babel.extract.gles2.extractGLES2Registry
import club.doki7.babel.registry.Command
import club.doki7.babel.registry.Entity
import club.doki7.babel.util.render
import java.io.File

private const val packageDir = "gles2/src/main/java/club/doki7/gles2"

fun gles2Main() {
    val gles2Registry = extractGLES2Registry()

    val codegenOptions = CodegenOptions(
        packageName = "club.doki7.gles2",
        extraImport = listOf(),
        constantClassName = "GLES2Constants",
        functionTypeClassName = "GLES2FunctionTypes",
        refRegistries = emptyList(),
        seeLinkProvider = ::gles2DocLinkProvider
    )

    val constantsDoc = generateConstants(gles2Registry, codegenOptions)
    File("$packageDir/${codegenOptions.constantClassName}.java")
        .writeText(render(constantsDoc))

    val commandsDoc = generateCommandFile(
        gles2Registry,
        "GLES2",
        gles2Registry.commands.values.sortedBy { it.name },
        codegenOptions,
        null
    )
    File("$packageDir/GLES2.java")
        .writeText(render(commandsDoc))
}

private fun gles2DocLinkProvider(entity: Entity) = when(entity) {
    is Command -> {
        val commandName = entity.name.original
        "<a href=\"https://docs.gl/es2/$commandName\"><code>$commandName</code></a>"
    }
    else -> null
}
