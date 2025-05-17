package club.doki7.babel.drv

import club.doki7.babel.codegen.CodegenOptions
import club.doki7.babel.extract.gles2.extractGLES2Registry
import club.doki7.babel.registry.Command
import club.doki7.babel.registry.Entity

fun gles2Main() {
    val gles2Registry = extractGLES2Registry()

    val codegenOptions = CodegenOptions(
        packageName = "club.doki7.gles2",
        extraImport = mutableListOf(),
        constantClassName = "GLES2Constants",
        functionClassName = "GLES2Functions",
        functionTypeClassName = "GLES2FunctionTypes",
        refRegistries = emptyList(),
        seeLinkProvider = ::gles2DocLinkProvider
    )
}

private fun gles2DocLinkProvider(entity: Entity) = when(entity) {
    is Command -> {
        val commandName = entity.name.original
        "https://docs.gl/es2/$commandName"
    }
    else -> null
}
