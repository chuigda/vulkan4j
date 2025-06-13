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
    var r = parsedYML.extractEntities()
    r.renameEntities()
    return r
}

private fun Map<String, Any>.extractEntities(): Registry<EmptyMergeable> {
    val constants = mutableMapOf<Identifier, Constant>()

    constants.putEntityIfAbsent(Constant("TRUE", IdentifierType("int"), "0x1"))
    constants.putEntityIfAbsent(Constant("FALSE", IdentifierType("int"), "0x0"))
    this.query("constants").forEach {
        val name = it["name"] as String
        val value = it["value"] as String
        val doc = it["doc"] as String

        val expr = value.uppercase()
        val mapping =  constantTypeMappings[expr]
        val mapping_type = mapping?.javaType
        val mapping_value = mapping?.javaExpression
        if (mapping_type != null) {
            val constant = Constant(name.intern(), mapping_type, mapping_value.toString())
            constants.putEntityIfAbsent(constant)
        } else {
            val constant = Constant(name.intern(), IdentifierType("void"), "null")
            constants.putEntityIfAbsent(constant)
            println("$expr 没有在映射表中找到，可能是用户自定义宏")
        }
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
