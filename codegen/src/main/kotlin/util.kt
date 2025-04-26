import org.w3c.dom.Element
import org.w3c.dom.Node
import org.w3c.dom.NodeList

fun StringBuilder.appendLn(str: String) {
    append(str)
    append("\n")
}

fun StringBuilder.appendLn() {
    append("\n")
}

fun String?.parseIntOrNull(): Int? = if (this == null || this.isEmpty()) null else this.toInt()

fun String?.parseIntOrDefault(default: Int): Int = try {
    if (this == null || this.isEmpty()) {
        default
    } else {
        this.toInt()
    }
} catch (e: NumberFormatException) {
    default
}

fun Element.getOnlyElementByTagName(tagName: String): Element {
    val nodeList = this.getElementsByTagName(tagName)
    assert(nodeList.length == 1)

    return nodeList.item(0) as Element
}

fun Element.getFirstElementByTagName(tagName: String) = this.getElementsByTagName(tagName).item(0) as Element

fun Element.getAttributeNullable(attrName: String): String? =
    if (this.hasAttribute(attrName)) this.getAttribute(attrName) else null

fun Element.getAttributeNonNull(attrName: String): String {
    assert(this.hasAttribute(attrName))

    return this.getAttribute(attrName)
}

fun Element.getElementText(): String {
    assert(this.childNodes.length == 1)
    assert(this.childNodes.item(0).nodeType == Node.TEXT_NODE)

    return this.childNodes.item(0).textContent.trim()
}

fun NodeList.toList(): List<Node> = mutableListOf<Node>().apply {
    for (i in 0 until length) {
        add(item(i))
    }
}

fun NodeList.toElementList(): List<Element> = mutableListOf<Element>().apply {
    for (i in 0 until length) {
        val node = item(i)
        if (node is Element) {
            add(node)
        }
    }
}

fun <T: Entity> MutableMap<String, T>.putEntity(entity: T) = put(entity.name, entity)

fun <T: Entity> MutableMap<String, T>.putEntityIfAbsent(entity: T) = putIfAbsent(entity.name, entity)
