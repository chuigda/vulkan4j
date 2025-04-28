package cc.chuigda.codegen.extract.vulkan

import cc.chuigda.codegen.getAttributeText
import cc.chuigda.codegen.query
import cc.chuigda.codegen.registry.Bitmask
import cc.chuigda.codegen.registry.Registry
import cc.chuigda.codegen.getElementList
import cc.chuigda.codegen.getFirstElement
import cc.chuigda.codegen.parseDecOrHex
import cc.chuigda.codegen.parseXML
import cc.chuigda.codegen.registry.ArrayType
import cc.chuigda.codegen.registry.Bitflag
import cc.chuigda.codegen.registry.Command
import cc.chuigda.codegen.registry.Constant
import cc.chuigda.codegen.registry.EnumVariant
import cc.chuigda.codegen.registry.Enumeration
import cc.chuigda.codegen.registry.FunctionTypedef
import cc.chuigda.codegen.registry.Identifier
import cc.chuigda.codegen.registry.IdentifierType
import cc.chuigda.codegen.registry.Member
import cc.chuigda.codegen.registry.OpaqueHandleTypedef
import cc.chuigda.codegen.registry.Param
import cc.chuigda.codegen.registry.PointerType
import cc.chuigda.codegen.registry.Structure
import cc.chuigda.codegen.registry.Type
import cc.chuigda.codegen.registry.Typedef
import cc.chuigda.codegen.registry.intern
import cc.chuigda.codegen.registry.putEntityIfAbsent
import cc.chuigda.codegen.toList
import org.w3c.dom.Element
import org.w3c.dom.Node
import java.io.File
import java.math.BigInteger

fun main() {
    val coreEntities = File("codegen/input/vk.xml").readText()
        .parseXML()
        .extractEntities()
}

private fun Element.extractEntities(): Registry<VulkanRegistryExt> {
    val e = this

    val bitmasks = e.query("enums[@type='bitmask']")
        .map(::extractBitmask)
        .associateBy { it.name }
        .toMutableMap()
    e.query("types/type[@category='bitmask' and not(@alias)]")
        .map(::extractBitmaskType)
        .forEach { bitmasks.putEntityIfAbsent(it) }

    val commands = e.query("commands/command[not(@alias) and (not(@api) or @api='vulkan')]")
        .map(::extractCommand)
        .associateBy { it.name }
        .toMutableMap()

    val commandAliases = e.query("commands/command[@alias]").associate {
        val name = it.getAttributeText("name")!!.intern()
        val alias = it.getAttributeText("alias")!!.intern()
        commands[alias] ?: error("Missing aliased command: $alias")
        name to alias
    }

    return Registry(
        aliases = e.query("types/type[@alias and @name]")
            .map(::extractAlias)
            .associateBy { it.name }
            .toMutableMap(),
        bitmasks = bitmasks,
        constants = e.query("enums[@name='API Constants']/enum[not(@alias)]")
            .map(::extractConstant)
            .associateBy { it.name }
            .toMutableMap(),
        commands = commands,
        enumerations = e.query("enums[@type='enum']")
            .map(::extractEnumeration)
            .associateBy { it.name }
            .toMutableMap(),
        functionTypedefs = e.query("types/type[@category='funcpointer']")
            .map(::extractFunctionTypedef)
            .associateBy { it.name }
            .toMutableMap(),
        opaqueHandleTypedefs = e.query("types/type[@category='handle' and not(@alias)]")
            .map(::extractOpaqueHandleTypedef)
            .associateBy { it.name }
            .toMutableMap(),
        structures = e.query("types/type[@category='struct' and not(@alias)]")
            .map(::extractStructure)
            .associateBy { it.name }
            .toMutableMap(),
        unions = e.query("types/type[@category='union' and not(@alias)]")
            .map(::extractStructure)
            .associateBy { it.name }
            .toMutableMap(),
        extra = VulkanRegistryExt(
            commandAliases = commandAliases,
            versions = e.query("feature[@api]")
                .map(::extractVersion)
                .associateBy { it.name }
                .toMutableMap(),
            extensions = e.query("extensions/extension")
                .map(::extractExtension)
                .associateBy { it.name }
                .toMutableMap()
        )
    )
}

private fun extractBitmask(e: Element) =
    Bitmask(
        name = e.getAttributeText("name")!!
            .replace("FlagBits", "flags"),
        bitflags = e.getElementList("enum")
            .filter { it -> !it.hasAttribute("alias") }
            .map(::extractBitflag)
            .toMutableList()
    ).apply {
        setExtra(VkCommonMetadata(e.getAttributeText("api")))
    }

private fun extractBitmaskType(e: Element) =
    Bitmask(
        name = e.getFirstElement("name")!!.textContent
            .replace("FlagBits", "flags"),
        bitflags = mutableListOf()
    ).apply {
        setExtra(VkCommonMetadata(e.getAttributeText("api")))
    }

