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
        constantClassName = "ALConstants",
        functionTypeClassName = "ALFunctionTypes",
        refRegistries = emptyList(),
    )

    val (alcConstants, alConstants) = registry
        .constants
        .values
        .partition { it.name.original.startsWith("ALC_") }

    val alcConstantsDoc = generateConstants(registry, codegenOptions.copy(constantClassName="ALCConstants"), alcConstants)
    File("$packageDir/ALCConstants.java").writeText(render(alcConstantsDoc))
    val alConstantsDoc = generateConstants(registry, codegenOptions, alConstants)
    File("$packageDir/ALConstants.java").writeText(render(alConstantsDoc))

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

    val (alcCommands, alCommands) = registry
        .commands
        .values
        .partition { it.name.original.startsWith("alc") }
    val alcCommandFile = generateCommandFile(registry, "AL", alCommands, codegenOptions, null)
    File("$packageDir/AL.java").writeText(render(alcCommandFile))
    val alCommandFile = generateCommandFile(registry, "ALC", alcCommands, codegenOptions, null)
    File("$packageDir/ALC.java").writeText(render(alCommandFile))
}
