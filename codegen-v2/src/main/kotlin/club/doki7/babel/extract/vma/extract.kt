package club.doki7.babel.extract.vma

import club.doki7.babel.registry.*
import java.util.logging.Logger
import kotlin.io.path.Path

private val inputDir = Path("codegen-v2/input")
internal val log = Logger.getLogger("c.d.b.extract.vma")

fun extractVMAHeader(): Registry<EmptyMergeable> {
    val headerFile = inputDir.resolve("vk_mem_alloc.h")
        .toFile()
        .readText();

    val r = parseVMAHeader(headerFile)
    r.renameEntities()
    return r
}

private fun parseVMAHeader(fileContent: String): Registry<EmptyMergeable> {
    val constants = mutableMapOf<String, Constant>()
    val commands = mutableMapOf<String, Command>()
    val opaqueTypedefs = mutableMapOf<String, OpaqueTypedef>()
    val handles = mutableMapOf<String, OpaqueHandleTypedef>()
    val structs = mutableMapOf<String, Structure>()
    val functionTypedefs = mutableMapOf<String, FunctionTypedef>()
    val bitmasks = mutableMapOf<String, Bitmask>()
    val enums = mutableMapOf<String, Enumeration>()

    val lines = fileContent.split("\n").map(String::trim)

    var index = 0
    while (index < lines.size) {
        if (lines[index] == "#ifdef VMA_IMPLEMENTATION") {
            break
        }
    }

    val r = Registry(
        aliases = mutableMapOf(),
        bitmasks = mutableMapOf(),
        constants = mutableMapOf(),
        commands = mutableMapOf(),
        enumerations = mutableMapOf(),
        functionTypedefs = mutableMapOf(),
        opaqueHandleTypedefs = mutableMapOf(),
        opaqueTypedefs = mutableMapOf(),
        structures = mutableMapOf(),
        unions = mutableMapOf(),
        ext = EmptyMergeable()
    )

    return r
}
