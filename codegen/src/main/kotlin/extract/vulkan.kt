package extract

import Bitflag
import Bitmask
import IdentifierType
import Registry
import TypeAlias
import getChildElementTextByTagName
import org.w3c.dom.Element
import org.w3c.dom.NodeList
import parseIntOrDefault
import parseIntOrNull

fun extractVulkanRegistry(fileContent: String): Registry {
    val xml = parseXML(fileContent)
    val childCount = xml.childNodes.length

    val typesNode = xml.getElementsByTagName("types").item(0)
    if (typesNode !is Element) {
        throw RuntimeException("types element not found")
    }
    val types= typesNode.getElementsByTagName("type")

    val aliases = mutableMapOf<String, TypeAlias>()
    for (i in 0 until types.length) {
        val typeNode = types.item(i)
        if (typeNode !is Element
            || !typeNode.hasAttribute("alias")
            || !typeNode.hasAttribute("name")) {
            continue
        }

        val opaqueTypedef = extractTypeAlias(typeNode)
        aliases.put(opaqueTypedef.name, opaqueTypedef)
    }

    TODO()
}

fun extractTypeAlias(element: Element): TypeAlias = TypeAlias(
    name=element.getAttribute("name"),
    api=element.getAttribute("api"),
    target=IdentifierType(element.getAttribute("alias"))
)

fun extractBitmask(element: Element): Bitmask = Bitmask(
    name=element.getChildElementTextByTagName("name"),
    api=element.getAttribute("api"),
    bitflags=extractBitflagList(element.getElementsByTagName("enum")),
    bitwidth=element.getAttribute("bitwidth").parseIntOrNull()
)

fun extractBitmaskType(element: Element): Bitmask = Bitmask(
    name=element.getChildElementTextByTagName("name"),
    api=element.getAttribute("api"),
    bitflags=emptyList(),
    bitwidth=null,
    requireFlagBits=(if (element.hasAttribute("requires")) {
        element.getAttribute("requires")
    } else if (element.hasAttribute("bitpos")) {
        element.getAttribute("bitpos")
    } else {
        null
    })
)

fun extractBitflagList(nodeList: NodeList): List<Bitflag> {
    val bitmasks = mutableListOf<Bitflag>()
    for (i in 0 until nodeList.length) {
        val node = nodeList.item(i)
        if (node !is Element || !node.hasAttribute("alias")) {
            continue
        }

    }
    return bitmasks
}

fun extractBitflag(element: Element): Bitflag = Bitflag(
    name=element.getAttribute("name"),
    value=(if (element.hasAttribute("bitpos")) {
        1.shl(element.getAttribute("bitpos").toInt())
    } else {
        element.getAttribute("value").parseIntOrDefault(0)
    }).toString()
)
