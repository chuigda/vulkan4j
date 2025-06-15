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
import club.doki7.babel.extract.webgpu.extractWebGPURegistry
import club.doki7.babel.registry.Bitmask
import club.doki7.babel.registry.Command
import club.doki7.babel.registry.Constant
import club.doki7.babel.registry.Entity
import club.doki7.babel.registry.Enumeration
import club.doki7.babel.registry.FunctionTypedef
import club.doki7.babel.registry.IdentifierType
import club.doki7.babel.registry.OpaqueHandleTypedef
import club.doki7.babel.registry.Registry
import club.doki7.babel.registry.Structure
import club.doki7.babel.registry.tryFindIdentifierType
import club.doki7.babel.util.render
import java.io.File


private const val packageDir = "webgpu/src/main/java/club/doki7/webgpu"

fun main() {
    webgpuMain()
}

fun webgpuMain() {
    val webgpuRegistry = extractWebGPURegistry()

    val codegenOptions = CodegenOptions(
        packageName = "club.doki7.webgpu",
        extraImport = listOf(),
        constantClassName = "WebGPUConstants",
        functionTypeClassName = "WebGPUFunctionTypes",
        refRegistries = emptyList()
    )


    val constantsDoc = generateConstants(webgpuRegistry, codegenOptions)
    File("$packageDir/${codegenOptions.constantClassName}.java")
        .safeWrite(render(constantsDoc))

    val functionTypeDoc = generateFunctionTypedefs(webgpuRegistry, codegenOptions)
    File("$packageDir/${codegenOptions.functionTypeClassName}.java")
        .safeWrite(render(functionTypeDoc))

    for (bitmask in webgpuRegistry.bitmasks.values) {
        val bitmaskDoc = generateBitmask(bitmask, codegenOptions)
        File("$packageDir/bitmask/${bitmask.name}.java")
            .safeWrite(render(bitmaskDoc))
    }

    for (enumeration in webgpuRegistry.enumerations.values) {
        val enumerationDoc = generateEnumeration(webgpuRegistry, enumeration, codegenOptions)
        File("$packageDir/enumtype/${enumeration.name}.java")
            .safeWrite(render(enumerationDoc))
    }

    for (structure in webgpuRegistry.structures.values) {
        val structureInterfaceDoc = generateStructureInterface(structure, codegenOptions)
        File("$packageDir/datatype/I${structure.name}.java")
            .safeWrite(render(structureInterfaceDoc))

        val structureDoc = generateStructure(webgpuRegistry, structure, false, codegenOptions)
        File("$packageDir/datatype/${structure.name}.java")
            .safeWrite(render(structureDoc))
    }

    for (union in webgpuRegistry.unions.values) {
        val structureInterfaceDoc = generateStructureInterface(union, codegenOptions)
        File("$packageDir/datatype/I${union.name}.java")
            .safeWrite(render(structureInterfaceDoc))

        val structureDoc = generateStructure(webgpuRegistry, union, true, codegenOptions)
        File("$packageDir/datatype/${union.name}.java")
            .safeWrite(render(structureDoc))
    }

    for (handle in webgpuRegistry.opaqueHandleTypedefs.values) {
        val handleDoc = generateHandle(webgpuRegistry, handle, codegenOptions)
        File("$packageDir/handle/${handle.name}.java")
            .safeWrite(render(handleDoc))
    }
    // 生成命令文档并保存
    val commandsDoc = generateCommandFile(
        webgpuRegistry,
        "WebGPU",
        webgpuRegistry.commands.values.sortedBy { it.name },
        codegenOptions,
        implConstantClass = true,
        subpackage = null
    )
    val commandsFile = File("$packageDir/WebGPU.java")
    // 创建文件所在的目录
    commandsFile.parentFile.mkdirs() // 如果目录不存在，则创建
    commandsFile.writeText(render(commandsDoc))
}
fun File.safeWrite(text: String) {
    parentFile.mkdirs()
    writeText(text)
}
