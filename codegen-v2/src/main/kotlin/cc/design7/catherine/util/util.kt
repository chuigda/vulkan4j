package cc.design7.catherine.util

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
