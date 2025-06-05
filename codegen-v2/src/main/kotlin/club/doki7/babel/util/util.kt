package club.doki7.babel.util

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

    inline operator fun String.invoke(block: DocList.() -> Unit) {
        +"$this {"
        indent(block)
        +"}"
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
            for (i in 0 until indent) {
                sb.append("    ")
            }
            sb.append(doc.text.trim())
            sb.append("\n")
        }
        is DocIndent -> {
            renderImpl(sb, doc.inner, indent + 1)
        }
        is EmptyLine -> sb.append("\n")
    }
}

fun Char.isHexDigit(): Boolean = isDigit() || this in 'a'..'f' || this in 'A'..'F'

fun String.isDecOrHexNumber() = when {
    startsWith("0x") -> substring(2).all { it.isHexDigit() }
    else -> all { it.isDigit() }
}

fun String.parseDecOrHex() = when {
    startsWith("0x") -> substring(2).toLong(16)
    else -> toLong()
}

fun commonPrefix(strings: Collection<String>): String {
    if (strings.isEmpty()) {
        return ""
    }
    if (strings.size == 1) {
        return strings.first()
    }

    val shortest = strings.minByOrNull { it.length } ?: return ""
    if (shortest.isEmpty()) {
        return ""
    }

    for (i in shortest.indices) {
        val char = shortest[i]
        for (str in strings) {
            if (i >= str.length || str[i] != char) {
                return shortest.substring(0, i)
            }
        }
    }
    return shortest
}

fun commonPostfix(strings: Collection<String>): String {
    if (strings.isEmpty()) {
        return ""
    }
    if (strings.size == 1) {
        return strings.first()
    }

    val shortest = strings.minByOrNull { it.length } ?: return ""
    if (shortest.isEmpty()) {
        return ""
    }

    for (i in shortest.indices) {
        val char = shortest[shortest.length - 1 - i]
        for (str in strings) {
            if (i >= str.length || str[str.length - 1 - i] != char) {
                return shortest.substring(shortest.length - i)
            }
        }
    }
    return shortest
}
