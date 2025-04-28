package main

import codegen.*
import extract.extractVMAHeader
import java.io.File

fun main() {
    val registry = extractVMAHeader(File("codegen/input/vk_mem_alloc.h").readText())
    registry.constantClassName = "VMAConstants"

    val vkImport = listOf(
        "tech.icey.vk4j.bitmask.*",
        "tech.icey.vk4j.datatype.*",
        "tech.icey.vk4j.enumtype.*",
        "tech.icey.vk4j.handle.*"
    )

    // VMA does not have such constant according to my inspection
//    val constants = generateConstants(
//        "tech.icey.vma",
//        registry.constantClassName,
//        registry.constants.values.toList()
//    )
//    File("vma/src/main/java/tech/icey/vma/${registry.constantClassName}.java").writeText(constants)

    for (struct in registry.structures) {
        val generated = generateStructure(
            registry,
            "tech.icey.vma",
            struct.value,
            vkImport
        )
        File("vma/src/main/java/tech/icey/vma/datatype/${struct.key}.java").writeText(generated)
    }

    for (handle in registry.handles) {
        val generated = generateHandle("tech.icey.vma", handle.key)
        File("vma/src/main/java/tech/icey/vma/handle/${handle.key}.java").writeText(generated)
    }

    for (bitmask in registry.bitmasks) {
        if (bitmask.key == "VmaVirtualAllocationCreateFlags") {
            continue
        }

        val generated = generateBitmask("tech.icey.vma", bitmask.value)
        File("vma/src/main/java/tech/icey/vma/bitmask/${bitmask.key}.java").writeText(generated)
    }

    for (enum in registry.enumerations) {
        val generated = generateEnum("tech.icey.vma", enum.value)
        File("vma/src/main/java/tech/icey/vma/enumtype/${enum.key}.java").writeText(generated)
    }

    val functions = generateCommandClassFile(
        registry,
        registry.commands.values.toList(),
        "tech.icey.vma",
        "tech.icey.vma",
        "VMA",
        vkImport
    )
    File("vma/src/main/java/tech/icey/vma/VMA.java").writeText(functions)
}
