package club.doki7.babel.drv

import club.doki7.babel.codegen.CodegenOptions
import club.doki7.babel.codegen.generateCommandFile
import club.doki7.babel.codegen.generateConstants
import club.doki7.babel.extract.webgpu.extractWebGPURegistry
import club.doki7.babel.registry.Command
import club.doki7.babel.registry.Entity
import club.doki7.babel.util.render
import java.io.File
import kotlin.collections.sortedBy
import kotlin.io.writeText

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

    // 生成常量文档并保存
    val constantsDoc = generateConstants(webgpuRegistry, codegenOptions)
    val constantsFile = File("$packageDir/${codegenOptions.constantClassName}.java")
    // 创建文件所在的目录
    constantsFile.parentFile.mkdirs() // 如果目录不存在，则创建
    constantsFile.writeText(render(constantsDoc))

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