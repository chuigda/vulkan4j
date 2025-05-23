package club.doki7.babel.util

import org.intellij.lang.annotations.Language
import org.w3c.dom.Element
import org.w3c.dom.Node
import org.w3c.dom.NodeList
import org.xml.sax.InputSource
import java.io.StringReader
import javax.xml.parsers.DocumentBuilderFactory
import javax.xml.xpath.XPathConstants
import javax.xml.xpath.XPathFactory

fun String.parseXML(): Element {
    val builder = DocumentBuilderFactory.newInstance().newDocumentBuilder()
    return builder.parse(InputSource(StringReader(this))).documentElement
}

fun Element.getAttributeText(name: String): String? =
    if (hasAttribute(name)) {
        getAttribute(name)
    } else {
        null
    }

fun Element.getFirstElement(tag: String): Element? = getElementSeq(tag).firstOrNull()

fun Element.getElementSeq(tag: String) = getElementsByTagName(tag)
    .asSequence()
    .filter { it is Element }
    .map { it as Element }

fun Node.query(@Language("XPath") xpath: String): Sequence<Element> {
    return (XPathFactory
        .newInstance()
        .newXPath()
        .evaluate(xpath, this, XPathConstants.NODESET) as NodeList)
        .asSequence()
        .map { it as Element }
}

fun NodeList.toList() = mutableListOf<Node>().apply {
    for (i in 0 until length) {
        add(item(i))
    }
}

operator fun NodeList.iterator(): Iterator<Node> = object : Iterator<Node> {
    private var nextIndex = 0

    override fun next(): Node {
        val value = this@iterator.item(nextIndex)
        nextIndex ++
        return value
    }

    override fun hasNext(): Boolean = nextIndex < this@iterator.length
}

fun NodeList.asSequence(): Sequence<Node> = Sequence { this@asSequence.iterator() }
