package club.doki7.babel.extract.vulkan

import club.doki7.babel.registry.ArrayType
import club.doki7.babel.registry.IdentifierType
import club.doki7.babel.registry.Member
import club.doki7.babel.registry.Registry
import club.doki7.babel.registry.Structure
import club.doki7.babel.registry.intern
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

    log.info("手动添加类型 NvSciSyncFence")
    val renamedNvSciSyncFence = "NvSciSyncFence".intern()
    renamedNvSciSyncFence.rename("NvSciSyncFenceVKREF")
    filteredRegistry.structures.put(
        renamedNvSciSyncFence,
        Structure(
            name = renamedNvSciSyncFence,
            members = listOf(Member(
                name = "payload",
                type = ArrayType(IdentifierType("uint64_t"), "6".intern()),
                values = null,
                len = null,
                altLen = null,
                optional = false,
                bits = null
            ))
        )
    )

    log.info("完成")
    return filteredRegistry
}
