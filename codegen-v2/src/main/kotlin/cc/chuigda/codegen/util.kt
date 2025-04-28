package cc.chuigda.codegen

import org.intellij.lang.annotations.Language
import org.w3c.dom.Element
import org.w3c.dom.Node
import org.w3c.dom.NodeList
import org.xml.sax.InputSource
import java.io.StringReader
import javax.xml.parsers.DocumentBuilderFactory
import javax.xml.xpath.XPathConstants
import javax.xml.xpath.XPathFactory

sealed class Either<T1, T2> {
    class Left<T1, T2>(val value: T1) : Either<T1, T2>()
    class Right<T1, T2>(val value: T2) : Either<T1, T2>()

    override fun toString(): String {
        return when (this) {
            is Left -> "$value"
            is Right -> "$value"
        }
    }
}

fun String.parseXML(): Element {
    val builder = DocumentBuilderFactory.newInstance().newDocumentBuilder()
    return builder.parse(InputSource(StringReader(this))).documentElement
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

fun Node.query(@Language("XPath") xpath: String): List<Element> {
    return (XPathFactory
        .newInstance()
        .newXPath()
        .evaluate(xpath, this, XPathConstants.NODESET) as NodeList)
        .toList()
        .map { it as Element }
}

fun NodeList.toList() = mutableListOf<Node>().apply {
    for (i in 0 until length) {
        add(item(i))
    }
}

sealed class Doc

private val nl: Doc = EmptyLine()

class DocList(val segments: MutableList<Doc>) : Doc() {
    operator fun String.unaryPlus() = segments.add(DocText(this))
    operator fun Doc.unaryPlus() = segments.add(this)
    fun nl() = segments.add(nl)

    fun indent(init: DocList.() -> Unit) {
        val doc = DocList(mutableListOf())
        doc.init()
        segments.add(doc)
    }
}

class DocText(val text: String) : Doc()

private class EmptyLine : Doc()

fun buildDoc(init: DocList.() -> Unit): Doc {
    val doc = DocList(mutableListOf())
    doc.init()
    return doc
}

fun render(doc: Doc): String {
    val sb = StringBuilder()
    renderImpl(sb, doc, -1)
    return sb.toString()
}

fun renderImpl(sb: StringBuilder, doc: Doc, indent: Int) {
    when(doc) {
        is DocList -> {
            for (segment in doc.segments) {
                renderImpl(sb, segment, indent + 1)
            }
        }
        is DocText -> {
            for (ignored in 0.rangeUntil(indent)) {
                sb.append("    ")
            }
            sb.append(doc.text.trim())
            sb.append("\n")
        }
        is EmptyLine -> sb.append("\n")
    }
}

fun String.parseDecOrHex() = when {
    startsWith("0x") -> substring(2).toLong(16)
    else -> toLong()
}
