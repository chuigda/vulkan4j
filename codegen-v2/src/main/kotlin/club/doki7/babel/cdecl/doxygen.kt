package club.doki7.babel.cdecl

fun parseBlockDoxygen(lines: List<String>, startLine: Int): Pair<List<String>, Int> {
    val doxygen = mutableListOf<String>()

    var line = startLine
    while (line < lines.size) {
        val curLine = lines[line]
        if (curLine.endsWith("*/")) {
            val lineDoc = if (curLine.startsWith("* ")) {
                curLine.substring(2, curLine.length - 2)
            } else {
                curLine.substring(0, curLine.length - 2)
            }
            doxygen.add(doxygen2javadoc(lineDoc).trim())
            line++
            break
        }

        val lineDoc = if (curLine.startsWith("/**")) {
            curLine.substring(3)
        } else if (curLine.startsWith("* ")) {
            curLine.substring(2)
        } else {
            curLine
        }
        doxygen.add(doxygen2javadoc(lineDoc).trim())
        line++
    }

    return Pair(doxygen, line)
}

fun parseTriSlashDoxygen(lines: List<String>, startLine: Int): Pair<List<String>, Int> {
    val doxygen = mutableListOf<String>()

    val line = startLine
    while (line < lines.size) {
        val curLine = lines[line]
        if (!curLine.startsWith("///")) {
            break
        }
        doxygen.add(doxygen2javadoc(curLine.substring(3)).trim())
    }

    return Pair(doxygen, line)
}

fun doxygen2javadoc(doxygen: String): String {
    return doxygen
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
}
