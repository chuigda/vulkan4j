package cc.design7.babel.drv

import cc.design7.babel.codegen.CodegenOptions
import cc.design7.babel.codegen.generateConstants
import cc.design7.babel.extract.vulkan.extractVulkanRegistry
import cc.design7.babel.registry.Bitmask
import cc.design7.babel.registry.Command
import cc.design7.babel.registry.Constant
import cc.design7.babel.registry.Entity
import cc.design7.babel.registry.Enumeration
import cc.design7.babel.registry.Structure
import cc.design7.babel.util.render
import java.io.File

internal fun vulkanMain() {
    val vulkanRegistry = extractVulkanRegistry()

    val codegenOptions = CodegenOptions(
        packageName = "cc.design7.vulkan",
        extraImport = mutableListOf(),
        constantClassName = "VkConstants",
        refRegistries = emptyList(),
        seeLinkProvider = ::vulkanDocLinkProvider
    )

    val constantsDoc = generateConstants(vulkanRegistry, codegenOptions)
    File("vulkan/src/main/java/cc/design7/vulkan/${codegenOptions.constantClassName}.java")
        .writeText(render(constantsDoc))
}

private fun vulkanDocLinkProvider(entity: Entity) = when(entity) {
    is Bitmask, is Command, is Constant, is Enumeration, is Structure
        -> "https://registry.khronos.org/vulkan/specs/latest/man/html/${entity.name.original}.html"
    else -> null
}
