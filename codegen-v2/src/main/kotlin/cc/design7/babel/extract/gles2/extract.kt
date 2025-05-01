package cc.design7.babel.extract.gles2

import cc.design7.babel.registry.Bitflag
import cc.design7.babel.registry.Bitmask
import cc.design7.babel.registry.Command
import cc.design7.babel.registry.Constant
import cc.design7.babel.registry.Entity
import cc.design7.babel.registry.Param
import cc.design7.babel.registry.Registry
import cc.design7.babel.registry.Type
import cc.design7.babel.registry.intern
import cc.design7.babel.util.asSequence
import cc.design7.babel.util.getAttributeText
import cc.design7.babel.util.getElementList
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
  
  val bitflags = bitmasks.asSequence()
    .flatMap { it.value.bitflags }
    .associateBy { it.name }
  
  val commands = e.query("commands/command")
    .map(::extractCommand)
    .associateByTo(mutableMapOf()) { it.name }
  
  val constants = e.query("enums[not(@type)]")
    .map(::extractEnums)
    .flatMap { it.fields.map { field -> field.toConstant() } }
    .associateByTo(mutableMapOf()) { it.name }
  
  val featureElement = findGLES2Feature(e)
  val enumRequirements = extractEnumRequirements(featureElement) {
    val id = it.intern()
    bitflags[id] ?: constants[id]
  }.associateBy { it.name }
  
  val commandRequirements = extractCommandRequirements(featureElement) {
    val id = it.intern()
    commands[id]
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

/// region enum

private data class EnumDecl(val name: String?, val fields: List<EnumField>)
private data class EnumField(val name: String, val value: String)

/**
 * @param e in form of `<enums namespace="..." group="...">`
 */
private fun extractEnums(e: Element): EnumDecl {
  val group = e.getAttributeText(ATTR_GROUP)
  // TODO: try laziness, such as Flow or Sequence
  val fields = e.getElementList("enum")
    .map(::extractEnum)
  
  return EnumDecl(group, fields)
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

private fun EnumField.toConstant(): Constant {
  return Constant(
    name = this.name,
    type = TODO("I don't know"),
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
    .filter { ! (it is Element && it.tagName == TAG_NAME) }
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
  
  val params = e.getElementsByTagName(TAG_PARAM).asSequence()
    .map { it as Element }
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
  return e.query(TAG_FEATURE).find {
    it.getAttributeText(ATTR_API) == "gles2"
  } ?: throw RuntimeException("GLES2 feature not found")
}

private inline fun extractEnumRequirements(e: Element, enumGetter: (String) -> Entity?): List<Entity> {
  return extractRequirements(e, TAG_ENUM, enumGetter)
}

private inline fun extractCommandRequirements(e: Element, commandGetter: (String) -> Command?) : List<Command> {
  return extractRequirements(e, TAG_COMMAND, commandGetter)
}

/**
 * @param e a list of requirements
 */
private inline fun <E> extractRequirements(e: Element, tag: String, getter: (String) -> E?): List<E> {
  return e.query(tag).map {
    val name = it.getAttributeText(ATTR_NAME)!!
    getter(name) ?: throw RuntimeException("TODO")   // TODO
  }
}

/// endregion feature requirement

fun main() {
  extractRawGLESRegistry()
}