private fun extractBitflag(e: Element) =
    Bitflag(
        name = e.getAttributeText("name")!!
            .replace("FlagBits", "flags"),
        value = e.getAttributeText("bitpos")
            ?.parseDecOrHex()
            ?.let { BigInteger.ONE.shiftLeft(it.toInt()) }
            ?: e.getAttributeText("value")!!.parseDecOrHex().toBigInteger()
    ).apply {
        setExtra(VkCommonMetadata(e.getAttributeText("api")))
    }

private fun extractCommand(e: Element): Command {
    val proto = e.getFirstElement("proto")!!
    return Command(
        name = proto.getFirstElement("name")!!.textContent.trim(),
        params = e.query("param")
            .map(::extractParam),
        result = extractType(proto.getFirstElement("type")!!),
        successCodes = e.getAttributeText("successcodes")
            ?.split(",")
            ?.map { it.trim().intern() }
            ?: emptyList(),
        errorCodes = e.getAttributeText("errorcodes")
            ?.split(",")
            ?.map { it.trim().intern() }
            ?: emptyList()
    ).apply {
        setExtra(VkCommonMetadata(e.getAttributeText("api")))
    }
}

private fun extractParam(e: Element): Param {
    val len = e.getAttributeText("len")
    return Param(
        name = e.getFirstElement("name")!!.textContent,
        type = extractType(e.getFirstElement("type")!!),
        len = len?.intern(),
        argLen = len?.split("->")?.map { it.intern() },
        optional = e.getAttributeText("optional")?.startsWith("true") ?: false,
    )
}

private fun extractAlias(e: Element) =
    Typedef(
        name = e.getAttributeText("name")!!,
        type = IdentifierType(e.getAttributeText("alias")!!.intern()),
    ).apply {
        setExtra(VkCommonMetadata(e.getAttributeText("api")))
    }

private fun extractConstant(e: Element): Constant {
    val name = e.getAttributeText("name")!!
    val value = e.getAttributeText("value")!!

    val type = IdentifierType(when {
        name == "VK_TRUE" || name == "VK_FALSE" -> "uint32_t"
        name != "WHOLE_SIZE" && (name.startsWith("VK_MAX") || name.endsWith("SIZE")) -> "size_t"
        value.contains("ULL") -> "uint64_t"
        value.contains("U") -> "uint32_t"
        value.contains(Regex("[fF]$")) -> "float"
        else -> "int32_t"
    })

    return Constant(
        name = name,
        type = type,
        expr = value
    ).apply {
        setExtra(VkCommonMetadata(api=e.getAttributeText("api")))
    }
}

private fun extractEnumeration(e: Element) =
    Enumeration(
        name = e.getAttributeText("name")!!,
        variants =
            e.getElementList("enum")
                .filter { !it.hasAttribute("alias") }
                .map(::extractVariant)
                .toMutableList(),
    ).apply {
        setExtra(VkCommonMetadata(api=e.getAttributeText("api")))
    }

private fun extractVariant(e: Element) =
    EnumVariant(
        name = e.getAttributeText("name")!!,
        value = e.getAttributeText("value")!!.parseDecOrHex().toBigInteger(),
    ).apply {
        setExtra(VkCommonMetadata(api = e.getAttributeText("api")))
    }

private fun extractFunctionTypedef(e: Element) =
    FunctionTypedef(
        name = e.getFirstElement("name")!!.textContent.trim(),
        params = e.getElementList("type").map(::extractType),
        result =
            when (val type = e.textContent.substring(8, e.textContent.indexOf("(VKAPI_PTR")).trim()) {
                "void" -> null
                "void*" -> PointerType(IdentifierType("void".intern()), false)
                "VkBool32" -> IdentifierType("VkBool32".intern())
                "PFN_vkVoidFunction" -> IdentifierType("PFN_vkVoidFunction".intern())
                else -> error("Unsupported function pointer result type ($type).")
            },
    ).apply {
        setExtra(VkCommonMetadata(api = e.getAttributeText("api")))
    }

private fun extractOpaqueHandleTypedef(e: Element) =
    OpaqueHandleTypedef(
        name = e.getFirstElement("name")!!.textContent.trim(),
    ).apply {
        setExtra(VkHandleMetadata(
            api = e.getAttributeText("api"),
            dispatchable = !e.getFirstElement("type")!!
                .textContent
                .contains("NON_DISPATCHABLE")
        ))
    }

private fun extractStructure(e: Element) =
    Structure(
        name = e.getAttributeText("name")!!,
        members = e.getElementList("member").map(::extractMember)
    ).apply {
        setExtra(VkStructureMetadata(
            api = e.getAttributeText("api"),
            structExtends = e.getAttributeText("structextends")
                ?.split(",")
                ?.map { it.trim().intern() }
        ))
    }

