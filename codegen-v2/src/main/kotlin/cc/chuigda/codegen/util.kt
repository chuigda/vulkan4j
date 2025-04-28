package cc.chuigda.codegen

import org.intellij.lang.annotations.Language
import org.w3c.dom.Element
import org.w3c.dom.Node
import org.w3c.dom.NodeList
import javax.xml.xpath.XPathConstants
import javax.xml.xpath.XPathFactory

sealed class Either<T1, T2> {
    class Left<T1, T2>(val value: T1) : Either<T1, T2>()
    class Right<T1, T2>(val value: T2) : Either<T1, T2>()
}

fun Element.getAttributeText(name: String): String? = if (hasAttribute(name)) getAttribute(name) else null

fun Element.getFirstElement(tag: String): Element? = getElementList(tag).firstOrNull()

fun Element.getElementList(tag: String) = mutableListOf<Element>().apply {
    val elements = getElementsByTagName(tag)
    for (i in 0 until elements.length) {
        val node = elements.item(i)
        if (node is Element) {
            add(node)
        }
    }
}

fun Node.query(@Language("XPath") xpath: String) = mutableListOf<Element>().apply {
    val nodeList = (XPathFactory.newInstance()
        .newXPath()
        .evaluate(xpath, this, XPathConstants.NODESET) as NodeList)

    for (i in 0 until nodeList.length) {
        val node = nodeList.item(i)
        if (node is Element) {
            add(node)
        }
    }
}
