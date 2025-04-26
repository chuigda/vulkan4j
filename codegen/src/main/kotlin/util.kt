import org.w3c.dom.Element

fun StringBuilder.appendLn(str: String) {
    append(str)
    append("\n")
}

fun StringBuilder.appendLn() {
    append("\n")
}

fun String.parseIntOrNull(): Int? = if (this.isEmpty()) null else this.toInt()

fun String.parseIntOrDefault(default: Int): Int = try {
    this.toInt()
} catch (e: NumberFormatException) {
    default
}

fun Element.getChildElementTextByTagName(tagName: String): String {
    val elements = getElementsByTagName(tagName)
    if (elements.length == 0) {
        throw RuntimeException("Child node with tag name $tagName not found")
    }
    val element = elements.item(0)
    if (element is Element) {
        return element.textContent
    }

    throw RuntimeException("Child node with tag name $tagName is not an Element")
}
