package club.doki7.babel.drv

import club.doki7.babel.codegen.CodegenOptions
import club.doki7.babel.codegen.generateCommandFile
import club.doki7.babel.codegen.generateConstants
import club.doki7.babel.codegen.generateFunctionTypedefs
import club.doki7.babel.codegen.generateHandle
import club.doki7.babel.extract.openal.extractOpenALHeader
import club.doki7.babel.registry.OpaqueHandleTypedef
import club.doki7.babel.util.render
import java.io.File

private const val packageDir = "openal/src/main/java/club/doki7/openal"

fun openalMain() {
    val registry = extractOpenALHeader()

    val codegenOptions = CodegenOptions(
        packageName = "club.doki7.openal",
        extraImport = emptyList(),
        constantClassName = "OpenALConstants",
        functionTypeClassName = "OpenALFunctionTypes",
        refRegistries = emptyList(),
    )

    val constantDoc = generateConstants(registry, codegenOptions)
    File("$packageDir/${codegenOptions.constantClassName}.java")
        .writeText(render(constantDoc))

    val functionTypeDoc = generateFunctionTypedefs(registry, codegenOptions)
    File("$packageDir/${codegenOptions.functionTypeClassName}.java")
        .writeText(render(functionTypeDoc))

    // todo add structure generator

    for (opaqueTypedef in registry.opaqueTypedefs.values) {
        val handleTypedef = OpaqueHandleTypedef(opaqueTypedef.name)
        handleTypedef.doc = opaqueTypedef.doc
        val handleDoc = generateHandle(registry, handleTypedef, codegenOptions)
        File("$packageDir/handle/${opaqueTypedef.name}.java")
            .writeText(render(handleDoc))
    }

    val commandFile = generateCommandFile(
        registry,
        "OpenAL",
        registry.commands.values.toList(),
        codegenOptions,
        null
    )
    File("$packageDir/OpenAL.java")
        .writeText(render(commandFile))
}
