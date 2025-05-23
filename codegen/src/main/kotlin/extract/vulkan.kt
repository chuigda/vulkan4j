package extract

import ArrayType
import Bitflag
import Bitmask
import Command
import Constant
import Enumeration
import FunctionTypedef
import IdentifierType
import Param
import PointerType
import Registry
import Type
import TypeAlias
import Variant
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

    // 抽取：命令

    val commandsElement = xml.getOnlyElementByTagName("commands")
    val commandElementList = commandsElement.getElementsByTagName("command").toElementList()
    val commands = mutableMapOf<String, Command>()

    for (commandNode in commandElementList) {
        if (commandNode.hasAttribute("alias")) {
            continue
        }

        if (commandNode.hasAttribute("api") && commandNode.getAttributeNonNull("api") != "vulkan") {
            continue
        }

        commands.putEntity(extractCommand(commandNode))
    }

    // 抽取：命令别名
    val commandAliases = mutableMapOf<String, String>()
    for (commandNode in commandElementList) {
        if (!commandNode.hasAttribute("alias")) {
            continue
        }

        val name = commandNode.getAttributeNonNull("name")
        val alias = commandNode.getAttributeNonNull("alias")

        if (alias !in commands) {
            throw RuntimeException("Alias target command $alias not found")
        }

        commandAliases.put(name, alias)
    }

    // 抽取：常量
    val constants = mutableMapOf<String, Constant>()
    for (enumsElement in enumsElementList) {
        if (enumsElement.getAttributeNullable("name") == "API Constants") {
            for (constantElement in enumsElement.getElementsByTagName("enum").toElementList()) {
                if (constantElement.hasAttribute("alias")) {
                    continue
                }

                constants.putEntity(extractConstant(constantElement))
            }
        }
    }

    // 抽取：枚举

    val enumerations = mutableMapOf<String, Enumeration>()
    for (enumsElement in enumsElementList) {
        if (enumsElement.getAttributeNullable("type") == "enum") {
            enumerations.putEntity(extractEnumeration(enumsElement))
        }
    }

    // 抽取：函数

    val functionTypedefs = mutableMapOf<String, FunctionTypedef>()
    for (typeElement in typeElementList) {
        if (typeElement.getAttributeNullable("category") != "funcpointer"
            || typeElement.hasAttribute("alias")) {
            continue
        }

        functionTypedefs.putEntity(extractFunctionTypedef(typeElement))
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

fun extractCommand(commandElement: Element): Command {
    val protoElement = commandElement.getOnlyElementByTagName("proto")
    val name = commandElement.getFirstElementByTagName("name").textContent.trim()
    val api = commandElement.getAttributeNullable("api")

    val params = commandElement.getElementsByTagName("param")
        .toElementList()
        .filter { it.parentNode.nodeName != "implicitexternsyncparams" }
        .map { extractParam(it) }
    postprocessOptionalParams(params)
    val result = extractType(protoElement.getOnlyElementByTagName("type"))

    val successCodes = commandElement.getAttributeNullable("successcodes")?.split(',')
    val errorCodes = commandElement.getAttributeNullable("errorcodes")?.split(',')

    return Command(
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

fun extractConstant(constantElement: Element): Constant {
    val name = constantElement.getAttributeNonNull("name")
    val api = constantElement.getAttributeNullable("api")
    val value = constantElement.getAttributeNonNull("value")
    val type = IdentifierType(if (name == "VK_TRUE" || name == "VK_FALSE") {
        "uint32_t"
    } else if (name != "WHOLE_SIZE" && (name.startsWith("VK_MAX") || name.endsWith("SIZE"))) {
        "size_t"
    } else if ("ULL" in value) {
        "uint64_t"
    } else if ("UL" in value) {
        "uint32_t"
    } else if ('f' in value || 'F' in value) {
        "float"
    } else {
        "int32_t"
    })

    return Constant(name=name, api=api, type=type, expr=value)
}

fun extractEnumeration(enumerationElement: Element) = Enumeration(
    name=enumerationElement.getAttributeNonNull("name"),
    api=enumerationElement.getAttributeNullable("api"),
    variants=enumerationElement.getElementsByTagName("enum")
        .toElementList()
        .filter { !it.hasAttribute("alias") }
        .map { Variant(
            name=it.getAttributeNonNull("name"),
            api=it.getAttributeNullable("api"),
            value=it.getAttributeNonNull("value")
        ) }
)

fun extractFunctionTypedef(functionTypedefElement: Element): FunctionTypedef {
    val name = functionTypedefElement.getFirstElementByTagName("name").textContent.trim()
    val api = functionTypedefElement.getAttributeNullable("api")
    val params = functionTypedefElement.getElementsByTagName("param")
        .toElementList()
        .map { extractParam(it) }

    val textContent = functionTypedefElement.textContent
    val returnTypeText = textContent.substring(8, textContent.indexOf("(VKAPI_PTR")).trim()
    val returnType = when (returnTypeText) {
        "void" -> null
        "void*" -> PointerType(pointee=IdentifierType("void"), const=false)
        "VkBool32" -> IdentifierType("VkBool32")
        "PFN_vkVoidFunction" -> IdentifierType("PFN_vkVoidFunction")
        else -> throw RuntimeException("Unsupported function pointer result type: ${returnTypeText}")
    }

    return FunctionTypedef(
        name=name,
        api=api,
        params=params,
        result=returnType
    )
}
