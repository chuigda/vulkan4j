package club.doki7.babel.drv

import club.doki7.babel.codegen.CodegenOptions
import club.doki7.babel.codegen.generateBitmask
import club.doki7.babel.codegen.generateCommandFile
import club.doki7.babel.codegen.generateConstants
import club.doki7.babel.codegen.generateEnumeration
import club.doki7.babel.codegen.generateFunctionTypedefs
import club.doki7.babel.codegen.generateHandle
import club.doki7.babel.codegen.generateStructure
import club.doki7.babel.codegen.generateStructureInterface
import club.doki7.babel.extract.openxr.OpenXRRegistryExt
import club.doki7.babel.extract.openxr.extractOpenXRRegistry
import club.doki7.babel.extract.vulkan.VulkanRegistryExt
import club.doki7.babel.extract.vulkan.extractVulkanRegistry
import club.doki7.babel.extract.vulkanAdditionalRegistry
import club.doki7.babel.registry.Bitmask
import club.doki7.babel.registry.EmptyMergeable
import club.doki7.babel.registry.Entity
import club.doki7.babel.registry.Enumeration
import club.doki7.babel.registry.IMergeable
import club.doki7.babel.registry.OpaqueHandleTypedef
import club.doki7.babel.registry.Registry
import club.doki7.babel.registry.Structure
import club.doki7.babel.util.Doc
import club.doki7.babel.util.render
import club.doki7.babel.util.setupLog
import java.io.File

private const val packageDir = "openxr/src/main/java/club/doki7/openxr"

fun main() {
    setupLog()

    val vulkan = extractVulkanRegistry()
    val vulkanPlus = vulkanAdditionalRegistry()
    openxrMain(vulkan, vulkanPlus, false)
}

internal fun openxrMain(
    vulkanRegistry: Registry<VulkanRegistryExt>,
    vulkanAdditionRegistry: Registry<EmptyMergeable>,
    dryRun: Boolean
): Registry<OpenXRRegistryExt> {
    val reg = extractOpenXRRegistry()

    val opt = CodegenOptions(
        packageName = "club.doki7.openxr",
        extraImport = listOf(),
        constantClassName = "XRConstants",
        functionTypeClassName = "XRFunctionTypes",
        refRegistries = listOf(vulkanRegistry, vulkanAdditionRegistry),
        seeLinkProvider = ::openxrLinkProvider
    )

    // The following are set:
    // aliases
    // bitmasks
    // constants
    // commands
    // enumerations
    // functionTypedefs
    // opaqueHandleTypedefs
    // structures

    val context = CodegenContext(packageDir, reg, opt, dryRun)

    with(context) {
        generateConstants()
        generateFunctionTypes()
        generateBitmasks()
        generateEnumerations()
        generateStructures()
        generateOpaqueHandles()
        generateCommands()
    }

    return reg
}

fun openxrLinkProvider(e: Entity): String {
    val name = e.name.original
    // TODO: open xr doesn't have 'latest' version
    return "<a href=\"https://registry.khronos.org/OpenXR/specs/1.1/man/html/$name.html\"><code>$name</code></a>"
}

/**
 * @param dryRun for testing, only generate code, no writing
 */
data class CodegenContext<T : IMergeable<T>>(
    val packageDir: String,
    val registry: Registry<T>,
    val codegenOptions: CodegenOptions,
    val dryRun: Boolean,
) {
    private fun file(path: String): File {
        return File("$packageDir/$path")
    }

    private fun Doc.writeTo(relativePath: String) {
        if (!dryRun) {
            file(relativePath).apply {
                parentFile.mkdirs()
            }.writeText(render(this))
        }
    }

    fun generateConstants() {
        generateConstants(registry, codegenOptions)
            .writeTo("${codegenOptions.constantClassName}.java")
    }

    fun generateFunctionTypes() {
        generateFunctionTypedefs(registry, codegenOptions).writeTo("${codegenOptions.functionTypeClassName}.java")
    }

    fun generateBitmask(bitmask: Bitmask) {
        generateBitmask(bitmask, codegenOptions).writeTo("bitmask/${bitmask.name}.java")
    }

    fun generateBitmasks() {
        registry.bitmasks.values.forEach(::generateBitmask)
    }

    fun generateEnumeration(enumeration: Enumeration) {
        generateEnumeration(registry, enumeration, codegenOptions).writeTo("enumtype/${enumeration.name}.java")
    }

    fun generateEnumerations() {
        registry.enumerations.values.forEach(::generateEnumeration)
    }

    fun generateStructure(structure: Structure) {
        generateStructureInterface(structure, codegenOptions)
            .writeTo("datatype/I${structure.name}.java")

        generateStructure(registry, structure, false, codegenOptions)
            .writeTo("datatype/${structure.name}.java")
    }

    fun generateStructures() {
        registry.structures.values.forEach(::generateStructure)
    }

    fun generateOpaqueHandle(handle: OpaqueHandleTypedef) {
        generateHandle(handle, codegenOptions)
            .writeTo("handle/${handle.name}.java")
    }

    fun generateOpaqueHandles() {
        registry.opaqueHandleTypedefs.values.forEach(::generateOpaqueHandle)
    }

    fun generateCommands() {
        generateCommandFile(
            registry,
            "XR",
            registry.commands.values.toList(),
            codegenOptions,
            true,
            null
        ).writeTo("XR.java")
    }
}
