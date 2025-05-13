package cc.design7.babel.util

import org.intellij.lang.annotations.Language

sealed interface Doc

private val nl: Doc = EmptyLine()

class DocList(val segments: MutableList<Doc>) : Doc {
    operator fun String.unaryPlus() = segments.add(if (this.isEmpty()) nl else DocText(this))
    operator fun Doc.unaryPlus() = segments.add(this)

    inline fun indent(init: DocList.() -> Unit) {
        val doc = DocList(mutableListOf())
        doc.init()
        segments.add(DocIndent(doc))
    }
}

class DocText(val text: String) : Doc

class DocIndent(val inner: Doc): Doc

private class EmptyLine : Doc

inline fun buildDoc(init: DocList.()-> Unit): DocList {
    val doc = DocList(mutableListOf())
    doc.init()
    return doc
}

fun render(doc: Doc): String {
    val sb = StringBuilder()
    renderImpl(sb, doc, 0)
    return sb.toString()
}

fun renderImpl(sb: StringBuilder, doc: Doc, indent: Int) {
    when(doc) {
        is DocList -> {
            for (segment in doc.segments) {
                renderImpl(sb, segment, indent)
            }
        }
        is DocText -> {
            sb.repeat("    ", indent)
            sb.append(doc.text.trim())
            sb.append("\n")
        }
        is DocIndent -> {
            renderImpl(sb, doc.inner, indent + 1)
        }
        is EmptyLine -> sb.append("\n")
    }
}

fun String.parseDecOrHex() = when {
    startsWith("0x") -> substring(2).toLong(16)
    else -> toLong()
}
