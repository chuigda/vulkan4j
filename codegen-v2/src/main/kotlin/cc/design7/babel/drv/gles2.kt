package cc.design7.babel.drv

import cc.design7.babel.codegen.CodegenOptions
import cc.design7.babel.extract.gles2.extractGLES2Registry
import cc.design7.babel.registry.Command
import cc.design7.babel.registry.Entity

fun gles2Main() {
    val gles2Registry = extractGLES2Registry()

    val codegenOptions = CodegenOptions(
        packageName = "cc.design7.gles2",
        extraImport = mutableListOf(),
        constantClassName = "GLES2Constants",
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
