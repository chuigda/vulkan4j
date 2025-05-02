package cc.design7.babel.extract.gles2

import cc.design7.babel.extract.parseType
import cc.design7.babel.extract.tokenize
import cc.design7.babel.registry.*
import cc.design7.babel.util.asSequence
import cc.design7.babel.util.getAttributeText
import cc.design7.babel.util.getElementSeq
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

    val commands = e.query("commands/command")
        .map(::extractCommand)
        .associateByTo(mutableMapOf()) { it.name }

    val constants = mutableMapOf<Identifier, Constant>()
    e.query("enums/enum").forEach { extractEnumConstant(it, constants) }

    val featureElement = findGLES2Feature(e)
    val requires = featureElement.getElementSeq(TAG_REQUIRE)
    val enumRequirements = requires.flatMap {
        extractEnumRequire(it) { name -> constants[name.intern()] }
    }.associateBy { it.name }

    val commandRequirements = requires.flatMap {
        extractCommandRequire(it) { name ->  commands[name.intern()] }
    }.associateByTo(mutableMapOf()) { it.name }

    val ext = GLESRegistryExt(enumRequirements, commandRequirements)
    return Registry(
        aliases = mutableMapOf(),
        bitmasks = mutableMapOf(),
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

/// region constant

/**
 * @param e in form of `<enum value="..." name="...">`
 */
private fun extractEnumConstant(e: Element, constants: MutableMap<Identifier, Constant>) {
    val name = e.getAttributeText(ATTR_NAME)!!
    val value = e.getAttributeText(ATTR_VALUE)!!

    constants.putEntityIfAbsent(Constant(name, IdentifierType("GLenum"), value))
}

/// endregion constant

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

    val params = e.getElementSeq(TAG_PARAM)
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
    return e.getElementSeq(TAG_FEATURE).find {
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
    return e.getElementSeq(tag).map {
        val name = it.getAttributeText(ATTR_NAME)!!
        getter(name) ?: error("Cannot find $tag with name $name")
    }
}

/// endregion feature requirement
