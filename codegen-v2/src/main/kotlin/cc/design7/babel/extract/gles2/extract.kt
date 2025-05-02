package cc.design7.babel.extract.gles2

import cc.design7.babel.extract.parseType
import cc.design7.babel.extract.tokenize
import cc.design7.babel.registry.Bitflag
import cc.design7.babel.registry.Bitmask
import cc.design7.babel.registry.Command
import cc.design7.babel.registry.Constant
import cc.design7.babel.registry.Entity
import cc.design7.babel.registry.IdentifierType
import cc.design7.babel.registry.Param
import cc.design7.babel.registry.Registry
import cc.design7.babel.registry.Type
import cc.design7.babel.registry.intern
import cc.design7.babel.util.asSequence
import cc.design7.babel.util.getAttributeText
import cc.design7.babel.util.getElementSequence
import cc.design7.babel.util.parseDecOrHex
import cc.design7.babel.util.parseXML
import cc.design7.babel.util.query
import org.w3c.dom.Element
import kotlin.io.path.Path

private val inputDir = Path("codegen-v2/input")

fun extractRawGLESRegistry(): Registry<GLESRegistryExt> {
    return inputDir.resolve("gl.xml")
        .toFile()
        .readText()
        .parseXML()
        .extractEntities()
}

private fun Element.extractEntities(): Registry<GLESRegistryExt> {
    val e = this

    val bitmasks = e.query("enums[@type='bitmask']")
        .map(::extractEnums)
        .map { it.toBitmask() }
        .associateByTo(mutableMapOf()) { it.name }

    val commands = e.query("commands/command")
        .map(::extractCommand)
        .associateByTo(mutableMapOf()) { it.name }

    val constants = e.query("enums[not(@type)]")
        .map(::extractEnums)
        .flatMap { it.fields.map { field -> field.toConstant() } }
        .associateByTo(mutableMapOf()) { it.name }

    // feature
    val bitflags = bitmasks.asSequence()
        .flatMap { it.value.bitflags }
        .associateBy { it.name }

    val featureElement = findGLES2Feature(e)
    val requires = featureElement.getElementSequence(TAG_REQUIRE)
    val enumRequirements = requires.flatMap {
        extractEnumRequire(it) { name ->
            val id = name.intern()
            bitflags[id] ?: constants[id]
        }
    }.associateBy { it.name }

    val commandRequirements = requires.flatMap {
        extractCommandRequire(it) { name ->
            val id = name.intern()
            commands[id]
        }
    }.associateByTo(mutableMapOf()) { it.name }

    val ext = GLESRegistryExt(enumRequirements, commandRequirements)
    return Registry(
        aliases = mutableMapOf(),
        bitmasks = bitmasks,
        constants = constants,
        commands = commandRequirements,
        enumerations = mutableMapOf(),
        functionTypedefs = mutableMapOf(),
        opaqueHandleTypedefs = mutableMapOf(),
        opaqueTypedefs = mutableMapOf(),
        structures = mutableMapOf(),
        unions = mutableMapOf(),
        ext = ext
    )
}

private const val ATTR_GROUP = "group"
private const val ATTR_VALUE = "value"
private const val ATTR_NAME = "name"
private const val ATTR_API = "api"
private const val TAG_PROTO = "proto"
private const val TAG_NAME = "name"
private const val TAG_PARAM = "param"
private const val TAG_FEATURE = "feature"
private const val TAG_ENUM = "enum"
private const val TAG_COMMAND = "command"
private const val TAG_REQUIRE = "require"

/// region enum

private data class EnumDecl(val name: String?, val fields: List<EnumField>)
private data class EnumField(val name: String, val value: String)

/**
 * @param e in form of `<enums namespace="..." group="...">`
 */
private fun extractEnums(e: Element): EnumDecl {
    val group = e.getAttributeText(ATTR_GROUP)
    val fields = e.getElementSequence(TAG_ENUM)
        .map(::extractEnum)

    return EnumDecl(group, fields.toList())
}

/**
 * @param e in form of `<enum value="..." name="..." group="...">`
 */
private fun extractEnum(e: Element): EnumField {
    val name = e.getAttributeText(ATTR_NAME)!!
    val value = e.getAttributeText(ATTR_VALUE)!!

    return EnumField(name, value)
}

/// endregion enum

/// region bitmask

private fun EnumDecl.toBitmask(): Bitmask {
    if (this.name == null) throw IllegalArgumentException()

    return Bitmask(
        name = this.name,
        bitwidth = null,
        bitflags = this.fields.mapTo(mutableListOf()) { it.toBitflag() }
    )
}

private fun EnumField.toBitflag(): Bitflag {
    return Bitflag(name = this.name, value = this.value.parseDecOrHex().toBigInteger())
}

/// endregion bitmask

/// region constant

private const val TYPE_ENUM = "GLenum"

private fun EnumField.toConstant(): Constant {
    return Constant(
        name = this.name,
        type = IdentifierType(TYPE_ENUM),
        expr = this.value
    )
}

/// endregion constants

/// region command

/**
 * Extract the text of given element without `<name>` tag.
 */
private fun getElementTextWithoutName(e: Element): String {
    return e.childNodes.asSequence()
        .filter { !(it is Element && it.tagName == TAG_NAME) }
        .joinToString(separator = " ") { it.textContent.trim() }
}

/**
 * Extract type and name from element of form `some_type <name>some_name</name>`
 */
private fun extractTypeJudgement(e: Element): Pair<String, Type> {
    val name = e.getElementsByTagName(TAG_NAME).item(0).textContent.trim()
    val rawType = getElementTextWithoutName(e)
    val type = parseType(tokenize(rawType), 0).first
    return name to type
}

private fun extractCommand(e: Element): Command {
    // a proto is supposed to be: `<proto>return_type <name>command_name</name></proto>`
    val rawProto = e.getElementsByTagName(TAG_PROTO).item(0) as Element
    val (name, type) = extractTypeJudgement(rawProto)

    val params = e.getElementSequence(TAG_PARAM)
        .map(::extractParam)
        .toMutableList()

    return Command(
        name = name,
        params = params,
        result = type,
        successCodes = null,
        errorCodes = null,
    )
}

/**
 * @param e in form of `<param someAttr>some_type <name>some_name</name></param>`
 */
private fun extractParam(e: Element): Param {
    val (name, type) = extractTypeJudgement(e)
    return Param(name, type, null, null, true)
}

/// endregion command

/// region feature requirement

private fun findGLES2Feature(e: Element): Element {
    return e.getElementSequence(TAG_FEATURE).find {
        it.getAttributeText(ATTR_API) == "gles2"
    } ?: throw RuntimeException("GLES2 feature not found")
}

private fun extractEnumRequire(e: Element, enumGetter: (String) -> Entity?): Sequence<Entity> {
    return extractRequire(e, TAG_ENUM, enumGetter)
}

private fun extractCommandRequire(e: Element, commandGetter: (String) -> Command?): Sequence<Command> {
    return extractRequire(e, TAG_COMMAND, commandGetter)
}

/**
 * @param e <require> node
 */
private fun <E> extractRequire(e: Element, tag: String, getter: (String) -> E?): Sequence<E> {
    return e.getElementSequence(tag).map {
        val name = it.getAttributeText(ATTR_NAME)!!
        getter(name) ?: throw RuntimeException("TODO")   // TODO
    }
}

/// endregion feature requirement

fun main() {
    extractRawGLESRegistry()
}
