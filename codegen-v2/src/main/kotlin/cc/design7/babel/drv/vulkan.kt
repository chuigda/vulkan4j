package cc.design7.babel.drv

import cc.design7.babel.codegen.CodegenOptions
import cc.design7.babel.codegen.generateConstants
import cc.design7.babel.extract.vulkan.extractVulkanRegistry
import cc.design7.babel.util.render
import java.io.File

internal fun vulkanMain() {
    val vulkanRegistry = extractVulkanRegistry()

    val codegenOptions = CodegenOptions(
        packageName = "cc.design7.vulkan",
        extraImport = mutableListOf(),
        constantClassName = "VulkanConstants",
        refRegistries = emptyList()
    )

    val constantsDoc = generateConstants(vulkanRegistry, codegenOptions)
    File("vulkan/src/main/java/cc/design7/vulkan/${codegenOptions.constantClassName}.java")
        .writeText(render(constantsDoc))
}
