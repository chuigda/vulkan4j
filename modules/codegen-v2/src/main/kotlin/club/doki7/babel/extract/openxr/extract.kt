package club.doki7.babel.extract.openxr

import club.doki7.babel.cdecl.parseType
import club.doki7.babel.cdecl.toType
import club.doki7.babel.registry.Bitflag
import club.doki7.babel.registry.Bitmask
import club.doki7.babel.registry.Entity
import club.doki7.babel.registry.EnumVariant
import club.doki7.babel.registry.Enumeration
import club.doki7.babel.registry.Identifier
import club.doki7.babel.registry.IdentifierType
import club.doki7.babel.registry.Member
import club.doki7.babel.registry.Structure
import club.doki7.babel.registry.Typedef
import club.doki7.babel.registry.intern
import club.doki7.babel.util.asSequence
import club.doki7.babel.util.attrs
import club.doki7.babel.util.children
import club.doki7.babel.util.getElementSeq
import club.doki7.babel.util.getFirstElement
import club.doki7.babel.util.parseDecOrHex
import club.doki7.babel.util.parseXML
import club.doki7.babel.util.query
import org.w3c.dom.Element
import kotlin.io.path.Path

private val inputDir = Path("codegen-v2/input")

fun extractOpenXRRegistry() {
    val element = inputDir.resolve("xr.xml")
        .toFile()
        .readText()
        .parseXML()
        .extractEntities()
}

private fun <T : Entity> Sequence<T>.associate(): MutableMap<Identifier, T> {
    return associateByTo(mutableMapOf(), Entity::name)
}

private fun Element.extractEntities() {
    val e = this

    // TODO: parse <type requires="...">

    val basetypes = e.query("types/type[@category=basetype]")
        .map(::extractBasetype)

    // TODO: do we need this? perhaps this is implied by [bitmasks]
//    val bitmaskTypes = e.query("types/type[@category=bitmask]")
//        .map(::extractBitmaskType)

    val typedefs = basetypes
        .associate()

    val structs = e.query("types/type[@category=struct and not(@alias)]")
    val structAliases = e.query("types/type[@category=struct and @alias]")

    // TODO: extract enum API Constants
    val enums = e.query("enums[@type=enum]")
        .map(::extractEnumeration)
        .associate()

    val bitmasks = e.query("enums[@type=bitmask]")
        .map(::extractBitmask)
        .associate()

}

private const val XR_DEFINE_ATOM = "XR_DEFINE_ATOM"

private fun XR_DEFINE_ATOM(value: String): Typedef {
    return Typedef(value, IdentifierType("uint64_t"))
}

/**
 * @param e in form `<type>typedef <type>TYPE</type> <name>NAME</name></type>`
 */
private fun extractTrivialTypedef(e: Element): Typedef {
    val type = e.getFirstElement("type")!!.textContent
    val name = e.getFirstElement("name")!!.textContent
    return Typedef(name, parseType(type).toType())
}

/**
 * @param e in form `<type category="basetype">...<type>TYPE_OR_MACRO</type>...<name>NAME</name>...</type>`
 */
private fun extractBasetype(e: Element): Typedef {
    val typeOrMacro = e.getFirstElement("type")!!.textContent
    val name = e.getFirstElement("name")!!.textContent

    // TODO: handle XR_DEFINE_OPAQUE_64
    return if (typeOrMacro == XR_DEFINE_ATOM) {
        XR_DEFINE_ATOM(name)
    } else {
        extractTrivialTypedef(e)
    }
}

/**
 * @param e in form `<type bitvalues="BIT_VALUES" category="bitmask">typedef <type>XrFlags64</type> <name>BIT_VALUES</name></type>`
 */
private fun extractBitmaskType(e: Element): Typedef {
    return extractTrivialTypedef(e)
}

/**
 * @param e in form `<type category="handle" parent="MAY_OR_MAY_NOT_SET"><type>XR_DEFINE_HANDLE</type>(<name>NAME</name>)</type>`
 */
private fun extractHandle(e: Element) {
    TODO()
}

/**
 * TODO: few struct decl provide comments, should we extract them?
 *
 * @param e in form `<type category="struct" name="NAME">MEMBER+</type>`
 */
private fun extractStruct(e: Element): Structure {
    TODO()
}

/**
 * @param e in form `<type category="struct" name="NAME" alias="ALIAS"/>`
 */
private fun extractStructAlias(e: Element) {
    TODO()
}

/**
 * Extract the text of given element without `<name>` tag.
 */
private fun getElementTextWithoutName(e: Element): String {
    return e.childNodes.asSequence()
        .filter { !(it is Element && it.tagName == "name") }
        .joinToString(separator = " ") { it.textContent.trim() }
}

/**
 * @param e in form `<member values="..." optional="..." len="...">... <name>NAME</name></member>`
 */
private fun extractMember(e: Element): Member {
    val values by e.attrs
    val optional by e.attrs
    val len by e.attrs
    val name by e.children
    val nameText = name!!.textContent
    val type = parseType(getElementTextWithoutName(e)).toType()

    // len is a comma separated (identifier | "null-terminated") list
    val lenList = len
        ?.split(',')
        ?.map { it.intern() }

    return Member(
        nameText,
        type,
        values?.intern(),
        lenList,
        null,
        optional == "true",
        null
    )
}

/**
 * @param e in form `<enum value="INTEGER" name="NAME" comment-"..." />`
 */
private fun extractEnumVariant(e: Element): EnumVariant {
    val value by e.attrs
    val name by e.attrs

    return EnumVariant(name!!, value!!.parseDecOrHex())
}

/**
 * @param e in form `<enums name="NAME" type="enum" comment="...">ENUM*</enums>`
 */
private fun extractEnumeration(e: Element): Enumeration {
    val name by e.attrs
    val enums = e.getElementSeq("enum")
        .map(::extractEnumVariant)
        .toMutableList()

    return Enumeration(name!!, enums)
}

/**
 * @param e in form `<enum bitpos="INTEGER" name="NAME" comment="..." />`
 */
private fun extractBitflag(e: Element): Bitflag {
    val bitpos by e.attrs
    val name by e.attrs
    return Bitflag(name!!, bitpos!!.toBigInteger())
}

/**
 * @param e in form `<enums name="NAME" type="bitmask" comment="...">BITFLAG*</enums>`
 */
private fun extractBitmask(e: Element): Bitmask {
    val name by e.attrs
    val flags = e.getElementSeq("enum")
        .map(::extractBitflag)
        .toMutableList()

    // TODO: i am not sure whether if bitwidth should be null
    return Bitmask(name!!, null, flags)
}