package club.doki7.babel.extract.webgpu

import club.doki7.babel.extract.toPascalCase
import club.doki7.babel.registry.*
import club.doki7.babel.util.parseYML
import club.doki7.babel.util.query
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
    val constants = extractConstants()
    val enumerations = extractEnumerations()
    return Registry(
        aliases = mutableMapOf(),
        bitmasks = mutableMapOf(),
        constants = constants,
        commands = mutableMapOf(),
        enumerations = enumerations,
        functionTypedefs = mutableMapOf(),
        opaqueHandleTypedefs = mutableMapOf(),
        opaqueTypedefs = mutableMapOf(),
        structures = mutableMapOf(),
        unions = mutableMapOf(),
        ext = EmptyMergeable()
    )
}
private fun Map<String, Any>.extractEnumerations(): MutableMap<Identifier, Enumeration> {
    val enumerations = mutableMapOf<Identifier, Enumeration>()

    this.query("enums").forEach { rawEnum ->
        val name = rawEnum["name"] as String
        val entries = rawEnum["entries"] as? List<Map<String, Any>> ?: emptyList()
        val variants: MutableList<EnumVariant>  = mutableListOf()
        entries.forEachIndexed { index, entry ->
            if (entry == null) return@forEachIndexed  // 直接跳过 null entry

            val entryName = entry["name"] as? String ?: return@forEachIndexed
            val value = index.toLong()
            variants.add(EnumVariant(name.uppercase() + "_" + entryName.uppercase(), value))
        }
        variants.add(EnumVariant(name.uppercase()+"_"+"Force32".uppercase(), 0x7FFFFFFF))

        val enumeration = Enumeration(name.toPascalCase().intern(),variants)
        enumerations.putEntityIfAbsent(enumeration)
    }

    return enumerations
}

private fun Map<String, Any>.extractConstants(): MutableMap<Identifier, Constant> {
    val constants = mutableMapOf<Identifier, Constant>()

    constants.putEntityIfAbsent(Constant("TRUE", IdentifierType("int"), "0x1"))
    constants.putEntityIfAbsent(Constant("FALSE", IdentifierType("int"), "0x0"))

    this.query("constants").forEach {
        val name = it["name"] as String
        val value = it["value"] as String
        val doc = it["doc"] as String

        val expr = value.uppercase()
        val mapping = constantTypeMappings[expr]
        val mappingType = mapping?.javaType
        val mappingValue = mapping?.javaExpression

        val constant = if (mappingType != null) {
            Constant(name.intern(), mappingType, mappingValue.toString())
        } else {
            println("$expr 没有在映射表中找到，可能是用户自定义宏")
            Constant(name.intern(), IdentifierType("void"), "null")
        }

        constants.putEntityIfAbsent(constant)
    }

    return constants
}