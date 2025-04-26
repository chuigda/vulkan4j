package main

import extract.extractVulkanRegistry
import java.io.File

fun main() {
    val registry = extractVulkanRegistry(File("codegen/input/vk.xml").readText())

    println(registry)
}
