package extract

import org.w3c.dom.Element
import javax.xml.parsers.DocumentBuilderFactory

fun parseXML(s: String): Element {
    val builder = DocumentBuilderFactory.newInstance().newDocumentBuilder()
    return builder.parse(s.byteInputStream()).documentElement
}

fun Element.getAttributeText(name: String): String? = if (hasAttribute(name)) getAttribute(name) else null
