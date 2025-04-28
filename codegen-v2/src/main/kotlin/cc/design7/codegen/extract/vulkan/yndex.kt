package cc.design7.codegen.extract.vulkan

import cc.design7.codegen.registry.Registry
import cc.design7.codegen.util.setupLog
import java.util.logging.Logger

internal val log = Logger.getLogger("c.d.c.e.vulkan")

fun extractVulkanRegistry(): Registry<VulkanRegistryExt> {
    log.info("抽取原始注册表")
    val rawRegistry = extractRawVulkanRegistry()

    log.info("过滤不支持的实体")
    val filteredRegistry = rawRegistry.filterEntities()

    log.info("完成")
    return filteredRegistry
}

fun main() {
    setupLog()

    extractVulkanRegistry()
}