private fun extractMember(e: Element) =
    Member(
        name = e.getFirstElement("name")!!.textContent.trim(),
        type = extractType(e.getFirstElement("type")!!),
        values = e.getAttributeText("values")?.intern(),
        len = e.getAttributeText("len")?.split(",")?.map { it.intern() },
        altLen = e.getAttributeText("altlen"),
        optional = e.getAttributeText("optional") == "true",
        bits = Regex(":(\\d+)$").find(e.textContent)?.let { it.groupValues[1].toInt() },
    ).apply {
        setExtra(VkCommonMetadata(api = e.getAttributeText("api")))
    }

private fun extractVersion(e: Element) =
    VulkanVersion(
        name = e.getAttributeText("name")!!,
        api = e.getAttributeText("api"),
        number = e.getAttributeText("number")!!.toFloat(),
        require = extractRequire(e.getElementList("require"))
    )

private fun extractExtension(e: Element) =
    Extension(
        name = e.getAttributeText("name")!!,
        api = e.getAttributeText("api"),
        number = e.getAttributeText("number")!!.parseDecOrHex(),
        type = e.getAttributeText("type"),
        author = e.getAttribute("author"),
        contact = e.getAttribute("contact"),
        platform = e.getAttributeText("platform"),
        requires = e.getAttributeText("requires"),
        requiresCore = e.getAttributeText("requiresCore"),
        deprecatedby = e.getAttributeText("deprecatedby"),
        obsoletedby = e.getAttributeText("obsoletedby"),
        promotedto = e.getAttributeText("promotedto"),
        supported = e.getAttributeText("supported")!!,
        provisional = e.getAttributeText("provisional") == "true",
        require = extractRequire(e.getElementList("require")),
    )

private fun extractRequire(es: List<Element>): Require {
    val commands = mutableSetOf<Identifier>()
    val types = mutableSetOf<String>()
    val values = mutableListOf<RequireValue>()

    for (e in es) {
        commands.addAll(e.getElementList("command").map { it.getAttributeText("name")!!.intern() })
        types.addAll(e.getElementList("type").map { it.getAttributeText("name")!! })
        values.addAll(
            e.getElementList("enum")
                .map(::extractRequireValue)
                .filter { it != null }
                .map { it!! }
        )
    }

    return Require(
        commands = commands,
        types = types,
        values = values
    )
}

private fun extractRequireValue(e: Element): RequireValue? {
    if (e.hasAttribute("alias")) {
        return null
    }

    val value = e.getAttributeText("value")
    if (value != null && value.startsWith('"')) {
        return null
    }

    return RequireValue(
        name = e.getAttributeText("name")!!,
        api = e.getAttributeText("api"),
        extends = e.getAttributeText("extends")?.intern(),
        value = value?.parseDecOrHex(),
        bitpos = e.getAttributeText("bitpos")?.parseDecOrHex(),
        extNumber = e.getAttributeText("extnumber")?.parseDecOrHex(),
        offset = e.getAttributeText("offset")?.parseDecOrHex(),
        negative = e.getAttributeText("dir") == "-",
    )
}

private fun extractType(e: Element): Type {
    val identifier = IdentifierType(e.textContent.trim().replace("FlagBits", "Flags").intern())

    // Array types, e.g.:
    // `<type>float</type> <name>matrix</name>[3][4]`
    // `<type>uint8_t</type> <name>deviceUUID</name>[<enum>VK_UUID_SIZE</enum>]`
    if (e.parentNode is Element) {
        val contents =
            e.parentNode.childNodes
                .toList()
                .filter { it.nodeType == Node.TEXT_NODE || (it is Element && it.tagName == "enum") }
                .joinToString("") { it.textContent }
        val lengths =
            Regex("\\[([^]]+)]")
                .findAll(contents)
                .map { it.groups[1]!!.value.intern() }
                .toList()
                .reversed()
        if (lengths.isNotEmpty()) {
            var array = ArrayType(identifier, lengths[0])
            lengths.subList(1, lengths.size).forEach { array = ArrayType(array, it) }
            return array
        }
    }

    // Pointer types, e.g.:
    // `<type>void</type>*`
    // `const <type>char</type>* const*`
    val next = e.nextSibling?.textContent?.trim()
    if (next != null && next.startsWith("*")) {
        val previous = e.previousSibling ?: e.parentNode
        val const = previous?.textContent?.contains("const") ?: false
        val pointer = PointerType(identifier, const)
        return when {
            next.startsWith("* const*") -> PointerType(pointer, true)
            next.startsWith("**") -> PointerType(pointer, const)
            else -> pointer
        }
    }

    return identifier
}
