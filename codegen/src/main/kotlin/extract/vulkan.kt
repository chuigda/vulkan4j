package extract

import ArrayType
import Bitflag
import Bitmask
import Function
import IdentifierType
import Param
import PointerType
import Registry
import Type
import TypeAlias
import getAttributeNonNull
import getAttributeNullable
import getElementText
import getFirstElementByTagName
import getOnlyElementByTagName
import org.w3c.dom.Element
import org.w3c.dom.Node
import parseIntOrDefault
import parseIntOrNull
import putEntity
import putEntityIfAbsent
import toElementList
import toList

fun extractVulkanRegistry(fileContent: String): Registry {
    val xml = parseXML(fileContent)

    val typesElement = xml.getOnlyElementByTagName("types")
    val typeElementList= typesElement.getElementsByTagName("type").toElementList()
    val enumsElementList = xml.getElementsByTagName("enums").toElementList()

    // 抽取：类型别名

    val aliases = mutableMapOf<String, TypeAlias>()
    for (typeNode in typeElementList) {
        if (!typeNode.hasAttribute("alias") || !typeNode.hasAttribute("name")) {
            continue
        }

        aliases.putEntity(extractTypeAlias(typeNode))
    }

    // 抽取：位掩模

    val bitmasks = mutableMapOf<String, Bitmask>()
    for (enumsElement in enumsElementList) {
        if (!enumsElement.hasAttribute("type")) {
            continue
        }

        val enumsElementType = enumsElement.getAttributeNonNull("type")
        if (enumsElementType == "bitmask") {
            bitmasks.putEntity(extractBitmask(enumsElement))
        }
    }

    for (typeElement in typeElementList) {
        if (typeElement.getAttributeNullable("category") == "bitmask"
            && !typeElement.hasAttribute("alias")) {
            bitmasks.putEntityIfAbsent(extractBitmaskType(typeElement))
        }
    }

    // 抽取：函数

    val commandsElement = xml.getOnlyElementByTagName("commands")
    val commandElementList = commandsElement.getElementsByTagName("command").toElementList()
    val commands = mutableMapOf<String, Function>()

    for (commandNode in commandElementList) {
        if (commandNode.hasAttribute("alias")) {
            continue
        }

        if (commandNode.hasAttribute("api") && commandNode.getAttributeNonNull("api") != "vulkan") {
            continue
        }

        commands.putEntity(extractCommand(commandNode))
    }

    TODO()
}

fun extractTypeAlias(element: Element) = TypeAlias(
    name=element.getAttributeNonNull("name"),
    api=element.getAttributeNullable("api"),
    target=IdentifierType(element.getAttributeNonNull("alias"))
)

fun extractBitmask(element: Element) = Bitmask(
    name=element.getAttributeNonNull("name"),
    api=element.getAttributeNullable("api"),
    bitflags=element.getElementsByTagName("enum")
        .toElementList()
        .filter { !it.hasAttribute("alias") }
        .map { extractBitflag(it) },
    bitwidth=element.getAttributeNullable("bitwidth").parseIntOrNull()
)

fun extractBitmaskType(element: Element) = Bitmask(
    name=element.getOnlyElementByTagName("name").textContent.trim(),
    api=element.getAttributeNullable("api"),
    bitflags=emptyList(),
    bitwidth=null,
    requireFlagBits=(if (element.hasAttribute("requires")) {
        element.getAttributeNonNull("requires")
    } else if (element.hasAttribute("bitvalues")) {
        element.getAttributeNonNull("bitvalues")
    } else {
        null
    })
)

fun extractBitflag(element: Element) = Bitflag(
    name=element.getAttributeNonNull("name"),
    value=(if (element.hasAttribute("bitpos")) {
        1.shl(element.getAttributeNonNull("bitpos").toInt())
    } else {
        element.getAttributeNullable("value").parseIntOrDefault(0)
    }).toString()
)

fun extractCommand(commandElement: Element): Function {
    val protoElement = commandElement.getOnlyElementByTagName("proto")
    val name = commandElement.getFirstElementByTagName("name").textContent.trim()
    val api = commandElement.getAttributeNullable("api")

    val params = commandElement.getElementsByTagName("param")
        .toElementList()
        .filter { it.parentNode.nodeName != "implicitexternsyncparams" }
        .map { extractParam(it) }
    postprocessOptionalParams(params)
    val result = extractType(protoElement.getOnlyElementByTagName("type"))

    val successCodes = commandElement.getAttributeNullable("successcodes")?.split(',') ?: null
    val errorCodes = commandElement.getAttributeNullable("errorcodes")?.split(',') ?: null

    return Function(
        name=name,
        api=api,
        params=params,
        result=result,
        successResult=successCodes,
        errorResult=errorCodes
    )
}

fun extractParam(paramElement: Element) = Param(
    name = paramElement.getOnlyElementByTagName("name").textContent.trim(),
    api = paramElement.getAttributeNullable("api"),
    type = extractType(paramElement.getOnlyElementByTagName("type")),
    len = paramElement.getAttributeNullable("len"),
    optional = paramElement.getAttributeNullable("optional")?.startsWith("true") ?: false
)

fun postprocessOptionalParams(paramList: List<Param>) {
    for (param in paramList) {
        if (param.optional || param.len == null) {
            continue
        }

        for (tmp in paramList) {
            if (tmp != param && tmp.name == param.len && tmp.optional) {
                param.optional = true
                break
            }
        }
    }
}

fun extractType(typeElement: Element): Type {
    fun isPotentialArrayDeclaratorElement(node: Node) = when (node.nodeType) {
        Node.TEXT_NODE -> {
            val text = node.textContent.trim()
            text.startsWith("[") && text.endsWith("]")
        }
        Node.ELEMENT_NODE -> node.nodeName == "enum"
        else -> false
    }

    fun mapArrayLengthPart(part: String) = if (part.startsWith("[") && part.endsWith("]")) {
        part.substring(1, part.length - 1).split("][")
    } else {
        listOf(part)
    }

    val identifier = typeElement.getElementText()

    val parentNode = typeElement.parentNode
    if (parentNode != null) {
        val lengthParts = parentNode.childNodes.toList()
            .filter { isPotentialArrayDeclaratorElement(it) }
            .map { it.textContent.trim() }

        if (lengthParts.isNotEmpty()) {
            val lengths = lengthParts
                .flatMap { mapArrayLengthPart(it) }
                .reversed()

            var arrayType = ArrayType(IdentifierType(identifier), lengths[0])
            for (i in 1 until lengths.size) {
                arrayType = ArrayType(arrayType, lengths[i])
            }
            return arrayType
        }
    }

    val nextNodeText = typeElement.nextSibling?.textContent?.trim() ?: ""
    if (nextNodeText.startsWith('*')) {
        val const = typeElement.previousSibling?.textContent?.contains("const") ?: false
        val pointerType = PointerType(IdentifierType(identifier), const)

        return if (nextNodeText.startsWith("* const*")) {
            PointerType(pointerType, true)
        } else if (nextNodeText.startsWith("**")) {
            PointerType(pointerType, false)
        } else {
            pointerType
        }
    }

    return IdentifierType(identifier)
}
