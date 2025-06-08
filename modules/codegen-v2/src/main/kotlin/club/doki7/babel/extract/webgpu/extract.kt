package club.doki7.babel.extract.webgpu

import club.doki7.babel.cdecl.parseType
import club.doki7.babel.cdecl.toType
import club.doki7.babel.registry.*
import club.doki7.babel.util.asSequence
import club.doki7.babel.util.getAttributeText
import club.doki7.babel.util.getElementSeq
import club.doki7.babel.util.parseYML
import club.doki7.babel.util.query
import org.w3c.dom.Element
import java.util.logging.Logger
import kotlin.io.path.Path



private val inputDir = Path("codegen-v2/input")
internal val log = Logger.getLogger("c.d.b.extract.webgpu")


fun main() {
    val ymlString = inputDir.resolve("webgpu.yml")
        .toFile()
        .readText()
    val parsedYML = ymlString.parseYML()
    parsedYML.extractEntities()
}


fun extractWebGPURegistry(): Registry<EmptyMergeable> {
    val ymlString = inputDir.resolve("webgpu.yml")
        .toFile()
        .readText()
    val parsedYML = ymlString.parseYML()
    return parsedYML.extractEntities()
}

private fun Map<String, Any>.extractEntities(): Registry<EmptyMergeable> {
    val constants = mutableMapOf<Identifier, Constant>()
    this.query("constants").forEach {
        val name = it["name"] as String
        val value = it["value"] as String
        val doc = it["doc"] as String

        val expr = value

        val type =  IdentifierType("int32_t")

        val constant = Constant(name.intern(), type, expr)

        constants[name.intern()] = constant
    }
    return Registry(
        aliases = mutableMapOf(),
        bitmasks = mutableMapOf(),
        constants = constants,
        commands = mutableMapOf(),
        enumerations = mutableMapOf(),
        functionTypedefs = mutableMapOf(),
        opaqueHandleTypedefs = mutableMapOf(),
        opaqueTypedefs = mutableMapOf(),
        structures = mutableMapOf(),
        unions = mutableMapOf(),
        ext = EmptyMergeable()
    )
}
