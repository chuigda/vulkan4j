package club.doki7.babel.extract.vulkan

import club.doki7.babel.registry.Registry
import java.util.logging.Logger

internal val log = Logger.getLogger("c.d.b.extract.vulkan")

fun extractVulkanRegistry(): Registry<VulkanRegistryExt> {
    log.info("抽取原始注册表")
    val rawRegistry = extractRawVulkanRegistry()

    log.info("过滤不支持的实体")
    val filteredRegistry = rawRegistry.filterEntities()

    log.info("扩展实体")
    filteredRegistry.extendEntities()

    log.info("执行重命名")
    filteredRegistry.renameEntities()

    log.info("完成")
    return filteredRegistry
}
