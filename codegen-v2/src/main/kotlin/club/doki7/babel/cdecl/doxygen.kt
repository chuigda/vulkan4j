package club.doki7.babel.cdecl

fun parseBlockDoxygen(lines: List<String>, startLine: Int): Pair<List<String>?, Int> {
    val doxygen = mutableListOf<String>()

    var line = startLine
    while (line < lines.size) {
        val curLine = lines[line]
        if (curLine.endsWith("*/")) {
            val lineDoc = if (curLine.startsWith("/**") || curLine.startsWith("/*!")) {
                    curLine.substring(3, curLine.length - 2)
            } else if (curLine.startsWith("* ")) {
                curLine.substring(2, curLine.length - 2)
            } else {
                curLine.substring(0, curLine.length - 2)
            }
            doxygen.add(doxygen2javadoc(lineDoc).trim())
            line++
            break
        }

        val lineDoc = if (curLine.startsWith("/**") || curLine.startsWith("/*!")) {
            curLine.substring(3)
        } else if (curLine.startsWith("* ")) {
            curLine.substring(2)
        } else {
            curLine
        }

        lineDoc.split("\\n").forEachIndexed { i, it ->
            doxygen.add(doxygen2javadoc(it).trim())
        }
        line++
    }

    while (doxygen.isNotEmpty() && doxygen.first().isBlank()) {
        doxygen.removeFirst()
    }

    while (doxygen.isNotEmpty() && doxygen.last().isBlank()) {
        doxygen.removeLast()
    }

    if (doxygen.isEmpty()) {
        return Pair(null, line)
    }
    return Pair(doxygen, line)
}

fun parseTriSlashDoxygen(lines: List<String>, startLine: Int): Pair<List<String>?, Int> {
    val doxygen = mutableListOf<String>()

    var line = startLine
    while (line < lines.size) {
        val curLine = lines[line]
        if (!curLine.startsWith("///")) {
            break
        }

        curLine.substring(3).split("\\n").forEachIndexed { i, it ->
            doxygen.add(doxygen2javadoc(it).trim())
        }
        line++
    }

    while (doxygen.isNotEmpty() && doxygen.first().isBlank()) {
        doxygen.removeFirst()
    }

    while (doxygen.isNotEmpty() && doxygen.last().isBlank()) {
        doxygen.removeLast()
    }

    if (doxygen.isEmpty()) {
        return Pair(null, line)
    }
    return Pair(doxygen, line)
}

fun doxygen2javadoc(doxygen: String): String {
    var tmp = doxygen
    while (true) {
        val index = tmp.indexOf("#")
        if (index == -1) {
            break
        }

        var end = index + 1
        while (end < tmp.length && (tmp[end].isIdentChar())) {
            end++
        }

        if (end == index + 1) {
            break
        }

        val name = tmp.substring(index + 1, end)
        tmp = tmp.replace("#$name", "{@code $name}")
    }

    return tmp
        .replace("\\brief", "")
        .replace("\\ref", "")
        .replace("\\note", "@apiNode")
        .replace("\\param", "@param")
        .replace("\\return", "@return")
        .replace("\\deprecated", "@deprecated")
        .replace("\\section", "###")
        .replace("\\warning", "<b>Warning: </b>")
        .replace("\\code", "{@snippet lang=c:")
        .replace("\\endcode", "}")
        .replace("[DEPRECATED]", "(deprecated)")
}
